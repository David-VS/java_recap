package be.ehb.boarding;

public class Ticket {

    private FlightClass flightClass;
    private String stoelNR;

    public Ticket(FlightClass flightClass, String stoelNR) {
        this.flightClass = flightClass;
        this.stoelNR = stoelNR;
    }

    public FlightClass getFlightClass() {
        return flightClass;
    }

    public String getStoelNR() {
        return stoelNR;
    }
}
