package be.ehb.boarding;

import be.ehb.personen.Passagier;
import be.ehb.personen.Personeel;

import java.util.HashMap;
import java.util.HashSet;

public class Vliegtuig {

    private String vertrek, aankomst;
    private final int aantalBus, aantalEco;
    private HashMap<String, Passagier> passagierHashMap;
    private HashSet<Personeel> personeelsSet;

    public Vliegtuig(String vertrek, String aankomst, int aantalBus, int aantalEco) {
        this.vertrek = vertrek;
        this.aankomst = aankomst;
        this.aantalBus = aantalBus;
        this.aantalEco = aantalEco;
        this.passagierHashMap = new HashMap<>();
        this.personeelsSet = new HashSet<>();
    }

    public void boardPersoneel(Personeel personeel){
        personeelsSet.add(personeel);
    }

    public void boardPassagier(Passagier passagier){
        //heeft passagier een ticker?
        if(passagier.getTicket() == null){
            System.out.println("Passagier heeft gheen ticket");
            return;
        }
        String stoelNR = passagier.getTicket().getStoelNR();
       if(passagierHashMap.containsKey(stoelNR)){
           System.out.println("stoel is al bezet");
           return;
       }
        passagierHashMap.put(stoelNR, passagier);
    }

    public void setVertrek(String vertrek) {
        this.vertrek = vertrek;
    }

    public void setAankomst(String aankomst) {
        this.aankomst = aankomst;
    }

    public String getVertrek() {
        return vertrek;
    }

    public String getAankomst() {
        return aankomst;
    }

    public int getAantalBus() {
        return aantalBus;
    }

    public int getAantalEco() {
        return aantalEco;
    }

    public HashMap<String, Passagier> getPassagierHashMap() {
        return passagierHashMap;
    }

    public HashSet<Personeel> getPersoneelsSet() {
        return personeelsSet;
    }
}
