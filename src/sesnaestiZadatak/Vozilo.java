package sesnaestiZadatak;

public abstract class  Vozilo {
    private String registarskiBroj;
    private String marka;
    private String tip;

    public Vozilo(String registarskiBroj, String marka, String tip) {
        this.registarskiBroj = registarskiBroj;
        this.marka = marka;
        this.tip = tip;
    }
    public Vozilo() {
        this.registarskiBroj = "";
        this.marka = "";
        this.tip = "";
    }

    public String getRegistarskiBroj() {
        return registarskiBroj;
    }

    public void setRegistarskiBroj(String registarskiBroj) {
        this.registarskiBroj = registarskiBroj;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
    // char vratiKategoriju() - koja vraca karakter kategorije:
    // 'A' -> ukoliko je u pitanju motocikl
    // 'B' -> ukoliko je u pitanju auto
    // 'C' -> ukoliko je u pitanju kamion
    // 'D' -> ukoliko je u pitanju autobus
    //2. int brojTockova() - koja vraca broj tockova vozila
    //3. int brojPutnika() - koja vraca broj trenutnih putnika vozila
   public  abstract char vratiKategoriju();
    public abstract int brojTockova();
    public abstract int brojPutnika();

    @Override
    public String toString() {
        return "Vozilo{" +
                "registarskiBroj='" + registarskiBroj + '\'' +
                ", marka='" + marka + '\'' +
                ", tip='" + tip + '\'' +
                brojPutnika() + brojTockova();
    }
}
