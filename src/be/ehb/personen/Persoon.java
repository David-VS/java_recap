package be.ehb.personen;

public abstract class Persoon {

    private String naam, adres;
    private int leeftijd;

    public Persoon(String naam, String adres, int leeftijd) {
        this.naam = naam;
        this.adres = adres;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
}
