package Controller;

import Exceptions.*;
import Model.*;
import View.Menu;
import View.ViewModel.*;

import java.util.*;
import java.util.stream.Collectors;

public class Controller {
    private final UMCarroJa model;
    private User user;
    private final Menu menu;

    public Controller(UMCarroJa model) {
        this.menu = new Menu();
        this.model = model;
    }

    public void run(){
        String error = "";
        while(this.menu.getRun()) {
            switch (menu.getMenu()) {
                case Login:
                    error = login(error);
                    break;
                case RegisterClient:
                    error = registerClient(error);
                    break;
                case RegisterOwner:
                    error = registerOwner(error);
                    break;
                case Closest:
                    error = rentCar(error, "MaisPerto");
                    break;
                case Cheapest:
                    error = rentCar(error, "MaisBarato");
                    break;
                case ReviewRental:
                    error = reviewRental(error);
                break;
                case CheapestNear:
                    error = cheapestNear(error);
                    break;
                case Autonomy:
                    error = autonomy(error);
                    break;
                case Specific:
                    error = specific(error);
                    break;
                case AddCar:
                    error = addCar(error);
                    break;
                case NUses:
                    nUses();
                    break;
                case Distance:
                    distance();
                    break;
                case CarOverview:
                    error = carOverview(error);
                    break;
                case Pending:
                    error = pending(error);
                    break;
                case HistoryOwner:
                    error = historyOwner(error);
                    break;
                case HistoryClient:
                    error = historyClient(error);
                    break;
                default:
                    this.menu.parser();
                    break;
            }
        }
    }

    private String login(String error) {
        try {
            NewLogin r = menu.newLogin(error);
            user = model.logIn(r.getUser(), r.getPassword());
            menu.selectOption((user instanceof Client)? Menu.MenuInd.Client : Menu.MenuInd.Owner);
            error = "";
        }
        catch (InvalidUserException e){ error = "Invalid Username"; }
        catch (WrongPasswordExecption e){ error = "Invalid Password"; }
        return error;
    }

    private String registerClient(String error) {
        try {
            RegisterUser registerUserCli = menu.newRegisterUser(error);
            Client client = new Client(
                    registerUserCli.getPos(),
                    registerUserCli.getEmail(),
                    registerUserCli.getPasswd(),
                    registerUserCli.getName(),
                    registerUserCli.getAddress(),
                    registerUserCli.getNif()
            );
            this.model.addUser(client);
            menu.back();
            error = "";
        }
        catch (InvalidNewRegisterException e){ error = "Parametros Inválidos"; }
        catch (UserExistsException e){ error = "Utilizador já existe"; }
        return error;
    }

    private String registerOwner(String error) {
        try {
            RegisterUser registerUserProp = menu.newRegisterUser(error);
            Owner owner = new Owner(
                    registerUserProp.getEmail(),
                    registerUserProp.getName(),
                    registerUserProp.getAddress(),
                    registerUserProp.getNif(),
                    registerUserProp.getPasswd()
            );
            this.model.addUser(owner);
            menu.back();
            error = "";
        }
        catch (InvalidNewRegisterException e){ error = "Parametros Inválidos"; }
        catch (UserExistsException e){ error = "Utilizador já existe"; }
        return error;
    }

    private String rentCar(String error, String maisPerto) {
        try {
            RentCarSimple rent = menu.simpleCarRent(error);
            Rental rental = model.rental(
                    (Client) user,
                    rent.getPoint(),
                    maisPerto,
                    rent.getCarType());
            menu.showString(rental.toString());
            menu.back();
            error = "";
        } catch (UnknownCompareTypeException ignored) {
        } catch (NoCarAvaliableException e) {
            error = "No cars availables";
        } catch (InvalidNewRentalException e) {
            error = "Novo Rental inválido";
        }
        return error;
    }

