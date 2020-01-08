package Model;

import Utils.Point;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Car implements Serializable {
    private static final long serialVersionUID = -1292370800088543472L;
    private final String numberPlate;
    private final Owner owner;

    private Vehicle vehicle;
    private double basePrice;
    private final Point position;

    private boolean isAvailable;

    private double range;
    private int rating;
    private int nRatings;

    private final List<Rental> historic;

    Car(String numberPlate, Owner owner, Vehicle vehicle, double basePrice, Point pos) {
        this.numberPlate = numberPlate;
        this.owner = owner;
        this.vehicle = new Vehicle(vehicle);
        this.basePrice = basePrice;
        this.range = vehicle.getFullTankRange();
        this.position = pos;
        this.rating = 0;
        this.nRatings = 0;
        this.isAvailable = true;
        this.historic = new ArrayList<>();
    }

    private Car(Car car) {
        this.numberPlate = car.getNumberPlate();
        this.owner = car.getOwner();
        this.vehicle = new Vehicle(car.getVehicle());
        this.basePrice = car.getBasePrice();
        this.position = car.getPosition();
        this.range = car.getRange();
        this.rating = car.getRating();
        this.nRatings = car.getNRatings();
        this.isAvailable = car.isAvailable();
        this.historic = new ArrayList<>(car.historic);
    }

    void setPosition(Point position, double delay) {
        this.range -= this
                .position
                .distanceBetweenPoints(position) * (1 + delay % 0.2);
    }

    void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    private Owner getOwner() {
        return this.owner;
    }

    String getOwnerID() {
        return this.owner.getEmail();
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }

    double getAvgSpeed() {
        return vehicle.getAvgSpeed();
    }

    double getBasePrice() {
        return this.basePrice;
    }

    private int getRating() {
        return (this.nRatings == 0)? 100 : (this.rating / this.nRatings);
    }

    Point getPosition() {
        return this.position;
    }

    double getRange() {
        return this.range;
    }

    String getNumberPlate() {
        return this.numberPlate;
    }

    private int getNRatings() {
        return this.nRatings;
    }

    boolean isAvailable() {
        return this.isAvailable;
    }

    void swapState() {
        this.isAvailable = !this.isAvailable;
    }

    void refil() {
        this.range = this.vehicle.getFullTankRange();
    }

    boolean hasRange(Point dest) {
        return this.range / vehicle.getFullTankRange() >= 0.1 && this.position.distanceBetweenPoints(dest) * 1.2 <= this.range;
    }

    void rate(int rating) {
        this.nRatings++;
        this.rating += rating;
    }

    void rate(int carRating, int ownerRate) {
        rate(carRating);
        this.owner.rate(ownerRate);
    }

    void pendingRental(Rental r) {
        this.owner.addPendingRental(r);
    }

    void approvePendingRental(Rental r) {
        this.owner.accept(r);
        this.historic.add(r);
    }

    public Car clone() {
        return new Car(this);
    }

    public String warnings() {
        StringBuilder a = new StringBuilder();
        if (this.getRange() / vehicle.getFullTankRange() < 0.15) {
            a.append("O carro necessita de ser abastecido\n");
        }
        return a.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
			return true;
		}

        if (o == null || getClass() != o.getClass()) {
			return false;
		}

        Car car = (Car) o;
        return this.basePrice == car.basePrice
                && this.vehicle.equals(car.vehicle)
                && this.isAvailable == car.isAvailable
                && this.range == car.range
                && this.rating == car.rating
                && this.nRatings == car.nRatings
                && this.numberPlate.equals(car.numberPlate)
                && this.owner.equals(car.owner)
                && this.position.equals(car.position)
                && this.historic.equals(car.historic);
    }

    @Override
    public String toString() {
        return getNumberPlate() + "\n" + String.format("%.2f", getRange()) + "\n" + String.format("%.2f", getBasePrice()) + "\n" + this.isAvailable + "\n" + getRating();
    }
}
