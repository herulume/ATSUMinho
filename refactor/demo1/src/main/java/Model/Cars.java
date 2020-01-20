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
        Map<String, Car> map = new HashMap<>();
        for (Car car : c.carBase
                .values()) {
            if (map.put(car.getNumberPlate(), car.clone()) != null) {
                throw new IllegalStateException("Duplicate key");
            }
        }
        this.carBase = map;
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
        ArrayList<Car> cars = new ArrayList<>();
        for (Car e : this.carBase
                .values()) {
            if (e.getVehicle().getType().equals(b)) {
                Car clone = e.clone();
                cars.add(clone);
            }
        }
        return cars;
    }

    private Car getCarClosest(Point dest, Point origin, Vehicle.CarType a){
        List<Car> list = new ArrayList<>();
        for (Car car : this.carBase
                .values()) {
            if (car.getVehicle().getType().equals(a)
                    && car.hasRange(dest)
                    && car.isAvailable()) {
                list.add(car);
            }
        }
        list.sort(Comparator.comparingDouble(e ->
                e.getPosition()
                        .distanceBetweenPoints(origin)));
        return list
                .get(0);
    }

    private Car getCarCheapest(Point dest, Vehicle.CarType a){
        List<Car> list = new ArrayList<>();
        for (Car car : this.carBase
                .values()) {
            if (car.getVehicle().getType().equals(a)
                    && car.hasRange(dest)
                    && car.getPosition().distanceBetweenPoints(dest) != 0
                    && car.isAvailable()) {
                list.add(car);
            }
        }
        list.sort(Comparator.comparingDouble(e -> e.getBasePrice() * e.getPosition()
                .distanceBetweenPoints(dest)));
        return list
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
            List<Car> list = new ArrayList<>();
            for (Car car : this.carBase
                    .values()) {
                if (car.getVehicle().getType().equals(a)
                        && car.hasRange(dest)
                        && origin.distanceBetweenPoints(car.getPosition()) <= range
                        && car.isAvailable()) {
                    list.add(car);
                }
            }
            list.sort(Comparator.comparingDouble(e -> e.getBasePrice() * origin.distanceBetweenPoints(dest)));
            return list
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
            List<Car> list = new ArrayList<>();
            for (Car car : this.carBase
                    .values()) {
                if (car.getVehicle().getType().equals(a)
                        && car.hasRange(dest)
                        && car.getRange() >= range
                        && car.isAvailable()) {
                    list.add(car);
                }
            }
            list.sort(Comparator.comparingDouble(e -> e.getBasePrice() * e.getPosition()
                    .distanceBetweenPoints(dest)));
            return list
                    .get(0);
        }
        catch (IndexOutOfBoundsException ignored) {
            throw new NoCarAvaliableException();
        }
    }
}
