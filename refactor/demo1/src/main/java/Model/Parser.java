package Model;

import Exceptions.*;
import Utils.Point;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {
    private List<String> file;

    public Parser() {
        this.file = new ArrayList<>();
    }

    public Parser(String db, UMCarroJa model) {
        try {
            List<String> list = new ArrayList<>();
            for (String s : Files
                    .readAllLines(Paths.get(db), StandardCharsets.UTF_8)) {
                String e = s.trim();
                if (!e.startsWith("--")) {
                    if (e.contains(":") && e.contains(",")) {
                        String parseLine = parseLine(e, model);
                        list.add(parseLine);
                    }
                }
            }
            this.file = list;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String parseLine(String l, UMCarroJa model){
        String[] pLine = l.split(":");
        String categoria = pLine[0];
        String[] content = pLine[1].split(",");
        try {
            switch (categoria) {
                case "NovoProp":
                    newOwner(model, content);
                    break;
                case "NovoCliente":
                    newClient(model, content);
                    break;
                case "NovoCarro":
                    newCar(model, content);
                    break;
                case "Aluguer":
                    newRental(model, content);
                    break;
                case "Classificar":
                    if (content.length == 2) {
                        model.rate(content[0], Integer.parseInt(content[1]));
                    }
                    break;
            }
        }
        catch (InvalidUserException
                | UserExistsException
                | CarExistsException
                | UnknownCarTypeException
                | UnknownCompareTypeException
                | InvalidCarException ignored) {}
        return l;
    }

    private void newRental(UMCarroJa model, String[] content) throws UnknownCompareTypeException, InvalidUserException, UnknownCarTypeException {
        if (content.length == 5) {
            try {
                model.rental(content[0] + "@gmail.com",
                        new Point(Double.parseDouble(content[1]), Double.parseDouble(content[2])),
                        content[4],
                        Vehicle.CarType.fromString(content[3]));
            } catch (NoCarAvaliableException ignored) {
            }
        }
    }

    private void newCar(UMCarroJa model, String[] content) throws CarExistsException, InvalidUserException, UnknownCarTypeException {
        if (content.length == 10) {
            Vehicle vehicle = new Vehicle(content[1],
                    Vehicle.CarType.fromString(content[0]),
                    Double.parseDouble(content[4]),
                    Double.parseDouble(content[6]),
                    Integer.parseInt(content[7]));
            model.addCar(
                    content[2],
                    content[3] + "@gmail.com",
                    vehicle,
                    Double.parseDouble(content[5]),
                    new Point(Double.parseDouble(content[8])
                            , Double.parseDouble(content[9]))
            );
        }
    }

    private void newClient(UMCarroJa model, String[] content) throws UserExistsException {
        if (content.length == 6) {
            model.addUser(new Client(
                    new Point(Double.parseDouble(content[4]), Double.parseDouble(content[5])),
                    content[2],
                    content[2],
                    content[0],
                    content[3],
                    Integer.parseInt(content[1])
            ));
        }
    }

    private void newOwner(UMCarroJa model, String[] content) throws UserExistsException {
        if (content.length == 4) {
            model.addUser(new Owner(
                    content[2],
                    content[0],
                    content[3],
                    Integer.parseInt(content[1]),
                    content[2]
            ));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
			return true;
		}

        if (o == null || getClass() != o.getClass()) {
			return false;
		}

        Parser parser = (Parser) o;
        return this.file.equals(parser.file);
    }
}
