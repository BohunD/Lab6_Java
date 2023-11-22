import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Represents a passenger train consisting of multiple wagons.
 */
class PassengerTrain {
    /**
     * List of wagons in the passenger train.
     */
    private ArrayList<Wagon> wagons = new ArrayList<>();

    /**
     * Adds a wagon to the passenger train.
     *
     * @param wagon The wagon to be added.
     */
    public void addWagon(Wagon wagon) {
        wagons.add(wagon);
    }

    /**
     * Calculates and returns the total number of passengers in the passenger train.
     *
     * @return The total number of passengers in the passenger train.
     */
    public int getTotalPassengers() {
        int totalPassengers = 0;
        for (Wagon wagon : wagons) {
            totalPassengers += wagon.numOfPassengers;
        }
        return totalPassengers;
    }

    /**
     * Sorts the wagons in the passenger train based on their comfort level in ascending order.
     */
    public void sortWagonsByComfort() {
        Collections.sort(wagons, Comparator.comparingInt(w -> w.comfortLevel));
    }

    /**
     * Finds and returns the first wagon in the passenger train that has a passenger count
     * within the specified range.
     *
     * @param minPassengers The minimum number of passengers allowed in the wagon.
     * @param maxPassengers The maximum number of passengers allowed in the wagon.
     * @return The first wagon found with a passenger count within the specified range, or null if none is found.
     */
    public Wagon findWagonByPassengerCount(int minPassengers, int maxPassengers) {
        for (Wagon wagon : wagons) {
            if (wagon.numOfPassengers >= minPassengers && wagon.numOfPassengers <= maxPassengers) {
                return wagon;
            }
        }
        return null;
    }

    /**
     * Returns a string representation of the passenger train.
     *
     * @return A string representation of the passenger train, including details of its wagons.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("PassengerTrain{wagons=[");

        for (int i = 0; i < wagons.size(); i++) {
            result.append(wagons.get(i).toString());
            if (i < wagons.size() - 1) {
                result.append(", ");
            }
        }

        result.append("]}");
        return result.toString();
    }
}
