package classes;

public class EconomicSeat extends Seat {

    public static int rows = 7;
    public static int cols = 6;

    public EconomicSeat(Passenger passenger, String location, int number) {
        super(passenger, location, number);
        locationOptions = new String[]{"Window", "Center", "Hall"};
    }
    
}
