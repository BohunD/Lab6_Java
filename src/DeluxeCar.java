/**
 * Represents a deluxe car wagon, a specialized type of wagon with enhanced comfort.
 * Extends the {@code Wagon} class.
 */
class DeluxeCar extends Wagon {

    /**
     * Constructs a new DeluxeCar with the specified capacity and initial passenger count.
     *
     * @param capacity The maximum capacity of the deluxe car wagon.
     * @param pas The initial number of passengers in the deluxe car wagon.
     */
    public DeluxeCar(int capacity, int pas) {
        super(capacity, pas, 100);
    }
}
