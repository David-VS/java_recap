package be.ehb.boarding;

import be.ehb.personen.Passagier;

public class BoardingGate {

    private Vliegtuig vliegtuig;
    private int countBus = 0, countEco = 0;

    public BoardingGate(Vliegtuig vliegtuig) {
        this.vliegtuig = vliegtuig;
    }

    public boolean getEconomyTicket(Passagier p){
        if(vliegtuig.getAantalEco() >= countEco) {
            String stoel = "E" + countEco;
            countEco++;
            p.setTicket(new Ticket(FlightClass.ECONOMY, stoel));
            return true;
        }
        return false;
    }
}
