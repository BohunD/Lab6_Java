import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Represents a passenger train in a railway transport system.
 */
class PassengerTrain {
    /**
     * The list of passenger wagons in the train.
     */
    private ArrayList<PassengerWagon> wagons = new ArrayList<>();

    /**
     * Adds a passenger wagon to the train.
     * @param wagon The passenger wagon to be added to the train.
     */
    public void addWagon(PassengerWagon wagon) {
        wagons.add(wagon);
    }

    /**
     * Calculates the total number of passengers in the train.
     * @return The total number of passengers in the train.
     */
    public int calculateTotalPassengers() {
        int totalPassengers = 0;
        for (PassengerWagon wagon : wagons) {
            totalPassengers += wagon.getPassengers();
        }
        return totalPassengers;
    }

    /**
     * Calculates the total amount of luggage in the train.
     * @return The total amount of luggage in the train.
     */
    public int calculateTotalLuggage() {
        int totalLuggage = 0;
        for (PassengerWagon wagon : wagons) {
            totalLuggage += wagon.getLuggage();
        }
        return totalLuggage;
    }

    /**
     * Sorts the passenger wagons in the train by their comfort level.
     */
    public void sortWagonsByComfort() {
        Collections.sort(wagons, Comparator.comparingInt(PassengerWagon::getComfortLevel));
    }

    /**
     * Finds a passenger wagon in the train with a specified range of passenger count.
     * @param minPassengers The minimum number of passengers in the range.
     * @param maxPassengers The maximum number of passengers in the range.
     * @return The first passenger wagon found within the specified passenger count range, or null if none is found.
     */
    public PassengerWagon findWagonByPassengerCount(int minPassengers, int maxPassengers) {
        for (PassengerWagon wagon : wagons) {
            if (wagon.getPassengers() >= minPassengers && wagon.getPassengers() <= maxPassengers) {
                return wagon;
            }
        }
        return null;
    }
}
