package sesnaestiZadatak;

import java.util.ArrayList;

public class Kamion extends Vozilo {
    private int brojPutnika;
    private ArrayList<String> proizvodi;

    public Kamion(String registarskiBroj, String marka, String tip, int brojPutnika, ArrayList<String> proizvodi) {
        super(registarskiBroj, marka, tip);
        this.brojPutnika = brojPutnika;
        this.proizvodi = proizvodi;
    }

    public Kamion(int brojPutnika, ArrayList<String> proizvodi) {
        this.brojPutnika = brojPutnika;
        this.proizvodi = proizvodi;
    }

    public Kamion() {

        this.proizvodi = new ArrayList<>();
    }

    public int getBrojPutnika() {
        return brojPutnika;
    }

    public void setBrojPutnika(int brojPutnika) {
        this.brojPutnika = brojPutnika;
    }

    public ArrayList<String> getProizvodi() {
        return proizvodi;
    }

    public void setProizvodi(ArrayList<String> proizvodi) {
        this.proizvodi = proizvodi;
    }

    @Override
    public char vratiKategoriju() {
        return 0;
    }

    @Override
    public int brojTockova() {
        return 10;
    }

    @Override
    public int brojPutnika() {
        return 0;
    }

    //Napisati metode:
    //1. dodajPutnika() - koja dodaje jednog putnika u Kamion, pazeci da kamion moze najvise imati 1 putnika.
    public void dodajPutnika() {
        if (brojPutnika <= 1) {
            brojPutnika += 1;
        }
    }

    //2. oduzmiPutnika() - koja oduzima jednog putnika iz Kamiona, pazeci da kamion moze imati najmanje 0 putnika.
    public void oduzmiPutnika() {
        if (brojPutnika == 1) {
            brojPutnika -= 1;
        }
    }

    //3. dodajPutnika(int n) - koja dodaje n putnika u Kamiona.
    // Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
    public void dodajPutnika(int n) {
        if (brojPutnika <= 1) {
            brojPutnika += 1;
        }
    }

    //4. oduzmiPutnika(int n) - koja oduzima n putnika iz Kamiona.
    // Ukoliko nema n putnika u autu, izbaciti sve putnike iz kamiona.
    public void oduzmiPutnika(int n) {
        if (brojPutnika == 1) {
            brojPutnika -= 1;
        }
    }

    //5. isprazniKamion() - izbacuje sve putnike im kamiona
    public void isprazniKamion() {
        if (brojPutnika == 1) {
            brojPutnika -= 1;
        }
    }

    //6. napuniKamion() - puni kamion sa 2 putnika
    public void napuniKamion() {
        if (brojPutnika < 3) {
            brojPutnika += 2;
        }
    }
    //7. dodajProizvod(String s) - koji dodaje proizvod u kamion
    public void dodajProizvod(String s){
        proizvodi.add(s);
    }
    //8. oduzmiProizvod(String s) - koji oduzima proizvod iz kamiona
    public void oduzmiProizvod(String s){
        for (int i = 0; i < proizvodi.size(); i++) {
            proizvodi.remove(s);
        }
    }


}
