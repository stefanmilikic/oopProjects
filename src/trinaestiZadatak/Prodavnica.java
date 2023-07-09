package trinaestiZadatak;

import java.util.ArrayList;
import java.util.Arrays;

public class Prodavnica {
    private String ime;
    private ArrayList<Namirnica> namirnice;

    public Prodavnica(String ime, ArrayList<Namirnica> namirnice) {
        this.ime = ime;
        this.namirnice = namirnice;
    }

    public Prodavnica() {
        this.ime = "";
        this.namirnice = new ArrayList<>();
    }

    public Prodavnica(String ime, Namirnica... namirnice) {
        this.ime = ime;
        this.namirnice = new ArrayList<>(Arrays.asList(namirnice));
    }

    public void dodajNamirnicu(Namirnica n) {
        namirnice.add(n);
    }

    public void ukoloniNamirnicu(Namirnica n) {
        namirnice.remove(n);
    }
    //Overridovati toString() metod na sledeci nacin:
    //"Prodavnica <ime> ima sledece namirnice:
    // <imeNamirnice1> | <cenaNamirnice1>
    // ...
    // <imeNamirniceN> | <cenaNamriniceN>"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prodavnica ").append(ime).append(" ima sledece namirnice: ").append("\n");
        for (Namirnica namirnice : namirnice
        ) {
            sb.append(namirnice.getIme()).append(" ").append(namirnice.getCena());
        }
        return sb.toString();
    }
}
