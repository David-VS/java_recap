package be.ehb;

import be.ehb.boarding.FlightClass;
import be.ehb.boarding.Ticket;
import be.ehb.boarding.Vliegtuig;
import be.ehb.personen.Passagier;
import be.ehb.personen.Piloot;
import be.ehb.personen.Steward;

public class Main {

    public static void main(String[] args) {
        //passagiers
        Passagier jan = new Passagier("Jan", "Koekoekstraat", 45);
        jan.setTicket(new Ticket(FlightClass.ECONOMY, "E25"));
        jan.setBagageGewicht(20);

        Passagier david = new Passagier("David", "Anderlecht", 35);
        david.setTicket(new Ticket(FlightClass.BUSINESS, "B25"));
        david.setBagageGewicht(5);

        //personeel
        Piloot john = new Piloot("John", "Zwevezele", 40);
        Steward jef = new Steward("Jef", "Ergens", 20);

        //vliegtuig
        Vliegtuig vliegtuig = new Vliegtuig("Zaventem", "LA", 20, 60);
        vliegtuig.boardPersoneel(john);
        vliegtuig.boardPersoneel(jef);

        vliegtuig.boardPassagier(jan);
        vliegtuig.boardPassagier(david);

        john.performFlightCheck(vliegtuig);
    }
}
