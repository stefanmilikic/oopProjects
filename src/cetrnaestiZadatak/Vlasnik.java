package cetrnaestiZadatak;

import java.util.ArrayList;

public class Vlasnik {
    private ArrayList<Ljubimac> listaLjubimaca;

    public Vlasnik(ArrayList<Ljubimac> ljubimci) {
        this.listaLjubimaca = ljubimci;
    }
    public Vlasnik() {
        this.listaLjubimaca = new ArrayList<>();
    }

    public ArrayList<Ljubimac> getLjubimci() {
        return listaLjubimaca;
    }

    public void setLjubimci(ArrayList<Ljubimac> ljubimci) {
        this.listaLjubimaca = ljubimci;
    }

    public void dodajLjubimca(){Ljubimac lj = new Ljubimac();
        listaLjubimaca.add(lj);
    }
    public void oduzmiLjubimca(){
        Ljubimac lj = new Ljubimac();
        listaLjubimaca.remove(lj);
    }
    @Override
    public String toString() {
        Osoba o = new Osoba();
        for (int i = 0; i < listaLjubimaca.size() ; i++) {
            getLjubimci();
        }

        StringBuilder sb = new StringBuilder();
        sb.append(o.getIme()).append(" ").append(o.getPrezime()).append(" ima ljubimca: ");
        sb.append(getLjubimci());
        return "Vlasnik{}";
    }
}