    private String reviewRental(String error) {
        Owner owner = (Owner)this.user;
        ArrayList<Rental> lR = owner.getPending();
        if (lR.isEmpty()){
            this.menu.back();
            return error;
        }
        List<List<String>> list = new ArrayList<>();
        for (Rental rental : lR) {
            String x = rental.toParsableUserString();
            List<String> strings = Arrays.asList(x.split("\n"));
            list.add(strings);
        }
        String v = menu.reviewRentShow(
                error,
                owner.getRates(),
                list);

        try {
            switch (v.charAt(0)) {
                case 'a':
                    this.model.rent(lR.get(Integer.parseInt(v.substring(1)) - 1));
                    this.model.rate(
                            owner,
                            lR.get(Integer.parseInt(v.substring(1)) - 1),
                            this.menu.showRentalRate(
                                    lR.get(Integer.parseInt(v.substring(1)) - 1).toFinalString()));
                    break;
                case 'r':
                    this.model.refuse(owner, lR.get(Integer.parseInt(v.substring(1)) - 1));
                    break;
                case 'b':
                    this.menu.back();
                    break;
            }
            error = "";
        }
        catch(NumberFormatException | IndexOutOfBoundsException e){error = "Input Inválido";}
        return error;
    }

    private String cheapestNear(String error) {
        try{
            CheapestNearCar walkCar = menu.walkingDistanceRent(error);

            Rental rental = model.rental(
                    (Client)user,
                    walkCar.getPoint(),
                    walkCar.getWalkDistance(),
                    walkCar.getType()
            );

            this.menu.showString(rental.toString());
            this.menu.back();
            error = "";
        }
        catch (InvalidNewRentalException e){error = "New rental inválido";}
        catch (NoCarAvaliableException e)  {error = "No cars availables"; }
        return error;
    }

    private String autonomy(String error) {
        try{
            AutonomyCar autoCar = menu.autonomyCarRent(error);

            Rental rental = model.rental(
                    autoCar.getPoint(),
                    autoCar.getAutonomy(),
                    autoCar.getType(),
                    (Client)user);

            menu.showString(rental.toString());
            this.menu.back();
            error = "";
        }
        catch (InvalidNewRentalException e){error = "New rental inválido";}
        catch (NoCarAvaliableException e) { error = "No cars availables"; }
        return error;
    }

    private String specific(String error) {
        try {
            SpecificCar sc = this.menu.specificCarRent(error);
            Rental rental = this.model.rental(sc.getPoint(), sc.getNumberPlate(), (Client)user);
            this.menu.showString(rental.toString());
            this.menu.back();
            error = "";
        }
        catch (NoCarAvaliableException e) { error = "Carro não está disponível"; }
        catch (InvalidCarException e) { error = "Carro não existe"; }
        catch (InvalidNewRentalException e) { error = "Invalid Parameters"; }
        return error;
    }

    private String addCar(String error) {
        try {
            RegisterCar registerCar = menu.newRegisterCar(error);
            Owner ownerCar = (Owner)this.user;
            Vehicle vehicle = new Vehicle(
                    registerCar.getBrand(),
                    registerCar.getType(),
                    registerCar.getAvgSpeed(),
                    registerCar.getGasMileage(),
                    registerCar.getRange());
            model.addCar(
                    ownerCar,
                    registerCar.getNumberPlate(),
                    vehicle,
                    registerCar.getBasePrice(),
                    registerCar.getPos());
            menu.back();
            error = "";
        }
        catch (InvalidNewRegisterException e){ error = "Parametros Inválidos"; }
        catch (CarExistsException e){ error = "Carro já existe"; }
        catch (InvalidUserException ignored) {}
        return error;
    }

    private void nUses() {
        List<List<String>> list = new ArrayList<>();
        long limit = 10;
        for (Map.Entry<String, Integer> x : this.model.getBestClientsByUses()) {
            List<String> strings = Arrays.asList(
                    x.getKey(),
                    x.getValue().toString());
            if (limit-- == 0) break;
            list.add(strings);
        }
        menu.top10ClientsShow(
                list,
                "Número de Utilizações");
        this.menu.back();
    }

