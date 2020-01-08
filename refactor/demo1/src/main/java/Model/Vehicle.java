package Model;

import Exceptions.UnknownCarTypeException;

import java.io.Serializable;
import java.util.Objects;

public class Vehicle implements Serializable {
    
    public final String brand;
    public final CarType type;
    public final double avgSpeed;
    public final double gasMileage;
    public final int fullTankRange;

    public Vehicle(String brand, CarType type, double avgSpeed, double gasMileage, int fullTankRange) {
        this.brand = brand;
        this.type = type;
        this.avgSpeed = avgSpeed;
        this.gasMileage = gasMileage;
        this.fullTankRange = fullTankRange;
    }

    public Vehicle(Vehicle v) {
        this.brand = v.getBrand();
        this.type = v.getType();
        this.avgSpeed = v.getAvgSpeed();
        this.gasMileage = v.getGasMileage();
        this.fullTankRange = v.getFullTankRange();
    }

    public double getAvgSpeed() {
        return this.avgSpeed;
    }

    public int getFullTankRange() {
        return this.fullTankRange;
    }

    public double getGasMileage() {
        return this.gasMileage;
    }

    public CarType getType() {
        return this.type;
    }

    public String getBrand() {
        return this.brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.getAvgSpeed(), getAvgSpeed()) == 0 &&
                Double.compare(vehicle.getGasMileage(), getGasMileage()) == 0 &&
                getFullTankRange() == vehicle.getFullTankRange() &&
                getBrand().equals(vehicle.getBrand()) &&
                getType() == vehicle.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getType(), getAvgSpeed(), getGasMileage(), getFullTankRange());
    }

    public enum CarType {
        electric,
        gas,
        hybrid,
        any;

        public boolean equals(CarType a) {
            return a == this || a == any;
        }

        public static CarType fromString(String s) throws UnknownCarTypeException {
            switch (s) {
                case "Electrico":
                    return CarType.electric;
                case "Gasolina":
                    return CarType.gas;
                case "Hibrido":
                    return CarType.hybrid;
                case "Todos":
                    return CarType.any;
                default:
                    throw new UnknownCarTypeException();
            }
        }
    }
}