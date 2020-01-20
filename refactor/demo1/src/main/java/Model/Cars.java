package Model;

import Exceptions.CarExistsException;
import Exceptions.InvalidCarException;
import Exceptions.NoCarAvaliableException;
import Exceptions.UnknownCompareTypeException;
import Utils.Point;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class Cars implements Serializable {
    private static final long serialVersionUID = 2716582249374370739L;
    private final Map<String, Car> carBase;

    Cars() {
        this.carBase = new HashMap<>();
    }

    private Cars(Cars c) {
        this.carBase = c.carBase
                .values()
                .stream()
                .collect(Collectors
                        .toMap(Car::getNumberPlate, Car::clone));
    }

    /**
     * \brief Adiciona um carro à base de dados.
     * @param a Carro a adicionar
     */
    void addCar(Car a) {
        this.carBase.putIfAbsent(a.getNumberPlate(), a);
    }

    /**
     * \brief Procura um carro na base de dados.
     * @param numberPlate Matricula do carro a procurar
     * @return Clone do carro, Null se não existir
     */
    Car searchCar(String numberPlate) throws InvalidCarException {
        Car car = this.carBase.get(numberPlate);
        if(car == null) {
			throw new InvalidCarException();
		}
        return car;
    }

    /**
     * Clona um objeto da classe Model.Cars
     * @return Clone do objeto
     */
    public Cars clone() {
        return new Cars(this);
    }

    /**
     * Obtem a lista de todos os carros no sistema
     * de um determinado tipo.
     * @param b Tipo a procurar
     * @return Lista dos carros
     */
    public ArrayList<Car> listOfCarType(Vehicle.CarType b) {
        return this.carBase
                .values()
                .stream()
                .filter(e -> e.getVehicle().getType().equals(b))
                .map(Car::clone)
                .collect(Collectors
                        .toCollection(ArrayList::new));
    }

    private Car getCarClosest(Point dest, Point origin, Vehicle.CarType a){
        return this.carBase
                .values()
                .stream()
                .filter(e -> e.getVehicle().getType().equals(a)
                        && e.hasRange(dest)
                        && e.isAvailable())
                .sorted(Comparator.comparingDouble(e ->
                        e.getPosition()
                                .distanceBetweenPoints(origin)))
                .collect(Collectors.toList())
                .get(0);
    }

    private Car getCarCheapest(Point dest, Vehicle.CarType a){
        return this.carBase
                .values()
                .stream()
                .filter(e -> e.getVehicle().getType().equals(a)
                        && e.hasRange(dest)
                        && e.getPosition().distanceBetweenPoints(dest) != 0
                        && e.isAvailable())
                .sorted(Comparator.comparingDouble(e -> e.getBasePrice() * e.getPosition()
                        .distanceBetweenPoints(dest)))
                .collect(Collectors.toList())
                .get(0);
    }

    Car getCar(String compare, Point dest, Point origin, Vehicle.CarType a) throws UnknownCompareTypeException, NoCarAvaliableException {
        try {
            if ("MaisPerto".equals(compare)) {
                return getCarClosest(dest, origin, a);
            }

            if ("MaisBarato".equals(compare)) {
                return getCarCheapest(dest, a);
            }
        }
        catch (IndexOutOfBoundsException ignored) {
            throw new NoCarAvaliableException();
        }
        throw new UnknownCompareTypeException();
    }

    Car getCar(Point dest, Point origin, double range, Vehicle.CarType a) throws NoCarAvaliableException {
        try {
            return this.carBase
                    .values()
                    .stream()
                    .filter(e -> e.getVehicle().getType().equals(a)
                            && e.hasRange(dest)
                            && origin.distanceBetweenPoints(e.getPosition()) <= range
                            && e.isAvailable())
                    .sorted(Comparator.comparingDouble(e -> e.getBasePrice() * origin.distanceBetweenPoints(dest)))
                    .collect(Collectors.toList())
                    .get(0);
        }
        catch(IndexOutOfBoundsException ignored) {
            throw new NoCarAvaliableException();
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

        Cars cars = (Cars) o;
        return this.carBase.equals(cars.carBase);
    }

    Car getCar(Point dest, double range, Vehicle.CarType a) throws NoCarAvaliableException {
        try {
            return this.carBase
                    .values()
                    .stream()
                    .filter(e -> e.getVehicle().getType().equals(a)
                            && e.hasRange(dest)
                            && e.getRange() >= range
                            && e.isAvailable())
                    .sorted(Comparator.comparingDouble(e -> e.getBasePrice() * e.getPosition()
                            .distanceBetweenPoints(dest)))
                    .collect(Collectors.toList())
                    .get(0);
        }
        catch (IndexOutOfBoundsException ignored) {
            throw new NoCarAvaliableException();
        }
    }
}
