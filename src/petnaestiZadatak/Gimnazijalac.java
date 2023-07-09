package petnaestiZadatak;

import java.util.ArrayList;

public class Gimnazijalac extends Ucenik{
    private String maturski;

    public Gimnazijalac(String ime, String prezime, int godine, ArrayList<Double> listaOcena, String maturski) {
        super(ime, prezime, godine, listaOcena);
        if (getGodine() >= 15 && getGodine() < 19){
            setGodine(godine);
        } else godine = 15;
        this.maturski = maturski;
    }

    public Gimnazijalac(ArrayList<Double> listaOcena, String maturski) {
        super(listaOcena);
        this.maturski = maturski;
    }

    public Gimnazijalac() {
        this.maturski = "";
    }
    public Gimnazijalac(String maturski) {
        this.maturski = maturski;
    }

    public String getMaturski() {
        return maturski;
    }

    public void setMaturski(String maturski) {
        this.maturski = maturski;
    }

    @Override
    public double prosek() {
        double suma = 0;
        for (Double ocena : getListaOcena()) {
            if (ocena <= 2.0) {
                //Ako je ovaj if ispunjen, postoji barem jedna jedinica pa je prosek sigurno 1.0
                return 1.0;
            }
            if (ocena > 1.1 && ocena < 5){
                ocena -= 0.1;
            }
            suma += ocena;
        }
        //Ako smo ovde, onda nema ni jedne jedinice
        return suma / getListaOcena().size();
    }

}
