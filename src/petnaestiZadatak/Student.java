package petnaestiZadatak;

import java.util.ArrayList;

public class Student extends Ucenik {

    private ArrayList<String> predmeti;
    private ArrayList<Profesor> profesori;

    public Student(String ime, String prezime, int godine, ArrayList<Double> listaOcena, ArrayList<String> predmeti, ArrayList<Profesor> profesori) {
        super(ime, prezime, godine, listaOcena);
        this.predmeti = predmeti;
        this.profesori = profesori;
    }
    public Student() {

        this.predmeti = new ArrayList<>();
        this.profesori = new ArrayList<>();
    }
    public Student(ArrayList<Double> listaOcena, ArrayList<String> predmeti, ArrayList<Profesor> profesori) {
        super(listaOcena);
        this.predmeti = predmeti;
        this.profesori = profesori;
    }

    public Student(ArrayList<String> predmeti, ArrayList<Profesor> profesori) {
        this.predmeti = predmeti;
        this.profesori = profesori;
    }

    public ArrayList<String> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(ArrayList<String> predmeti) {
        this.predmeti = predmeti;
    }

    public ArrayList<Profesor> getProfesori() {
        return profesori;
    }

    public void setProfesori(ArrayList<Profesor> profesori) {
        this.profesori = profesori;
    }
    //Napisati metode:
    //1. addPredmet(String s)
    public void addPredmet(String a){
        predmeti.add(a);
    }
    //2. addPredmet(String s, int i)
    public void addPredmet(String a, int i){
        predmeti.add(i, a);
    }
    //3. addProfesor(Profesor p)
    public void addProfesor(Profesor p){
        profesori.add(p);
    }
    //4. addProfesor(Profesor p, int i)
    public void addProfesor(Profesor p, int i){
        profesori.add(i, p);
    }
    //5. removePredmet(String s)
    public void removePredmet(String s){
        predmeti.remove(s);
    }
    //6. removeProfesor(Profesor p) - Paziti da ovakav profesor postoji u listi! Ako ne postoji, ne raditi nista
    public void removeProfesor(Profesor p){
        for (int i = 0; i < profesori.size(); i++) {
            if (p.equals(profesori.get(i))){
                profesori.remove(p);
            }
        }
    }
}
