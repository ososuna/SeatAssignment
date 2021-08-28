package classes;

public class ExecutiveSeat extends Seat {
    
    public ExecutiveSeat(Passenger passenger, String location) {
        super(passenger, location);
        locationOptions = new String[]{"Window", "Hall"};
    }
}
