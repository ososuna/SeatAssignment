import classes.ExecutiveSeat;
import classes.Passenger;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Passenger p = new Passenger("Zenitsu", "00126374");
        ExecutiveSeat s1 = new ExecutiveSeat(p, "Window");
        System.out.println(s1);
    }
}

