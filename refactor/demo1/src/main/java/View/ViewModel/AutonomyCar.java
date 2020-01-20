package View.ViewModel;
import Exceptions.InvalidNewRentalException;
import Model.Vehicle;
import Utils.Point;

public class AutonomyCar {
    private final Point point;
    private final int autonomy;
    private final Vehicle.CarType type;

    public AutonomyCar(Point point, int autonomy, String type) throws InvalidNewRentalException {
        try {
            this.type = Vehicle.CarType.valueOf(type.toLowerCase());
        }
        catch (IllegalArgumentException e){
            throw new InvalidNewRentalException();
        }
        this.point = point;
        this.autonomy = autonomy;
    }

    public Point getPoint() {
        return point;
    }

    public int getAutonomy() {
        return autonomy;
    }

    public Vehicle.CarType getType() { return type; }
}
