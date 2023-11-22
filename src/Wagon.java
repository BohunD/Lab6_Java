/**
 * Represents a general wagon in a railway transport system.
 */
class Wagon {
    /**
     * The number of passengers in the wagon.
     */
    protected int passengers;

    /**
     * The amount of luggage in the wagon.
     */
    protected int luggage;

    /**
     * Constructs a Wagon with the specified number of passengers and luggage.
     * @param passengers The number of passengers in the wagon.
     * @param luggage    The amount of luggage in the wagon.
     */
    public Wagon(int passengers, int luggage) {
        this.passengers = passengers;
        this.luggage = luggage;
    }

    /**
     * Gets the number of passengers in the wagon.
     * @return The number of passengers in the wagon.
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * Gets the amount of luggage in the wagon.
     * @return The amount of luggage in the wagon.
     */
    public int getLuggage() {
        return luggage;
    }

    /**
     * Returns a string representation of the Wagon object.
     * @return A string containing information about the passengers and luggage of the wagon.
     */
    @Override
    public String toString() {
        return "Wagon{" +
                "passengers=" + passengers +
                ", luggage=" + luggage +
                '}';
    }
}
