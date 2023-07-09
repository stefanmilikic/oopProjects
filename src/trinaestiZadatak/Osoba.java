package trinaestiZadatak;

public class Osoba {
    private String ime, prezime;
    private int brojGodina;

    public Osoba(String ime, String prezime, int brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }
    public Osoba() {
        this.ime = "";
        this.prezime = "";

    }
}
