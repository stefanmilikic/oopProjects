package trinaestiZadatak;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Namirnica> listaNamirnica;
    private double cenaKorpe;

    public Korpa(ArrayList<Namirnica> listaNamirnica, double cenaKorpe) {
        this.listaNamirnica = new ArrayList<>();
        this.cenaKorpe = 0;
    }
    public Korpa() {
        this.listaNamirnica = new ArrayList<>();
        this.cenaKorpe = 0;
    }
    public ArrayList<Namirnica> getListaNamirnica() {
        return listaNamirnica;
    }

    public void setListaNamirnica(ArrayList<Namirnica> listaNamirnica) {
        this.listaNamirnica = listaNamirnica;
    }

    public double getCenaKorpe() {
        return cenaKorpe;
    }

    public void setCenaKorpe(double cenaKorpe) {
        this.cenaKorpe = cenaKorpe;
    }

    public void dodajUkorpu(Namirnica n) { //i dodaje na cenu korpe namirnicu n
        listaNamirnica.add(n);
        cenaKorpe += n.getCena();
    }

    //2. dodajUkorpu(Namirnica n, int k) - koja dodaje u korpu neku namirnicu n k-puta i
    // dodaje na cenuKorpe odgovarajucu cenu svih tih namirnica.
    public void dodajUKorpu(Namirnica n, int k) {
        while (0 < k) {
            listaNamirnica.add(n);
            cenaKorpe += n.getCena();
        }
    }

    //3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu, uklanja iz korpe jednu
    //                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla.
    //                                Ukoliko nema tog
    //                               artikla u korpi, uraditi nista.
    public void ukloniIzKorpe(Namirnica n) {
       /* for (int i = 0; i < listaNamirnica.size(); i++) {
            if (n.equals(listaNamirnica.get(i))) {
                listaNamirnica.remove(i);
                cenaKorpe -= n.getCena();
            } else System.out.println("Nema te namirnice");
        } */
        listaNamirnica.remove(n);
        cenaKorpe -= n.getCena();
    }

    //4. ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija takve namirnice.
//                                      Ukoliko u korpi ima manje od k broja
//                                       takve namirnice, obrisati sve takve namirnice.
    public void ukloniIzKorpe(Namirnica n, int k) {
        int brojUklonjenih = 0;
        for (int i = listaNamirnica.size() - 1; i >= 0; i--) {
            if (n.equals(listaNamirnica.get(i))) {
                listaNamirnica.remove(i);
                cenaKorpe -= n.getCena();
                brojUklonjenih++;
                if (brojUklonjenih == k) {
                    break;
            }

            } else System.out.println("Nema te namirnice");
        }
    }

    //5. ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.
    public void ukloniIzKorpeSveNamirniceN(Namirnica n) {
        int brojUklonjenih = 0;
        for (int i = listaNamirnica.size() - 1; i >= 0; i--) {
            if (n.equals(listaNamirnica.get(i))) {
                listaNamirnica.remove(i);
                cenaKorpe -= n.getCena();
                brojUklonjenih++;
            }
        }
        if (brojUklonjenih == 0) {
            System.out.println("Nema te namirnice");
        }
    }
   //6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.
    public void isprazniKorpu(){
        listaNamirnica.clear();

    }
//7. cenaKrope - koja vraca ukupnu cenu korpe
    public double cenaKorpe(){
        double ukupno = 0;
        for (Namirnica n: listaNamirnica
             ) {
            ukupno += n.getCena();
        }
        return cenaKorpe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int brojDuplikata = 0;

        for (Namirnica n: listaNamirnica
             ) {
            brojDuplikata++;
            sb.append(n.getIme()).append(" ").append(brojDuplikata).append(brojDuplikata*=n.getCena());
            sb.append("Cena korpe je ").append(cenaKorpe);
        }
        return sb.toString();
    }
    //Overridovati toString() metod kao:
    //"<imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
    // ...
    // <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
    // Cena korpe je: <cenaKopre>"







}




