package View.ViewModel;

import Exceptions.InvalidNewRentalException;
import Model.Vehicle;
import Utils.Point;

public class CheapestNearCar {
        private final Point point;
        private final int walkDistance;
        private final Vehicle.CarType type;

        public CheapestNearCar(Point point, int walkDistance, String type) throws InvalidNewRentalException {
            try {
                this.type = Vehicle.CarType.valueOf(type.toLowerCase());
            }
            catch (IllegalArgumentException e){
                throw new InvalidNewRentalException();
            }
            this.point = point;
            this.walkDistance = walkDistance;
        }

        public Point getPoint() {
            return point;
        }

        public int getWalkDistance() {
            return walkDistance;
        }

        public Vehicle.CarType getType() { return type; }
    }
