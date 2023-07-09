package sesnaestiZadatak;

public class Motocikl extends Vozilo {
    private int brojPutnika;

    public Motocikl(String registarskiBroj, String marka, String tip, int brojPutnika) {
        super(registarskiBroj, marka, tip);
        this.brojPutnika = brojPutnika;
    }

    public Motocikl(int brojPutnika) {
        this.brojPutnika = brojPutnika;
    }
    public Motocikl() {
    }
    @Override
    public char vratiKategoriju() {
        return 0;
    }

    @Override
    public int brojTockova() {
        return 2;
    }

    @Override
    public int brojPutnika() {
        return 0;
    }

    public int getBrojPutnika() {
        return brojPutnika;
    }

    public void setBrojPutnika(int brojPutnika) {
        this.brojPutnika = brojPutnika;
    }

    //Napisati metode:
    //1. dodajPutnika() - koja dodaje jednog putnika na Motor, pazeci da motocikl moze najvise imati 2 putnika.
    public void dodajPutnika(){
        if (brojPutnika <=2){
            brojPutnika =+1;
        }
    }
    //2. oduzmiPutnika() - koja oduzima jednog putnika sa Motora, pazeci da motor moze imati najmanje 0 putnika.
    public void oduzmiPutnika(){
        if (brojPutnika ==1 || brojPutnika == 2){
            brojPutnika -=1;
        }
    }
    //3. dodajPutnika(int n) - koja dodaje n putnika u Motor. Ukoliko ne mogu da stanu svih n putnika,
    // onda ih dodati do gornje granice
    public void dodajPutnika(int n){
      if (n>=2){
          brojPutnika +=n;
      } else brojPutnika +=2;
    }
    //4. oduzmiPutnika(int n) - koja oduzima n putnika iz Motora.
    // Ukoliko nema n putnika u autu, izbaciti sve putnike sa motocikla.
    public void oduzmiPutnika(int n){
        if (n ==1 || n ==2){
            brojPutnika-=n;
        } else brojPutnika -=2;
    }
    //5. isprazniMotor() - izbacuje sve putnike sa motora
    public void isprazniMotor(){
        while (brojPutnika == 0){
            brojPutnika-=1;
        }
    }
    //6. napuniMotor() - puni motor sa 2 putnika
    public void napuniMotor(){
        brojPutnika +=2;
    }

}
