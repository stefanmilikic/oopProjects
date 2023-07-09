package osmiZadatak;

import java.util.ArrayList;

public class Putovanja {
    private String destinacija;
    private String vodjaPuta;
    private String vozilo;
    private double udaljenost;
    private ArrayList<String> prijavljeneOsobe;
////Napisati klasu Putovanje koja ima sledeca polja/atribute:
//    //	- destinacija(Grad)
//    //	- vodjaPuta (Osoba)
//    //	- vozilo (Automobil) - ovo polje se odnosi na automobil kojim se ide na putovanje
//    //	- udaljenostUKm (double)
//    //	- prijavljeneOsobe (arrayList)
//    //udaljenostUKm ne sme biti negativna. Ispisati poruku o gresci ako korisnik pokusa da napravi
//    // Putovanje sa negativnom udaljenoscu.
//    //Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje udaljenostUKm na negativno.
    public Putovanja(String destinacija, String vodjaPuta, String vozilo, double udaljenost, ArrayList<String> prijavljeneOsobe) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        if (udaljenost > 0) {
            this.udaljenost = udaljenost;
        }
        this.prijavljeneOsobe = new ArrayList<>();
    }
    public Putovanja( ) {
        this.destinacija = "";

        this.vozilo = "";

        this.prijavljeneOsobe = new ArrayList<>();
    }

    public String getDestinacija() {
        return destinacija;
    }

    public void setDestinacija(String destinacija) {
        this.destinacija = destinacija;
    }

    public String getVodjaPuta() {
        return vodjaPuta;
    }

    public void setVodjaPuta(String vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }

    public String getVozilo() {
        return vozilo;
    }

    public void setVozilo(String vozilo) {
        this.vozilo = vozilo;
    }

    public double getUdaljenost() {
        return udaljenost;
    }

    public void setUdaljenost(double udaljenost) {
        this.udaljenost = udaljenost;
    }

    public ArrayList<String> getPrijavljeneOsobe() {
        return prijavljeneOsobe;
    }

    public void setPrijavljeneOsobe(ArrayList<String> prijavljeneOsobe) {
        this.prijavljeneOsobe = prijavljeneOsobe;
    }
    //	napisati i metodu koja racuna koliko je vremena potrebno da se stigne na destinaciju pri
    //	odredjenoj prosecnoj brzini. Dakle metoda treba da primi argument koji kaze koliko kilometra na sat
    //	(double) ce biti prosecna brzina automobila, a da vrati koliko ce sati biti potrebno da se dodje do
    //	destinacije ako se auto bude vozio tom prosecnom brzinom.
    public double vreme(Double brzina){
        return udaljenost /= brzina;
    }
}
