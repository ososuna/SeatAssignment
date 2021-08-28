package classes;

import java.util.Arrays;

public class Airplane {
    
    ExecutiveSeat[][] executiveSeats = new ExecutiveSeat[ExecutiveSeat.rows][ExecutiveSeat.cols];
    EconomicSeat[][] economicSeats = new EconomicSeat[EconomicSeat.rows][EconomicSeat.cols];
    
    public Airplane() {
        this.initializeSeats();
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

    private void initializeSeats() {
        
        int seatNumber = 1;

        for (int i = 0; i < ExecutiveSeat.rows; i++) {
            for (int j = 0; j < ExecutiveSeat.cols; j++) {
                this.executiveSeats[i][j] = new ExecutiveSeat(null, "Window", seatNumber);
                seatNumber++;
            }
        }
        
        for (int i = 0; i < EconomicSeat.rows; i++) {
            for (int j = 0; j < EconomicSeat.cols; j++) {
                this.economicSeats[i][j] = new EconomicSeat(null, "Window", seatNumber);
                seatNumber++;
            }
        }
    
    }

    public void printSeats() {

        for (int i = 0; i < ExecutiveSeat.rows; i++) {
            for (int j = 0; j < ExecutiveSeat.cols; j++) {
                if (executiveSeats[i][j].getPassenger() == null) {
                    if (j==ExecutiveSeat.cols/2) {
                        System.out.print("  [ " + String.format("%02d", executiveSeats[i][j].getNumber()) + " ] ");    
                    } else {
                        System.out.print("   [ " + String.format("%02d", executiveSeats[i][j].getNumber()) + " ] ");
                    }
                } else {
                    System.out.print(executiveSeats[i][j].getPassenger() + " ");
                }
            }
            System.out.println("\n");
        }
        
        System.out.println();

        for (int i = 0; i < EconomicSeat.rows; i++) {
            for (int j = 0; j < EconomicSeat.cols; j++) {
                if (economicSeats[i][j].getPassenger() == null) {
                    if (j==EconomicSeat.cols/2) {
                        System.out.print("  [ " + String.format("%02d", economicSeats[i][j].getNumber()) + " ] ");    
                    } else {
                        System.out.print("[ " + String.format("%02d", economicSeats[i][j].getNumber()) + " ] ");
                    }
                } else {
                    System.out.print(economicSeats[i][j].getPassenger() + " ");
                }
            }
            System.out.println("\n");
        }
    }
    
    @Override
    public String toString() {
        return "Airplane [economicSeats=" + Arrays.toString(economicSeats) + ", executiveSeats="
                + Arrays.toString(executiveSeats) + "]";
    }

}
