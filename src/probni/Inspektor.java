package probni;

public class Inspektor {
    private UgostiteljskiObjekat objekat;

    public Inspektor(UgostiteljskiObjekat objekat) {
        this.objekat = objekat;
    }

    public UgostiteljskiObjekat getObjekat() {
        return objekat;
    }

    public void setObjekat(UgostiteljskiObjekat objekat) {
        this.objekat = objekat;
    }
    public void dodajOpis(String opis){
        for (int i = 0; i < objekat.getRecenzije().size(); i++) {
            objekat.getRecenzije().add(opis);
        }
    }
    public void dodajOcenu(double ocena){
        objekat.dodajOcenu(ocena);
    }
    public void dodeliZvezdu(){
        objekat.azurirajZvezdu();
    }
    public String procitajRecenzije(){
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < objekat.getRecenzije().size(); i++) {
            sb.append(objekat.getRecenzije().get(i));
            if (i != objekat.getRecenzije().size() -1){
                sb.append("\n");
            }
        } return sb.toString();
    }
    public String procitajRecenzije(int i){
        return objekat.getRecenzije().get(i).toString();
    }
    public void zatvoriObjekat(){
        objekat.setBrMichelinZvezda(0);
        objekat.setProsecnaOcena(1);
    }
    public static int uporediUgostiteljskeObjekte(UgostiteljskiObjekat o1, UgostiteljskiObjekat o2){
        if (o1.brMichelinZvezda > o2.brMichelinZvezda || o1.getProsecnaOcena() > o2.getProsecnaOcena()){
            return -1;
        } else if (o1.brMichelinZvezda == o2.brMichelinZvezda && o1.getProsecnaOcena() == o2.getProsecnaOcena()){
            return 0;
        } else return 2;
    }
}
