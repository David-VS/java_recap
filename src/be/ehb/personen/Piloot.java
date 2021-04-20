package be.ehb.personen;

import be.ehb.boarding.Vliegtuig;
import be.ehb.interfaces.FlightCheckable;

public class Piloot extends Personeel implements FlightCheckable {

    public Piloot(String naam, String adres, int leeftijd) {
        super(naam, adres, leeftijd);
    }

    @Override
    public boolean performFlightCheck(Vliegtuig v) {
        int nrPilots = 0;
        int nrStewards = 0;

        for(Personeel p : v.getPersoneelsSet()){
            if(p instanceof Piloot){
                nrPilots++;
            }else if(p instanceof Steward){
                nrStewards++;
            }else{
                System.out.println("pas op, nen hacker");
            }
        }

        if(nrPilots >= 1 && nrStewards >= 1){
            System.out.println("genoeg personeel om op te stijgen");
            return true;
        }else{
            System.out.println("te weinig personeel");
            return false;
        }
    }
}
