package sesnaestiZadatak;

public class Autobus extends Vozilo{
    private int brojPutnika;

    @Override
    public char vratiKategoriju() {
        return 0;
    }

    @Override
    public int brojTockova() {
        return 8;
    }

    @Override
    public int brojPutnika() {
        return 0;
    }
    //Napisati metode:
    //1. dodajPutnika() - koja dodaje jednog putnika u Autobus, pazeci da Autobus moze najvise imati 90 putnika.
    public void dodajPutnika(){
        if (brojPutnika <=90){
            brojPutnika+=1;
        }
    }
    //2. oduzmiPutnika() - koja oduzima jednog putnika iz Autobusa,
    // pazeci da Autobus moze imati najmanje 0 putnika.
    public void oduzmiPutnika(){
        if (brojPutnika !=0 && brojPutnika <90){
            brojPutnika-=1;
        }
    }
    //3. dodajPutnika(int n) - koja dodaje n putnika u Autobus.
    // Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
    public void dodajPutnika(int n){
        if (n<=90){
           brojPutnika+=n;
        } else brojPutnika +=90;
    }
    //4. oduzmiPutnika(int n) - koja oduzima n putnika iz Autobusa.
    // Ukoliko nema n putnika u Autobus, izbaciti sve putnike iz Autobusa.
    public void oduzmiPutnika(int n){
        if (brojPutnika <= n) {
            for (int i = brojPutnika; i >= 0; i--) {
                brojPutnika -= 1;
            }
        }
    }
    //5. isprazniAutobus() - izbacuje sve putnike iz Autobusa
    public void isprazniAutobus(){
        while (brojPutnika == 0){
            brojPutnika-=1;
        }
    }
    //6. napuniAutobus() - puni Autobus sa 2
    public void napuniAutobuc(){
        while (brojPutnika == 90){
            brojPutnika+=2;
        }
    }
}
