package desetiZadatak;

import java.util.ArrayList;

public class VideoKlub {
    private String naziv; // (naziv video kluba)
    private ArrayList<Film> katalog; //(katalog svih filmova na stanju)

    public VideoKlub(String naziv, ArrayList<Film> katalog) {
        this.naziv = naziv;
        this.katalog = katalog;
    }

    public VideoKlub() {
        this.naziv = "";
        this.katalog = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Film> getKatalog() {
        return katalog;
    }

    public void setKatalog(ArrayList<Film> katalog) {
        this.katalog = katalog;
    }

    //Napisati metod iznajmiFilm(Film f) - iznajmljuje jednu kopiju filma f ako je to moguce.
    // Ako nije, ispisati na konzolu poruku:
    public void iznajmiFilm(Film f) {
        int brojac = 0;
        for (int i = 0; i < katalog.size(); i++) {
            if (f.equals(katalog.get(i).getIme())) {
                brojac++;
                System.out.println("Imamo film na stanu" + brojac + " kopija.");
            } else System.out.println("Nemamo film na stanju.");
        }
    }

    //Napisati metod iznajmiFilm(Film f, int n) - iznajmljuje n kopija filma f ako je to moguce.
// Ako nije moguce iznajmiti sve,iznajmiti sto vise kopija datog filma i ispisati poruku:
//    //	"Jos {brojKupacaKojiJosCekaNaIznjamljivanje} kupaca zeli da iznajmi film {nazivFilma}"
//    //	Ako nije moguce iznajmiti ni jedan film ipisati poruku:
//    //	"Film {nazivFilma} trenutno nema na stanju".
    public void iznajmiFilm(Film f, int n) {
        int brojac = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < katalog.size(); j++) {
                if (f.equals(katalog.get(i).getIme())) {
                    brojac++;
                    System.out.println("imamo" + brojac + " kopija tog filma");
                } else System.out.println("Nemamo taj film");
            }
        }
    }

    //Napisati metod dodajFilm(Film f, double c) - dodaje jednu kopiju filma f u katalog i postavlja mu cenu na c.
    public void dodajFilm(Film f, double c) {
        FilmNaStanju stanje = new FilmNaStanju();
        katalog.add(f);
        c += stanje.getCena();
    }

    //Napisati metod dodajFilm(Film f, double c, int n) - dodaje n kopija filma f u katalog i postavlja im cenu na c.
    public void dodajFilm(Film f, double c, int n) {
        FilmNaStanju stanje = new FilmNaStanju();
        for (int i = 0; i < n; i++) {
            katalog.add(f);
            c += stanje.getCena();
        }
    }

    public void pregledajFilm(Film f) {
        FilmNaStanju stanje = new FilmNaStanju();
        StringBuilder sb1 = new StringBuilder();
        sb1.append(f.getIme()).append(stanje.getCena()).append(stanje.getKolicina()).append("\n");
        sb1.append(f.getSadrzaj());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f.getIme()).append(" nema na stanju").append("\n");
        for (int i = 0; i < katalog.size(); i++) {
            if (f.equals(katalog.get(i).getIme())) {
                System.out.println(sb1);
            } else System.out.println(sb2);
        }
    }
    public void pregledajKatalog(){
        FilmNaStanju stanje = new FilmNaStanju();
        for (Film f: katalog
             ) {
            System.out.println(f.getIme() + " " + stanje.getKolicina());
        }
    }

}
