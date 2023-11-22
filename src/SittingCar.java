/**
 * Represents a sitting car wagon, a specialized type of wagon with basic comfort.
 * Extends the {@code Wagon} class.
 */
class SittingCar extends Wagon {

    /**
     * Constructs a new SittingCar with the specified capacity and initial passenger count.
     *
     * @param capacity The maximum capacity of the sitting car wagon.
     * @param pas The initial number of passengers in the sitting car wagon.
     */
    public SittingCar(int capacity, int pas) {
        super(capacity, pas, 20);
    }
}
