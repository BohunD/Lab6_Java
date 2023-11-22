/**
 * Represents a passenger wagon in a railway transport system.
 * Extends the Wagon class to inherit basic properties.
 */
class PassengerWagon extends Wagon {
    /**
     * The comfort level of the passenger wagon.
     */
    private int comfortLevel;

    /**
     * Constructs a PassengerWagon with the specified number of passengers, luggage, and comfort level.
     * @param passengers   The number of passengers in the wagon.
     * @param luggage      The amount of luggage in the wagon.
     * @param comfortLevel The comfort level of the wagon.
     */
    public PassengerWagon(int passengers, int luggage, int comfortLevel) {
        super(passengers, luggage);
        this.comfortLevel = comfortLevel;
    }

    /**
     * Gets the comfort level of the passenger wagon.
     * @return The comfort level of the wagon.
     */
    public int getComfortLevel() {
        return comfortLevel;
    }

    /**
     * Returns a string representation of the PassengerWagon object.
     * @return A string containing information about the passengers, luggage, and comfort level of the wagon.
     */
    @Override
    public String toString() {
        return "PassengerWagon{" +
                "passengers=" + passengers +
                ", luggage=" + luggage +
                ", comfortLevel=" + comfortLevel +
                '}';
    }
}
