package classes;

import java.util.Arrays;

public abstract class Seat {
    
    private Passenger passenger;
    private String location;
    private int number;
    protected String[] locationOptions;

    public Seat(Passenger passenger, String location, int number) {
        this.passenger = passenger;
        this.location = location;
        this.number = number;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String[] getLocationOptions() {
        return locationOptions;
    }

    public void setLocationOptions(String[] locationOptions) {
        this.locationOptions = locationOptions;
    }

    @Override
    public String toString() {
        return "Seat [location=" + location + ", locationOptions=" + Arrays.toString(locationOptions) + ", number="
                + number + ", passenger=" + passenger + "]";
    }

}
