package classes;

import java.util.Arrays;

public class Airplane {
    
    ExecutiveSeat [][] executiveSeats;
    EconomicSeat [][] economicSeats;
    
    public Airplane(ExecutiveSeat[][] executiveSeats, EconomicSeat[][] economicSeats) {
        this.executiveSeats = executiveSeats;
        this.economicSeats = economicSeats;
    }

    public ExecutiveSeat[][] getExecutiveSeats() {
        return executiveSeats;
    }

    public void setExecutiveSeats(ExecutiveSeat[][] executiveSeats) {
        this.executiveSeats = executiveSeats;
    }

    public EconomicSeat[][] getEconomicSeats() {
        return economicSeats;
    }

    public void setEconomicSeats(EconomicSeat[][] economicSeats) {
        this.economicSeats = economicSeats;
    }

    @Override
    public String toString() {
        return "Airplane [economicSeats=" + Arrays.toString(economicSeats) + ", executiveSeats="
                + Arrays.toString(executiveSeats) + "]";
    }

}
