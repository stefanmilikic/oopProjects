package desetiZadatak;

public class FilmNaStanju {
    private Film film;
    private int kolicina; // (koliko kopija datog filma ima u nekom video klubu)
    private double cena; //(koliko kosta dati film da se iznajmi u nekom video klubu)

    public FilmNaStanju(Film film, int kolicina, double cena) {
        this.film = film;
        this.kolicina = kolicina;
        this.cena = cena;
    }
    public FilmNaStanju() {
        this.film = new Film();

    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
