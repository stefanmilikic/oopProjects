package jedanaestiZadatak;

import java.util.Objects;

public class Pravougaonik {
    private double stranicaA;
    private double stranicaB;

    public Pravougaonik() {
    }

    public Pravougaonik(double stranicaA, double stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    public double obim(){
        return 2*stranicaA + 2*stranicaB;
    }
    public double povrsina(){
        return stranicaA*stranicaB;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pravougaonik that = (Pravougaonik) o;
        return Double.compare(that.stranicaA, stranicaA) == 0 && Double.compare(that.stranicaB, stranicaB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stranicaA, stranicaB);
    }

    @Override
    public String toString() {
        return "Pravougaonik{" +
                "stranicaA=" + stranicaA +
                ", stranicaB=" + stranicaB +
                '}';
    }
}
