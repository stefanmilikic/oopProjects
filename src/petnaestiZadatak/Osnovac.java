package petnaestiZadatak;

import java.util.ArrayList;

public class Osnovac extends Ucenik {
    private ArrayList<String> listabojica;

    public Osnovac(String ime, String prezime, int godine, ArrayList<Double> listaOcena, ArrayList<String> listabojica) {

        super(ime, prezime, godine, listaOcena);
        if (godine >= 7 && godine <= 14) {
            setGodine(godine);
        }
        this.listabojica = listabojica;
    }

    public Osnovac(ArrayList<Double> listaOcena, ArrayList<String> listabojica) {
        super(listaOcena);
        this.listabojica = listabojica;
    }

    public Osnovac(ArrayList<String> listabojica) {
        this.listabojica = listabojica;
    }

    public Osnovac() {
        this.listabojica = new ArrayList<>();
    }

    public ArrayList<String> getListabojica() {
        return listabojica;
    }

    public void setListabojica(ArrayList<String> listabojica) {
        this.listabojica = listabojica;
    }

    //Napisati metode:
    //1. dodajBojicu(String b) - koja dodaje bojicu na listu bojica
    public void dodajBojicu(String b) {
        listabojica.add(b);
    }

    //2. dodajBojicu(String b, int i) - koja postavlja bojicu u listu bojica na indeks i
    public void dodajBojicu(String b, int i) {
        listabojica.add(i, b);
    }

    //3. ukloniBojicu(String b) - koja ukljanja bojicu b sa liste bojica
    public void ukloniBojicu(String b) {
        listabojica.remove(b);
    }

    //4. ukloniBojicu(int i) - koja ukljanja bojicu sa indexa i.
    public void ukloniBojicu(int i) {
        listabojica.remove(i);
    }
    //Overridovati metod prosek() tako da na svaku ocenu dodati 0.3 prilikom racunanja proseka,
    // pazeci da se ne predje gornja granica od 5.0 po oceni

    @Override
    public double prosek() {

        double suma = 0;
        for (Double ocena : getListaOcena()) {
            if (ocena <= 2.0) {
                //Ako je ovaj if ispunjen, postoji barem jedna jedinica pa je prosek sigurno 1.0
                return 1.0;
            }
            if (ocena > 1.7 && ocena < 4.6){
                ocena += 0.3;
            }
            suma += ocena;
        }
        //Ako smo ovde, onda nema ni jedne jedinice
        return suma / getListaOcena().size();
    }

}
