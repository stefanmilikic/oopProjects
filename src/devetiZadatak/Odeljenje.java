package devetiZadatak;

import java.util.ArrayList;

public class Odeljenje {
    //Napisati klasu Odeljenje koja ima sledeca polja:
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    //Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.
    public void upisiUcenika(Ucenik u) {
        dnevnik.add(u);
        System.out.println();
    }

    //Napisati metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u}
    // u dnevnik na redni broj {redniBroj}
    public void upisiUcenika(Ucenik u, int redniBroj) {
        dnevnik.add(redniBroj, u);
        redniBroj++;
        System.out.println();
    }

    //Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.
    public void ispisiUcenika(Ucenik u) {
        dnevnik.remove(u);
    }

    //Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.
    public void ispisiUcenika(int i) {
        dnevnik.remove(i);
    }

    //Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.
    public void pogledajOcene(Ucenik u) {

        //kako izvuci ocene ucenika u
        for (int i = 0; i < dnevnik.size(); i++) {
            if (u.equals(dnevnik.get(i))) {
                System.out.println(dnevnik.get(i).getOcene());
            }
        }
        System.out.println();
    }

    //Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.
    public void pogledajOcene(int i) {
        System.out.println((dnevnik.get(i).getOcene()));
    }

    //Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.
    public double prosecnaOCena(Ucenik u) {
        ArrayList<Integer> novalista = u.getOcene();
        double suma = 0;

        for (int i = 0; i < novalista.size(); i++) {

            suma += novalista.get(i);
        }
        return suma / novalista.size();
    }

    //Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
    public double prosecnaOcena(int i) {
        double suma = 0;

        ArrayList<Integer> ocene = dnevnik.get(i).getOcene();
        for (int j = 0; j < ocene.size(); j++) {
            suma += ocene.get(j);
        }
        return suma / ocene.size();
    }
    //Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u
    // odeljenju).

    public double prosecnaOcenaOdeljenja() {
        double suma = 0;
        int brojOcena = 0;

        for (int i = 0; i < dnevnik.size(); i++) {
            ArrayList<Integer> ocene = dnevnik.get(i).getOcene();
            for (int j = 0; j < ocene.size(); j++) {
                suma += ocene.get(j);
                brojOcena++;
            }
        }

        if (brojOcena == 0) {
            return 0;  // Ako nema ocena, vraćamo 0
        }

        return suma / brojOcena;
    }

    //Napisati metod opisnaOcena(Ucenik u) koja ispisuje:
    //	- "Odlican"; ako je prosek ucenika {u} 4.5 ili vise
    //	- "Vrlo dobar"; ako je prosek ucenika {u} [3.5, 4.5)
    //	- "Dobar"; ako je prosek ucenika {u} [2.5, 3.5)
    //	- "Dovoljan"; ako je prosek ucenika {u} [1.5, 2.5)
    //	- "Nedovoljan"; ako ucenik {u} ima barem jednu jedinicu
    public void opisnaOcena(Ucenik u) {

        if (prosecnaOCena(u) >= 4.5) {
            System.out.println("Odlican");
        } else if (prosecnaOCena(u) >= 3.5) {
            System.out.println("Vrlodobar");
        } else if (prosecnaOCena(u) >= 2.5) {
            System.out.println("Dobar");
        } else if (prosecnaOCena(u) >= 1.5) {
            System.out.println("Dobar");
        } else {
            ArrayList<Integer> ocene = u.getOcene();
            if (ocene.contains(1)) {
                System.out.println("Nedovoljan");
            } else {
                System.out.println("Nema ocena");
            }


        }
    }
    //Napisati metod izlistajDnevnik() koja vraca String oblika:
    //	{ime} i {prezime} ima ocene:
    //	{ocene}
    public String izlistajDnevnik(){
        StringBuilder sb = new StringBuilder();
        for (Ucenik ucenik : dnevnik) {
            sb.append(ucenik.getIme());
            sb.append(ucenik.getPrezime());
            sb.append(ucenik.getOcene());
        }
        return sb.toString();
    }
    //za sve ucenike.
    //Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
    //	- "Veliko odeljenje"; ako ima vise od 25 ucenika
    //	- "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
    //	- "Malo odeljenje"; ako ima ucenika manje od 15
    //Napisati toString() metod:
    //	{Oznaka} odeljenja ima djake:
    //	{Ime1} {Prezime1}
    //	{Ime2} {Prezime2}
    //	.
    //	.
    //	.
    //	{ImeN} {PrezimeN}
    //
}
