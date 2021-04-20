package be.ehb.personen;

import be.ehb.boarding.Ticket;

public class Passagier extends Persoon {

    private int bagageGewicht;
    private Ticket ticket;


    public Passagier(String naam, String adres, int leeftijd) {
        super(naam, adres, leeftijd);
    }

    public int getBagageGewicht() {
        return bagageGewicht;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setBagageGewicht(int bagageGewicht) {
        this.bagageGewicht = bagageGewicht;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
