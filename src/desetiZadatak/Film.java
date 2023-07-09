package desetiZadatak;

public class Film {
    private String ime;
    private int godinaPremijere;
    private double ocena;
    private String sadrzaj;
    private int sati;
    private int minuti;
    private int sekunde;

    public Film(String ime, int godinaPremijere, double ocena, String sadrzaj, int sati, int minuti, int sekunde) {
        this.ime = ime;

        if (godinaPremijere >= 1888 && godinaPremijere <= 2021) {
            this.godinaPremijere = godinaPremijere;
        } else this.godinaPremijere = 2021;

        if (ocena > 1 && ocena <= 10) {
            this.ocena = ocena;
        } else this.ocena = 1;
        this.sadrzaj = sadrzaj;
        if (sati > 0 && sati < 10) {
            this.sati = sati;
        } else this.sati = 1;
        if (minuti > 0 && minuti < 60) {
            this.minuti = minuti;
        } else this.minuti = 30;
        if (sekunde > 0 && sekunde < 60) {
            this.sekunde = sekunde;
        }
    }

    public Film() {
        this.ime = "";
        if (godinaPremijere >= 1888 && godinaPremijere <= 2021) {
            this.godinaPremijere = godinaPremijere;
        } else this.godinaPremijere = 2021;
        if (ocena > 1 && ocena <= 10) {
            this.ocena = ocena;
        } else this.ocena = 1;
        this.sadrzaj = sadrzaj;
        if (sati > 0 && sati < 10) {
            this.sati = sati;
        } else this.sati = 1;
        if (minuti > 0 && minuti < 60) {
            this.minuti = minuti;
        } else this.minuti = 30;
        if (sekunde > 0 && sekunde < 60) {
            this.sekunde = sekunde;
        }
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaPremijere() {
        return godinaPremijere;
    }

    public void setGodinaPremijere(int godinaPremijere) {
        this.godinaPremijere = godinaPremijere;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    public int getSati() {
        return sati;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public int getMinuti() {
        return minuti;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public int getSekunde() {
        return sekunde;
    }

    public void setSekunde(int sekunde) {
        this.sekunde = sekunde;
    }

    @Override
    public String toString() {
        //Napisati toString() metod:
        //	"{ime} {godinaPremijere} {ocena}
        //	 Duzina trajanja: {sati} : {minuti} : {sekunde}
        //	 {sadrzaj}"
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append("").append(godinaPremijere).append(ocena).append("\n");
        sb.append("Duzina: ").append(sati).append(minuti).append(sekunde).append("\n");
        sb.append(sati);
        return sb.toString();
    }
}
