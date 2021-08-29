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
        int windowCounter = 0;
        int centerCounter = 0;
        int hallCounter = 0;

        for (int i = 0; i < ExecutiveSeat.rows; i++) {
            for (int j = 0; j < ExecutiveSeat.cols; j++) {
                if( j == 0 || j == 1 ) {
                    if( windowCounter == 0 && hallCounter == 0 ) {
                        executiveSeats[i][j] = new ExecutiveSeat(null, "Window", seatNumber);
                        windowCounter++;
                    } else {
                        executiveSeats[i][j] = new ExecutiveSeat(null, "Hall", seatNumber);
                        hallCounter = 0;
                        centerCounter = 0;
                        windowCounter = 0;
                    }
                } else {
                    if( hallCounter == 0 && windowCounter == 0 ) {
                        executiveSeats[i][j] = new ExecutiveSeat(null, "Hall", seatNumber);
                        hallCounter++;
                    } else {
                        executiveSeats[i][j] = new ExecutiveSeat(null, "Window", seatNumber);
                        hallCounter = 0;
                        centerCounter = 0;
                        windowCounter = 0;
                    }
                }
                seatNumber++;
            }
        }

        for (int i = 0; i < EconomicSeat.rows; i++) {
            for (int j = 0; j < EconomicSeat.cols; j++) {
                if ( j == 0 || j == 1 || j == 2 ) {
                    if( windowCounter == 0 && centerCounter == 0 && hallCounter == 0 ) {
                        economicSeats[i][j] = new EconomicSeat(null, "Window", seatNumber);
                        windowCounter++;
                    } else if( windowCounter == 1 && centerCounter == 0 && hallCounter == 0 ) {
                        economicSeats[i][j] = new EconomicSeat(null, "Center", seatNumber);
                        centerCounter++;
                    } else {
                        economicSeats[i][j] = new EconomicSeat(null, "Hall", seatNumber);
                        hallCounter = 0;
                        centerCounter = 0;
                        windowCounter = 0;
                    }
                } else {
                    if( hallCounter == 0 && centerCounter == 0 && windowCounter == 0 ) {
                        economicSeats[i][j] = new EconomicSeat(null, "Hall", seatNumber);
                        hallCounter++;
                    } else if( hallCounter == 1 && centerCounter == 0 && windowCounter == 0 ) {
                        economicSeats[i][j] = new EconomicSeat(null, "Center", seatNumber);
                        centerCounter++;
                    } else {
                        economicSeats[i][j] = new EconomicSeat(null, "Window", seatNumber);
                        hallCounter = 0;
                        centerCounter = 0;
                        windowCounter = 0;
                    }
                }
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
                        // System.out.print("  [ " + executiveSeats[i][j].getLocation() + " ] ");   
                    } else {
                        System.out.print("   [ " + String.format("%02d", executiveSeats[i][j].getNumber()) + " ] ");
                        // System.out.print("   [ " + executiveSeats[i][j].getLocation() + " ] ");
                    }
                } else {
                    if (j==ExecutiveSeat.cols/2) {
                        System.out.print("  [ xx ] ");
                    } else {
                        System.out.print("   [ xx ] ");
                    }
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
                        // System.out.print("  [ " + economicSeats[i][j].getLocation() + " ] ");    
                    } else {
                        System.out.print("[ " + String.format("%02d", economicSeats[i][j].getNumber()) + " ] ");
                        // System.out.print("[ " + economicSeats[i][j].getLocation() + " ] ");
                    }
                } else {
                    if (j==ExecutiveSeat.cols/2) {
                        System.out.print("  [ xx ] ");
                    } else {
                        System.out.print("[ xx ] ");
                    }
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
