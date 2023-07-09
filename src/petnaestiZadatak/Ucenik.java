package petnaestiZadatak;

import java.util.ArrayList;
import java.util.Objects;

public class Ucenik extends Osoba{
    private ArrayList<Double> listaOcena;

    public Ucenik(String ime, String prezime, int godine, ArrayList<Double> listaOcena) {
        super(ime, prezime, godine);
        this.listaOcena = listaOcena;
    }

    public Ucenik(ArrayList<Double> listaOcena) {
        this.listaOcena = listaOcena;
    }
    public Ucenik() {
       this.listaOcena = new ArrayList<>();
    }
    //dodajOcenu(double x) - koja dodaje ocenu x u listu ocena.
    public void dodajOcenu(double x){
        for (int i = 0; i < listaOcena.size(); i++) {
            if (x > 0 && x <5){
                this.listaOcena.add(x);
            } else System.out.println("Nije dobar unos");
        }
    }
    //2. promeniOcenu(double x, int i) - koja menja ocenu na indexu i u ocenu x.
    public void promeniOcenu(double x, int i){
        for (int j = 0; j < listaOcena.size(); j++) {
            listaOcena.set(i, x);
        }
    }
    //3. izbrisiOcenu(int i) - koja brise ocenu na indeksu i
    public void izbrisiOcenu(int i){
        for (int j = 0; j < listaOcena.size(); j++) {
            listaOcena.remove(i);
        }
    }
    //4. izbrisiOcenu(double x) - koja brise ocenu x
    public void izbirisOcenu(Double x){
        for (int i = 0; i < listaOcena.size(); i++) {
            if (x.equals(listaOcena.get(i))){
                listaOcena.remove(i);
            }
        }
    }
    //5. prosek() - koja vraca ucenikov prosek. Ukoliko ucenik ima barem jednu jedinicu
    // (bilo koji broj x, 1.0 <= x < 2.0)
    public double prosek() {
        double suma = 0;
        for (Double ocena : listaOcena) {
            if (ocena <= 2.0) {
                //Ako je ovaj if ispunjen, postoji barem jedna jedinica pa je prosek sigurno 1.0
                return 1.0;
            }
            suma += ocena;
        }
        //Ako smo ovde, onda nema ni jedne jedinice
        return suma / listaOcena.size();
    }
    //6. kakavJeDjak() - koja vraca string na sledeci nacin:
    // "Nedovoljan" - ako ima barem jednu jedinicu
    // "Dovoljan" - ako je prosek u intervalu [2.0, 2.5)
    // "Dobar" - ako je prosek u intervalu [2.5. 3.5)
    // "Vrlo dobar" - ako je prosek u intervalu [3.5, 4.5)
    // "Odlican" - inace
    public void kakavJeDjak(){
        double p = prosek();
        if (prosek() > 4.5){
            System.out.println("Odlican");
        } else if (prosek() > 3.5) {
            System.out.println("Vrlodobar");
        } else if (prosek()> 2.5) {
            System.out.println("dobar");
        } else if (prosek() > 2) {
            System.out.println("dovoljan");
        } else System.out.println("Nedovoljan");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //"<ime> <prezime> <brGodina> ima ocene:
        // [<ocena1>, <ocena2>, ..., <ocenaN>]
        // Prosek: <prosek>"
        Osoba o = new Osoba();
        sb.append(o.getIme()).append(" ").append(o.getPrezime()).append(" ima ").append(getGodine()).append("\n");
        sb.append(listaOcena.toString());
        sb.append("Prosek: ").append(prosek());
        return sb.toString();
    }

    public ArrayList<Double> getListaOcena() {
        return listaOcena;
    }

    public void setListaOcena(ArrayList<Double> listaOcena) {
        this.listaOcena = listaOcena;
    }
}

