package devetiZadatak;

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;
    //Napisati 2 konstruktora, jedan koji prima argumente za sva polja, a drugi koji prima ime i prezime,
    // a ocene postavlja na praznu listu.
    //Napisati gettere i settere za sva polja.
    //Napisati toString() metod:
    //	{ime} i {prezime} ima ocene:
    //	{ocene}
    //Napisati metod proske koji racuna prosek Ucenika.

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }
    public Ucenik() {
        this.ime = "";
        this.prezime = "";
    }
    public double prosek(){
        int suma = 0;
        for (int i = 0; i < ocene.size() ; i++) {
            suma += ocene.get(i);
        } return suma / ocene.size();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }
}
