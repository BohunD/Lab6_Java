/**
 * Represents a generic wagon in a passenger train, with specified capacity, comfort level, and current passenger count.
 */
class Wagon {
    /** The maximum capacity of the wagon. */
    int capacity;

    /** The comfort level of the wagon. */
    int comfortLevel;

    /** The current number of passengers in the wagon. */
    int numOfPassengers;

    /**
     * Constructs a new Wagon with the specified capacity, initial number of passengers, and comfort level.
     *
     * @param capacity The maximum capacity of the wagon.
     * @param numOfPassengers The initial number of passengers in the wagon.
     * @param comfortLevel The comfort level of the wagon.
     */
    public Wagon(int capacity, int numOfPassengers, int comfortLevel) {
        this.capacity = capacity;
        this.numOfPassengers = numOfPassengers;
        this.comfortLevel = comfortLevel;
    }

    /**
     * Sets the comfort level of the wagon to the specified value.
     *
     * @param level The new comfort level for the wagon.
     */
    public void setComfortLevel(int level) {
        this.comfortLevel = level;
    }

    /**
     * Returns a string representation of the wagon, including details of its capacity, comfort level, and passenger count.
     *
     * @return A string representation of the wagon.
     */
    @Override
    public String toString() {
        return "Wagon{" +
                "capacity=" + capacity +
                ", comfortLevel=" + comfortLevel +
                ", numOfPassengers=" + numOfPassengers +
                '}';
    }
}
