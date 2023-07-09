package petnaestiZadatak;

import java.util.ArrayList;
import java.util.Objects;

public class Profesor extends Osoba{
    private ArrayList<String> predmetiKojePredaje;

    public Profesor(String ime, String prezime, int godine, ArrayList<String> predmetiKojePredaje) {
        super(ime, prezime, godine);
        this.predmetiKojePredaje = predmetiKojePredaje;
    }

    public Profesor(ArrayList<String> predmetiKojePredaje) {
        this.predmetiKojePredaje = predmetiKojePredaje;
    }
    public Profesor() {
        this.predmetiKojePredaje = new ArrayList<>();
    }
    //Napisati metode:

    //2. add(String predmet, int i) - koja postavlja predmet na index i u listi predmeta

    //3. addAll(ArrayList<String> predmeti) - koja postavlja sve predmete iz prosledjene liste na listu predmeta
    // koje profesor predaje
    //4. remove(int i) - koja brise predmet sa indeksa i iz liste predmeta
    //5. remove(String predmet) - koja brise predmet sa istim imenom iz liste predmeta kao prosledjeni predmet
    public void add(String predmet){
        predmetiKojePredaje.add(predmet);
    }
    public void add(String predmet, int i){
        predmetiKojePredaje.add(i, predmet);
    }
    public void addAll(ArrayList<String> predmeti){
        addAll(predmeti);
    }
    public void remove(int i) {
        predmetiKojePredaje.remove(i);
    }
    public void remove(String predmet){
        predmetiKojePredaje.remove(predmet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this.hashCode() != o.hashCode()) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(predmetiKojePredaje, profesor.predmetiKojePredaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(predmetiKojePredaje);
    }
}
