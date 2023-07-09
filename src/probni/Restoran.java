package probni;

import java.util.ArrayList;

public class Restoran extends UgostiteljskiObjekat {
    private int brSlobodnihStolova;

    public Restoran(String naziv, double prosecnaOcena, int brMichelinZvezda, ArrayList<String> recenzije, int brSlobodnihStolova) {
        super(naziv, prosecnaOcena, brMichelinZvezda, recenzije);
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public Restoran(String naziv, double prosecnaOcena, int brMichelinZvezda, int brSlobodnihStolova) {
        super(naziv, prosecnaOcena, brMichelinZvezda);
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public Restoran(String naziv, double prosecnaOcena, int brSlobodnihStolova) {

        super(naziv, prosecnaOcena);
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public Restoran(String naziv, int brSlobodnihStolova) {
        super(naziv);
        this.brSlobodnihStolova = 25;
    }

    public int getBrSlobodnihStolova() {
        return brSlobodnihStolova;
    }

    public void setBrSlobodnihStolova(int brSlobodnihStolova) {
        if (brSlobodnihStolova < 0) {
            this.brSlobodnihStolova = brSlobodnihStolova;
        }
    }

    @Override
    public void dodajOcenu(double ocena) {
//Ukoliko je prosledjena ocena veca ili jednaka od prosecne ocene restorana, onda je umanjiti za 0.3
// i izracunati i zapamtiti novu prosecnu ocenu restorana. (kao prosek prosledjene i trenutne)
//Ukoliko je prosledjena ocena veca ili jednaka od 4.5 ili manja ili jednaka od 2.0 azurirati broj zvezda restorana.
        if (ocena >= 4.5) {
            setBrMichelinZvezda(getBrMichelinZvezda() +1);
        }
        if (ocena <= 2){
            setBrMichelinZvezda(getBrMichelinZvezda() -1);
        }
        if (ocena > 0) {
            if (ocena >= getProsecnaOcena()) {
                ocena -= 0.3;
            }
            double nova = ocena + getProsecnaOcena();
            nova /= 2;
        } else getProsecnaOcena();
    }

    @Override
    public void azurirajZvezdu() {
//Ukoliko je prosecna ocena strogo iznad 4.5, dodati 2 zvezde restoranu.
        if (getProsecnaOcena() > 4.5){
            setBrMichelinZvezda(getBrMichelinZvezda() + 2);
        }
//Ukoliko je prosecna ocena strogo veca od 3.5 a ispod 4.5, dodati 1 zvezdu restoranu.
        if (getProsecnaOcena() > 3.5 && getProsecnaOcena() <=4.5){
            setBrMichelinZvezda(getBrMichelinZvezda() + 1);
        }
// Ukoliko je prosecna ocena strogo veca od 3.0 a ispod 3.5, oduzeti 1 zvezdu restoranu.
        if (getProsecnaOcena() > 3 && getProsecnaOcena() <= 3.5 ){
            setBrMichelinZvezda(getBrMichelinZvezda() - 1);
        }
// Ukoliko je prosecna ocena manja ili jednaka od 3.0, oduzeti 2 zvezde restoranu.
        if (getProsecnaOcena() <= 3){
            setBrMichelinZvezda(getBrMichelinZvezda() - 2);
        }
    }

    public boolean imaLiSlobodnihStolova() {
        if (getBrSlobodnihStolova() > 0) {
            return true;
        }
        return false;
    }

    public void oslobodiSto() {
        if (!imaLiSlobodnihStolova()) {
            brSlobodnihStolova -= 1;
        }
    }

    public void oslobodiSto(int x) {
        if (imaLiSlobodnihStolova() && brSlobodnihStolova <= 25) {
            brSlobodnihStolova -= x;
        }
    }

    public void zaokupiSto() {
        if (imaLiSlobodnihStolova() && brSlobodnihStolova < 25) {
            brSlobodnihStolova += 1;
        }
    }

    public void zaokupiSto(int x) {
        if (imaLiSlobodnihStolova() && brSlobodnihStolova < 25) {
            if (x <= 25) {
                brSlobodnihStolova += x;
            } else brSlobodnihStolova += 1;
            ;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNaziv()).append(" ").append(brMichelinZvezda * '*').append(getProsecnaOcena()).append("\n");
        for (int i = 0; i < getRecenzije().size(); i++) {
            sb.append(getRecenzije().get(i));
            if (i != getRecenzije().size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
