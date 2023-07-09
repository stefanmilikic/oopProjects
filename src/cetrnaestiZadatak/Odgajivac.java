package cetrnaestiZadatak;

import java.util.ArrayList;

public class Odgajivac extends Vlasnik {
    private String kategorija;

    public Odgajivac(ArrayList<Ljubimac> ljubimci, String kategorija) {
        super(ljubimci);
        this.kategorija = kategorija;
    }

    public Odgajivac(String kategorija) {
        this.kategorija = kategorija;
    }

    public Odgajivac() {

        this.kategorija = "";
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    //Napisati metode:
    //1. ispisiSveLjubimceKojeOdgajas() - koja ispisuje sve ljubimce koje odgajivac odgaja.
    //2. vratiSveLjubimceKojeOdgajas() - koja vraca ArrayListu ljubimaca koje odgajivac odgaja.
    //Odgajivac odgaja one ljubimce ciji se tip poklapa sa Kategorijom odgajivaca
    //(npr Odgajivac.kategorija = "Pas", Ljubimac.red = "Pas")
    public void ispisiSveLjubimceKojeOdgajas() {
        ArrayList<Ljubimac> nova = new ArrayList<>();
        for (int i = 0; i < getLjubimci().size(); i++) {
            if (kategorija.equalsIgnoreCase(getLjubimci().get(i).getRed())) {
                nova.add(getLjubimci().get(i));
            }
        }
        System.out.println(nova.toString());
    }

    public ArrayList vratiSveLjubimceKojeOdgajas() {
        ArrayList<Ljubimac> nova = new ArrayList<>();
        for (int i = 0; i < getLjubimci().size(); i++) {
            if (kategorija.equalsIgnoreCase(getLjubimci().get(i).getRed())) {
                nova.add(getLjubimci().get(i));
            }
        }
        return nova;
    }

    @Override
    public String toString() {
        //<ime> <prezime> <brojGodina> ima ljubimce:
        // <ljubimac1.toString()>
        // ...
        // <ljubimacN.toString()>
        // A odgaja ljubimce:
        // <ljubimacKojegOdgajas1.toString()>
        // ...
        // <ljubimacKojegOdgajasK.toString()>"
        Osoba o = new Osoba();
        StringBuilder sb = new StringBuilder();
        sb.append(o.getIme()).append(" ").append(o.getPrezime()).append(" ima ljubimca: ").append("\n");
        sb.append(getLjubimci()).append("a odgaja: ").append("\n");
        return "Odgajivac{}";
    }
}


