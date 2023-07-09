package prviZadatak;

public class Test {
    //1. Napisati klasu Osoba, koja ima sledece atribute:
    //- ime
    //- prezime
    //- godinaRodjenja
    //- visina
    //Obezbediti konstruktor koji prima sve argumente za atribute i za svaki atribut getter i setter.
    //Napisati toString() metod koji ispisuje Osobu na sledeci nacin:
    //Ime osobe je: {ime}
    //Prezime osobe je: {prezime}
    //Godina rodjenja osobe je: {godinaRodjenja}
    //Visina osobe je: {visina}
    public static void main(String[] args) {
        Osoba stefan = new Osoba("Stefan", "Milikic", 1989, 180);
        System.out.println(stefan);
    }
}
