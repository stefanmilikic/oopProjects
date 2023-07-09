package drugiZadatak;

public class Pravougaonik {
   private double sirina;
    private double visina;

    public Pravougaonik(double sirina, double visina) {
        this.sirina = sirina;
        this.visina = visina;
    }
    public Pravougaonik() {
        this.sirina = 0;
        this.visina = 0;
    }
    public double obim() {
        return 2*sirina + 2 *visina;
    }
    public double povrsina(){
        return visina * sirina;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Obim je ").append(obim()).append(" a povrsina je ").append(povrsina());
        return sb.toString();
    }
}
