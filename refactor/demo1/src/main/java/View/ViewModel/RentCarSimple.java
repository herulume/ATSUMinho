package View.ViewModel;
import Exceptions.InvalidNewRentalException;
import Model.Vehicle;
import Utils.Point;

public class RentCarSimple {
    private final Point point;
    private final Vehicle.CarType type;

    public RentCarSimple(Point point, String type) throws InvalidNewRentalException {
        this.point = point;
        try {
            this.type = Vehicle.CarType.valueOf(type.toLowerCase());
        }
        catch (IllegalArgumentException e){
            throw new InvalidNewRentalException();
        }
    }

    public Point getPoint() {
        return this.point;
    }

    public Vehicle.CarType getCarType() {
        return this.type;
    }
}
