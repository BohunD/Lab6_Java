class Wagon {
    int capacity;
    int comfortLevel;
    int numOfPassengers;

    public Wagon(int capacity, int numOfPassengers, int comfortLevel) {
        this.capacity = capacity;
        this.numOfPassengers = numOfPassengers;
        this.comfortLevel = comfortLevel;
    }

    public void setComfortLevel(int level){
        this.comfortLevel = level;
    }
    public String toString() {
        return "Wagon{" +
                "capacity=" + capacity +
                ", comfortLevel=" + comfortLevel +
                ", numOfPassengers=" + numOfPassengers +
                '}';
    }
}