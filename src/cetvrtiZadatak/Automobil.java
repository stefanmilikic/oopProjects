package cetvrtiZadatak;

public class Automobil {

    private String marka;
    private String zemljaPorekla;
    private int godinaProizvodnje;
    private double kolometraza;
    //Napraviti dva konstruktora koja prima sve argumente, s tim da prvi prima godinu proizvodnja kao int,
    // a drugi kao String (pa ga parsirati kasnije).

    public Automobil(String marka, String zemljaPorekla, int godinaProizvodnje, double kolometraza) {
        this.marka = marka;
        this.zemljaPorekla = zemljaPorekla;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kolometraza = kolometraza;
    }
    public Automobil(String marka, String zemljaPorekla, String godinaProizvodnje, double kolometraza) {
        this.marka = marka;
        this.zemljaPorekla = zemljaPorekla;
        this.godinaProizvodnje = Integer.parseInt(godinaProizvodnje);
        this.kolometraza = kolometraza;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getZemljaPorekla() {
        return zemljaPorekla;
    }

    public void setZemljaPorekla(String zemljaPorekla) {
        this.zemljaPorekla = zemljaPorekla;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public double getKolometraza() {
        return kolometraza;
    }

    public void setKolometraza(double kolometraza) {
        this.kolometraza = kolometraza;
    }
}
