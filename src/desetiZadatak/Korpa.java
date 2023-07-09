package desetiZadatak;

import java.util.ArrayList;

public class Korpa {
    private VideoKlub vk;
    private ArrayList<Film> korpa;
    private double ukupnaCena; // (ukupna cena filmova u korpi)

    public Korpa(VideoKlub vk, ArrayList<Film> korpa, double ukupnaCena) {
        this.vk = vk;
        this.korpa = korpa;
        this.ukupnaCena = ukupnaCena;
    }

    public Korpa() {
        this.vk = vk;
        this.korpa = new ArrayList<>();
    }

    public VideoKlub getVk() {
        return vk;
    }

    public void setVk(VideoKlub vk) {
        this.vk = vk;
    }

    public ArrayList<Film> getKorpa() {
        return korpa;
    }

    public void setKorpa(ArrayList<Film> korpa) {
        this.korpa = korpa;
    }

    public double getUkupnaCena() {
        return ukupnaCena;
    }

    public void setUkupnaCena(double ukupnaCena) {
        this.ukupnaCena = ukupnaCena;
    }

    //Napisati metodu dodajFilmUKorpu(Film f) -
    // dodaje jednu kopiju film f u korpu ako ga ima na stanju u zadatom video klubu.
    //	AKo zadatog filma nema na stanju ispisati poruku:
    //	"Film {f} nema na stanju."
    public void dodajFilmUKorpu(Film f) {
        
        for (int i = 0; i < vk.getKatalog().size(); i++) {
            if (f.equals(vk.getKatalog().get(i))) {
                korpa.add(f);
            } else System.out.println("Nema filma " + f.getIme() + " na stanju");
        }
    }

    //Napisati metodu dodajFilmaUKorpu(Film f, int n) -
    // dodaje n kopija filma f u kopru ako ga ima na stanju u zadatom video klubu.
    //	Ako u video klubu ima manje od n kopija filma f, onda dodati sve preostale kopije u korpu i ispisati poroku:
    //	"Nije moguce kupiti {n} filmova {nazivFilma}.
    //	 U korpu je dodato {brojKopija} kopija filma {nazivFilma}."
    public void dodajFilmUKorpu(Film f, int n) {
        int brojac = 0;
        for (int i = 0; i < vk.getKatalog().size(); i++) {
            if (f.equals(vk.getKatalog().get(i))) {
                brojac++;
            } else System.out.println("Nema filma");
        }
        if (brojac >= n) {
            for (int i = 0; i < n; i++) {
                korpa.add(f);
            }
            System.out.println("U korpu je dodato " + n + " kopija.");
        } else {
            for (int i = 0; i < brojac; i++) {
                korpa.add(f);
            }
            System.out.println("U korpu je dodato " + brojac + " kopija.");
        }
    }

    //Napisati metod izbaciIzKorpe(Film f) - izbacuje jednu kopiju filma f iz korpe
    // (pretpostaviti da takav film uvek postoji u korpi).
    //	Ispisati poruku:
    //	"Izbacili ste kopiju filma {nazivFilma} iz korpe".
    public void izbaciIzKorpe(Film f) {
        korpa.remove(f);
        System.out.println("Izbacili ste kopiju filma  " + f.getIme() + " iz korpe.");

    }

    //Napisati metod izbaciIzKorpe(Film f, int n) - izbacuje n kopija filma f iz korpe i ispisati poruku:
    //	"Izbacili ste {n} kopija filma {nazivFilma} iz korpe.".
    //	Ako je prosledjen broj n veci ili jednak broju kopija filma f u korpi ispisati poruku:
    //	"Izbacili ste sve kopije filma {nazivFilma} iz korpe."
    public void izbaciIzKorpe(Film f, int n) {
        int brojac = 0;

        for (int i = 0; i < korpa.size(); i++) {
            if (f.equals(korpa.get(i))) {
                brojac++;
            }
        }
        if (brojac >= n) {
            for (int i = 0; i < n; i++) {
                korpa.remove(f);
            }
            System.out.println("Izbacili ste " + n + " kopija iz korpe.");
        } else {
            for (int i = 0; i < brojac; i++) {
                korpa.remove(f);
            }
            System.out.println("Izbacili ste " + brojac + " kopija iz korpe.");
        }

    }

    //Napisati metod izbaciIzKopreSveKopije(Film f) - izbacuje sve kopije filma f iz korpe i ispisuje poruku:
//	"Izbacili ste sve kopije filma {nazivFilma} iz korpe."
    public void izbaciIzKorpeSveKopije(Film f) {
        for (int i = korpa.size() -1; i >= 0 ; i--) {
            korpa.remove(f);
        }
    }
//Napisati metod izbaciSveIzKorpe() - potpuno prazni korpu i ispisuje poruku:
//	"Korpa je sada prazna."
    public void izbaciSveizKorpe(){
        korpa.clear();
    }

//Napisati metod ispisiInventarKorpe() koja ispisuje inventar korpe:
//	"{nazivFilma1} {brojKopijaFilma1UKorpi} {ukupnaCenaSvihKopijaFilma1UKopri}
//	 .
//	 .
//	 .
//	 {nazivFilmaN} {brojKopijaFilmaNUKorpi} {ukupnaCenaSvihKopijaFilmaNUKopri}"
//	 Ukupna cena: {ukupnaCena} svih filmova u korpi"
}
