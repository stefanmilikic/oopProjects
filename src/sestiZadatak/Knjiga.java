package sestiZadatak;

public class Knjiga {
    // Napisati klasu Knjiga koja ima sledeca polja/atribute:
    //nazivKnjige (string),
    //autor (Osoba),
    //vlasnik (Osoba)
    //brojStrana (int),
    //godinaIzdanja (int).
    //Broj strana i godina izadanje ne mogu biti negativni.
    // Ispisati poruku o gresci ako korisnik pokusa da napravi knjigu sa negativnim brojem strana
    // ili godinom izdanja (u konstruktoru, jer se tamo 'pravi' knjiga).
    //Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje neku od ove dve vrednosti na negativno.
    //Napisati sledece metode
    //	2 konstruktora. Knjiga ne mora imati vlasnika -> dakle jedan konstruktor gde se salje i ko je vlasnik,
    //	drugi konstruktor gde se ne salje ko je vlasnik
    //	getter i setter metode za sva polja
    //	toString koristeci stringBuilder
    //	format
    //		Naziv knjige je: <naziv knjige>
    //		Autor knjige je: <ime i prezime autora ako postoji, 'nepoznato' ako autor nije postavljen (null)>
    //		Vlasnik knjige je: <ime i prezime vlasnika ako postoji, 'knjiga nema vlasnika'
    //		ako vlasnik nije postavljen (null)>
    //		Broj strana: <broj strana>
    //		Godina izdanja: <godina izdanja>
    //	napisati i metodu "velicinaKnjige" koja vraca string
    //		- "mala knjiga" - ako je broj strana od 0 do 100
    //		- "srednje velika knjiga" - ako je broj strana od 101 do 300
    //		- "velika knjiga" - ako je broj strana od 301-600
    //		- "bas velika knjiga" - ako je broj strana 601 i vise
    private String nazivKnjige;
    private String autor;
    private String vlasnik;
    private int brojStrana;
    private int godinaIzdanja;

    public Knjiga(String nazivKnjige, String autor, String vlasnik, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.vlasnik = vlasnik;
        if (brojStrana > 0) {
            this.brojStrana = brojStrana;
        } else {
            this.brojStrana = 0;
            System.out.println("Greska");
        }
        if (godinaIzdanja > 0) {
            this.godinaIzdanja = godinaIzdanja;
        } else {
            this.godinaIzdanja = 0;
            System.out.println("Greska");
        }
    }

    public Knjiga() {
        this.nazivKnjige = "";
        this.autor = "";
        this.vlasnik = "";
        if (brojStrana > 0) {
            this.brojStrana = brojStrana;
        } else this.brojStrana = 0;
        if (godinaIzdanja > 0) {
            this.godinaIzdanja = godinaIzdanja;
        } else this.godinaIzdanja = 0;
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    //metodu "velicinaKnjige" koja vraca string
    //    //		- "mala knjiga" - ako je broj strana od 0 do 100
    //    //		- "srednje velika knjiga" - ako je broj strana od 101 do 300
    //    //		- "velika knjiga" - ako je broj strana od 301-600
    //    //		- "bas velika knjiga" - ako je broj strana 601 i vise
    public String velicinaKnjige(){
        String odgovor = "";
        if (getBrojStrana() <= 100) {
            odgovor= "mala knjiga";
        } else if (getBrojStrana() <= 300) {
            odgovor = "srednja knjiga";
        } else if (getBrojStrana() <= 600) {
            odgovor = "velika knjiga";
        } else odgovor = "bas velika knjiga";
        return odgovor;
    }

    @Override
    public String toString() {
        return "Knjiga";
    }
}