    private void distance() {
        List<List<String>> list = new ArrayList<>();
        long limit = 10;
        for (Map.Entry<String, Double> x : this.model.getBestClientsTravel()) {
            List<String> strings = Arrays.asList(
                    x.getKey(),
                    String.format("%.2f", x.getValue()));
            if (limit-- == 0) break;
            list.add(strings);
        }
        menu.top10ClientsShow(
                list,
                "Distância");
        this.menu.back();
    }

    private String carOverview(String error) {
        Owner ownerCar = (Owner)this.user;
        List<List<String>> list = new ArrayList<>();
        for (Car x : ownerCar.getCars()) {
            List<String> strings = Arrays.asList(x.toString().split("\n"));
            list.add(strings);
        }
        String action = this.menu.carOverviewShow(error,
                list);
        try {
            switch (action.charAt(0)) {
                case ' ':
                    break;
                case 'r':
                    model.refil(ownerCar, Integer.parseInt(action.substring(1)) - 1);
                    break;
                case'c':
                    String [] s = action.substring(1).split(" ");
                    if (s.length != 2) {
						throw new InvalidNumberOfArgumentsException();
					}
                    model.setBasePrice(ownerCar, Integer.parseInt(s[0]) - 1, Double.parseDouble(s[1]));
                    break;
                case 'd':
                    model.swapState(ownerCar, Integer.parseInt(action.substring(1)) - 1);
                    break;
                case 't':
                    TimeInterval ti = this.menu.getTimeInterval(error);
                    this.menu.showString("Total faturado: " +
                            model.getTotalBilledCar(
                            ownerCar.getCars().get(Integer.parseInt(action.substring(1)) - 1),
                            ti.getInicio(),
                            ti.getFim()));
                    break;
                case 'b':
                    this.menu.back();
                    break;

                    default:
                        throw new InvalidNumberOfArgumentsException();
            }
            error = "";
        }
        catch (IndexOutOfBoundsException e){ error = "Valor de carro inválido"; }
        catch (NumberFormatException e){ error = "Posição inválida"; }
        catch (InvalidNumberOfArgumentsException e) {error = "Invalid parameters";}
        catch (InvalidTimeIntervalException e ){error = "Formato Inválido de Data";}
        return error;
    }

    private String pending(String error) {
        try {
            Client cli = (Client) user;
            List<Rental> pR = cli.getPendingRates();

            if (pR.isEmpty()) {
                this.menu.back();
                return error;
            }

            RateOwnerCar r = this.menu.pendingRateShow(error, pR.get(0).toString(), pR.size());

            model.rate(cli, pR.get(0), r.getOwnerRate(), r.getCarRate());

            error = "";
        }
        catch (InvalidRatingException e){error = "Parametros Invalidos";}
        return error;
    }

    private String historyOwner(String error) {
        try{
            TimeInterval ti = this.menu.getTimeInterval(error);

            List<List<String>> list = new ArrayList<>();
            for (Rental rental : this.model.getRentalListOwner((Owner) this.user, ti.getInicio(), ti.getFim())) {
                String x = rental.toParsableOwnerRentalString();
                List<String> strings = Arrays.asList(x.split("\n"));
                list.add(strings);
            }
            this.menu.rentalHistoryShow(ti,
                    list);

            this.menu.back();
            error = "";
        }
        catch (InvalidTimeIntervalException e){error = "Intervalo Inválido";}
        return error;
    }

    private String historyClient(String error) {
        try{
            TimeInterval ti = this.menu.getTimeInterval(error);

            List<List<String>> list = new ArrayList<>();
            for (Rental rental : this.model.getRentalListClient((Client) this.user, ti.getInicio(), ti.getFim())) {
                String x = rental.toParsableUserRentalString();
                List<String> strings = Arrays.asList(x.split("\n"));
                list.add(strings);
            }
            this.menu.rentalHistoryShow(ti,
                    list);

            this.menu.back();
            error = "";
        }
        catch (InvalidTimeIntervalException e){error = "Intervalo Inválido";}
        return error;
    }
}
