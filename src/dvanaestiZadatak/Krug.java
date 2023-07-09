package dvanaestiZadatak;

public class Krug extends Elipsa {

    //Napisati 2 konstruktora:
    //- Jedan konstruktor koji prima double r i poziva odgovarajuci konstruktor natklase
    //- Jedan podrazumevani konstruktor

    public Krug() {
    }
    public Krug(double a, double b) {
        super(a, b);
    }
    public double obimKRuga(double r){

        return Math.PI*2*getA();
    }



}
