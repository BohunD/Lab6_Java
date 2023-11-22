/**
 * Represents a coupe car wagon, a specialized type of wagon with moderate comfort.
 * Extends the {@code Wagon} class.
 */
class CoupeCar extends Wagon {

    /**
     * Constructs a new CoupeCar with the specified capacity and initial passenger count.
     *
     * @param capacity The maximum capacity of the coupe car wagon.
     * @param pas The initial number of passengers in the coupe car wagon.
     */
    public CoupeCar(int capacity, int pas) {
        super(capacity, pas, 60);
    }
}
