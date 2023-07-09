package petiZadatak;

public class Trougao {
    //Napisati klasu Trougao koja ima 3 double atributa za polja.
    //Napraviti metodu 'daLiJeTrougaoValidan', koji proverava da li 3 prosledjene stranice mogu da
    // budu stranice nekog trougla.
    //Trougao nije validan ako je zbir bilo kojih dveju stranica strogo manji od duzine trece
    // ili ako je neka stranica nepozitivne duzine.
    //Napraviti konstruktor koji prima 3 argumenta za atribute i proverava njihovu validnost.
    // Ako nisu validni, ispisati neku odgovarajucu poruku i postaviti sve stranice na -1.
    //Napraviti gettere i settere za svako polje, kao i metode 'obim' i 'povrsina'
    //(Pogledati heronov obrazac: https://en.wikipedia.org/wiki/Heron%27s_formula)
    //Napraviti toString() metod:
    //Duzina stranice A je: {stranicaA}
    //Duzina stranice B je: {stranicaB}
    //Duzina stranice C je: {stranicaC}
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    public Trougao(double stranicaA, double stranicaB, double stranicaC) {
        if (stranicaA > 0) {
            this.stranicaA = stranicaA;
        }
        if (stranicaB > 0) {
            this.stranicaB = stranicaB;
        }
        if (stranicaC > 0) {
            this.stranicaC = stranicaC;
        }
    }
    public Trougao() {
    }
    public boolean daLiJeTrougaoValidan(){
  //Trougao nije validan ako je zbir bilo kojih dveju stranica strogo manji od duzine trece
        //    // ili ako je neka stranica nepozitivne duzine.
        if ((stranicaA + stranicaB < stranicaC) || (stranicaC + stranicaB < stranicaA ) || (stranicaB > stranicaA + stranicaC))
        return false;
        else return true;
    }
    public double obim(){
        return stranicaA + stranicaC + stranicaC;
    }
    public double povrsina(){
        return stranicaA * stranicaB * stranicaC;
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
    }
}
