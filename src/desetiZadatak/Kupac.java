package desetiZadatak;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Kupac {
    private Osoba kupac;
    private  double racun; // (novac sa kojim kupac raspolaze)
    private Korpa korpa; // (korpa nekog kupca)
    private ArrayList<Film> filmovi; // (filmovi koje je kupac kupio)
    //Napraviti konstruktor koji pravi novog kupca i postavlja da su korpa i filmovi koje vec poseduje prazni.

    public Kupac(Osoba kupac, double racun, Korpa kopra, ArrayList<Film> filmovi) {
        this.kupac = kupac;
        this.racun = racun;
        this.korpa = korpa;
        this.filmovi = filmovi;
    }
    public Kupac(Osoba kupac ) {
        this.kupac = kupac;
        this.filmovi = new ArrayList<>();
    }

    public Osoba getKupac() {
        return kupac;
    }

    public void setKupac(Osoba kupac) {
        this.kupac = kupac;
    }

    public double getRacun() {
        return racun;
    }

    public void setRacun(double racun) {
        this.racun = racun;
    }

    public Korpa getKorpa() {
        return korpa;
    }

    public void setKorpa(Korpa korpa) {
        this.korpa = korpa;
    }

    public ArrayList<Film> getFilmovi() {
        return filmovi;
    }

    public void setFilmovi(ArrayList<Film> filmovi) {
        this.filmovi = filmovi;
    }

    //Napisati metodu kupi() - kupuje sve filmove iz korpe i smesta ih u listu filmova,
    // ako kupac ima dovoljno novca za to i ispisuje:
    //	"Uspesno kupljeno {brojStavki} filmova".
    //	U suprotnom ispisuje poruku:
    //	"Nemate dovoljno novca!
    //	 Potrebno: {ukupnaCenaKorpe}
    //	 Na raspolaganju: {racun}"
    public void kupi(){
        if (getKorpa().getUkupnaCena() < racun){
            System.out.println("Uspesno kupljeno");
        } else System.out.println("Nemate dovoljno novca, imate " + getRacun() + " a fali vam " + (getKorpa().getUkupnaCena()-getRacun()));
    }

    //Napisati metodu pregledajFilmove() - ispisuje sve filmove koje kupac poseduje:
    //	"{nazivFilma1} {brojKopijaFilma1}"
    //	.
    //	.
    //	.
    //	"{nazivFilmaN} {brojKopijaFilmaN}"
    //	"Ukupno filmova: {brojFilmova}"
    //	"Ukupna duzina trajanja: {sati} : {minuti} : {sekunde}"
}
