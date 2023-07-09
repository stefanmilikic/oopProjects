package trinaestiZadatak;

import java.util.Objects;

public class Namirnica {
    private String ime;
    private double cena;


    public Namirnica(String ime, double cena) {
        if (ime == null) {
            this.ime = "";
        } else this.ime = ime;
        if (cena < 0) {
            this.cena = 0;
        } else {
            this.cena = cena;
        }
    }

    public Namirnica() {
        this.cena = 0;
        this.ime= "";
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this.hashCode() != o.hashCode()) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Namirnica namirnica = (Namirnica) o;
        return Double.compare(namirnica.cena, cena) == 0 && Objects.equals(ime, namirnica.ime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, cena);
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append(ime).append(" ").append(cena);
        return sb.toString();
    }
}

