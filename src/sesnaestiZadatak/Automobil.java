package sesnaestiZadatak;

public class Automobil extends Vozilo {
    private int brojPutnika;

    public Automobil(String registarskiBroj, String marka, String tip, int brojPutnika) {
        super(registarskiBroj, marka, tip);
        this.brojPutnika = brojPutnika;
    }

    public Automobil(int brojPutnika) {
        if (brojPutnika <= 5) {
            this.brojPutnika = brojPutnika;
        } else System.out.println("nije dobar unos, max 5 putnika");
    }

    public Automobil() {

    }

    @Override
    public char vratiKategoriju() {
        return 0;
    }

    @Override
    public int brojTockova() {
        return 4;
    }

    @Override
    public int brojPutnika() {
        return 0;
    }

    public int getBrojPutnika() {
        return brojPutnika;
    }

    public void setBrojPutnika(int brojPutnika) {
        if (brojPutnika <= 5) {
            this.brojPutnika = brojPutnika;
        } else System.out.println("nije dobar unos, max 5 putnika");
    }

    //1. dodajPutnika() - koja dodaje jednog putnika u Auto, pazeci da auto moze najvise imati 5 putnika.
    public void dodajPutnika() {
        if (brojPutnika <= 5) {
            brojPutnika += 1;
            this.brojPutnika = brojPutnika;
        } else System.out.println("nije dobar unos, max 5 putnika");
    }

    //2. oduzmiPutnika() - koja oduzima jednog putnika iz Auta, pazeci da auto mzoe imati najmanje 0 putnika.
    public void oduzmiPutnika() {
        if (brojPutnika > 0) {
            brojPutnika -= 1;
            this.brojPutnika = brojPutnika;
        }
    }

    //3. dodajPutnika(int n) - koja dodaje n putnika u Auto. Ukoliko ne mogu da stanu svih n putnika,
    // onda ih dodati do gornje granice
    public void dodajPutnika(int n) {
        if (n <= 5) {
            brojPutnika += n;
        } else {
            brojPutnika += 5;
        }
    }

    //4. oduzmiPutnika(int n) - koja oduzima n putnika iz Auta. Ukoliko nema n putnika u autu,
    // izbaciti sve putnike iz auta.
    public void oduzmiPutnika(int n) {
        if (brojPutnika <= n) {
            for (int i = brojPutnika; i >= 0; i--) {
                brojPutnika -= 1;
            }
        }
    }

    //5. isprazniAuto() - izbacuje sve putnike iz auta
    public void isprazniAuto() {
        for (int i = brojPutnika; i >= 0; i--) {
            brojPutnika -= 1;
        }
    }

    //6. napuniAuto() - puni auto sa 5 putnika
    public void napuniAuto() {
        brojPutnika += 5;
    }

}
