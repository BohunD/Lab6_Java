public class Main {
    public static void main(String[] args) {
        PassengerTrain train = new PassengerTrain();

        SittingCar sittingCar1 = new SittingCar(50, 33);
        SittingCar sittingCar2 = new SittingCar(45,40);
        SittingCar sittingCar3 = new SittingCar(30,35);
        CoupeCar coupeCar = new CoupeCar(30,25);
        DeluxeCar deluxeCar = new DeluxeCar(20,10);
        DeluxeCar coupeCar2 = new DeluxeCar(24,28);

        train.addWagon(coupeCar2);
        train.addWagon(sittingCar1);
        train.addWagon(coupeCar);
        train.addWagon(sittingCar3);
        train.addWagon(sittingCar2);
        train.addWagon(deluxeCar);

        int totalPassengers = train.getTotalPassengers();
        System.out.println("Total passengers: " + totalPassengers);

        train.sortWagonsByComfort();
        System.out.println("Sorted wagons by comfort level: " + train);

        int minPassengers = 30;
        int maxPassengers = 35;
        Wagon foundWagon = train.findWagonByPassengerCount(minPassengers, maxPassengers);
        if (foundWagon != null) {
            System.out.println("Found wagon with capacity between " + minPassengers + " and " + maxPassengers + ": " + foundWagon);
        } else {
            System.out.println("No wagon found with capacity between " + minPassengers + " and " + maxPassengers);
        }
    }
}
