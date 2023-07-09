package prviZadatak;

public class Osoba {
    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private double visina;

    public Osoba(String ime, String prezime, int godinaRodjenja, double visina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.visina = visina;
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

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public Osoba() {
        this.ime = "";
        this.prezime = "";
        this.godinaRodjenja = 0;
        this.visina = 0;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime osobe je ").append(ime).append(" ").append(prezime);
        sb.append(ime).append(" ima ").append(2023-godinaRodjenja).append(" godina.");
        sb.append(ime).append(" ima visinu ").append(visina);
        return sb.toString();
    }
}
