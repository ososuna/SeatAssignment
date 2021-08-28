package classes;

public class EconomicSeat extends Seat {

    public EconomicSeat(Passenger passenger, String location) {
        super(passenger, location);
        locationOptions = new String[]{"Window", "Center", "Hall"};
    }
}
