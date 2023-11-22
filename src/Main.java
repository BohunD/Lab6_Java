public class Main {
    public static void main(String[] args) {
        try {
            PassengerWagon wagon1 = new PassengerWagon(50, 100, 1);
            PassengerWagon wagon2 = new PassengerWagon(40, 80, 2);
            PassengerWagon wagon3 = new PassengerWagon(30, 60, 3);

            PassengerTrain train = new PassengerTrain();
            train.addWagon(wagon1);
            train.addWagon(wagon2);
            train.addWagon(wagon3);

            System.out.println("Total passengers in the train: " + train.calculateTotalPassengers());
            System.out.println("Total luggage in the train: " + train.calculateTotalLuggage());

            train.sortWagonsByComfort();

            int minPassengers = 35;
            int maxPassengers = 45;
            PassengerWagon foundWagon = train.findWagonByPassengerCount(minPassengers, maxPassengers);

            if (foundWagon != null) {
                System.out.println("Found a wagon with passengers between " + minPassengers + " and " + maxPassengers+ ":"+ foundWagon.toString());
            } else {
                System.out.println("No wagon found with passengers between " + minPassengers + " and " + maxPassengers);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}