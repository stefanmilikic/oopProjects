package cetrnaestiZadatak;

public class Ljubimac {
    private String ime;
    private String red;
    private int brojNogu;
    private boolean leti;
    private double tezina;
    //Napraviti jedan konstruktor koji prima sve argumente
    //Napraviti jedan prazan konstruktor koji postavlja sve niske na "" a ostale vrednosti na podrazumevane

    public Ljubimac(String ime, String red, int brojNogu, boolean leti, double tezina) {
        this.ime = ime;
        this.red = red;
        this.brojNogu = brojNogu;
        this.leti = leti;
        this.tezina = tezina;
    }

    public Ljubimac() {
        this.ime = "";
        this.red = "";
        this.leti = false;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public boolean isLeti() {
        return leti;
    }

    public void setLeti(boolean leti) {
        this.leti = leti;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    @Override
    public String toString() {
        if (leti = true){
            System.out.println("leti");
        } else System.out.println("ne leti");
        StringBuilder sb = new StringBuilder();
        sb.append("Ime ljubimca: ").append(ime);
        sb.append("Tip ljubimca je: ").append(red);
        sb.append("Ovaj ljubimac ima: ").append(brojNogu);
        sb.append("Ovaj ljubimac ").append(leti);
        sb.append("Ovaj ljubimac je tezak ").append(tezina);
        return sb.toString();
    }
}
