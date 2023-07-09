package probni;

import java.util.ArrayList;

public abstract class UgostiteljskiObjekat {
    private String naziv;
    private double prosecnaOcena;
    public int brMichelinZvezda;
    private ArrayList<String> recenzije;

    public UgostiteljskiObjekat(String naziv, double prosecnaOcena, int brMichelinZvezda, ArrayList<String> recenzije) {
        this.naziv = naziv;
        if (prosecnaOcena > 0 && prosecnaOcena <= 5) {
            this.prosecnaOcena = prosecnaOcena;
        }
        if (brMichelinZvezda >= 0 && brMichelinZvezda <= 3) {
            this.brMichelinZvezda = brMichelinZvezda;
        }
        this.recenzije = recenzije;
    }

    public UgostiteljskiObjekat(String naziv, double prosecnaOcena, int brMichelinZvezda) {
        this.naziv = "";
        if (prosecnaOcena > 0 && prosecnaOcena <= 5) {
            this.prosecnaOcena = prosecnaOcena;
        }
        if (brMichelinZvezda >= 0 && brMichelinZvezda <= 3) {
            this.brMichelinZvezda = brMichelinZvezda;
        }
        this.recenzije = new ArrayList<>();
    }

    public UgostiteljskiObjekat(String naziv, double prosecnaOcena) {
        this.naziv = naziv;
        if (prosecnaOcena > 0 && prosecnaOcena <= 5) {
            this.prosecnaOcena = prosecnaOcena;
        }

        this.brMichelinZvezda = 0;

        this.recenzije = new ArrayList<>();
    }

    public UgostiteljskiObjekat(String naziv) {
        this.naziv = naziv;
        this.prosecnaOcena = 3;
        this.brMichelinZvezda = 0;
        this.recenzije = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getProsecnaOcena() {
        return prosecnaOcena;
    }

    public void setProsecnaOcena(double prosecnaOcena) {
        if (prosecnaOcena < 0) {
            this.prosecnaOcena = prosecnaOcena;
        }
    }

    public int getBrMichelinZvezda() {
        return brMichelinZvezda;
    }

    public void setBrMichelinZvezda(int brMichelinZvezda) {
        if( brMichelinZvezda >= 0 && brMichelinZvezda <= 3) {
            this.brMichelinZvezda = brMichelinZvezda;
        }
    }

    public ArrayList<String> getRecenzije() {
        return recenzije;
    }

    public void setRecenzije(ArrayList<String> recenzije) {
        this.recenzije = recenzije;
    }

    public void dodajViseOcena(ArrayList<Double> ocene) {
        int suma = 0;
        for (int i = 0; i < ocene.size(); i++) {
            suma += ocene.get(i);
        }
        this.prosecnaOcena = (getProsecnaOcena() + suma / ocene.size()) / 2;
        this.brMichelinZvezda = (int) prosecnaOcena;
    }

    public abstract void dodajOcenu(double ocena);

    public abstract void azurirajZvezdu();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append(" ").append(brMichelinZvezda * '*').append(prosecnaOcena).append("\n");
        for (int i = 0; i < recenzije.size(); i++) {
            sb.append(recenzije.get(i));
            if (i != recenzije.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
