package be.ehb.interfaces;

import be.ehb.boarding.Vliegtuig;

public interface FlightCheckable {
    boolean performFlightCheck(Vliegtuig v);
}
