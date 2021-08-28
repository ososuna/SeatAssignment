package classes;

public class Passenger {
    
    private String name;
    private String ssn;

    public Passenger( String name, String ssn ) {
        this.name = name;
        this.ssn = ssn;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name: " + this.name + "\nSSN: " + this.ssn;
    }

}
