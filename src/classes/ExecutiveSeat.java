package classes;

public class ExecutiveSeat extends Seat {
    
    public static int rows = 2;
    public static int cols = 4;

    public ExecutiveSeat(Passenger passenger, String location, int number) {
        super(passenger, location, number);
        locationOptions = new String[]{"Window", "Hall"};
    }

}
