package dvanaestiZadatak;

import java.util.Objects;

public class Elipsa {
    private double a; // (prva poluosa)
    private double b; //(druga poluosa)

    public Elipsa() {
    }

    public Elipsa(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elipsa elipsa = (Elipsa) o;
        return Double.compare(elipsa.a, a) == 0 && Double.compare(elipsa.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
    public double povrsina() {
        return Math.PI * a * b;
    }
    public double ekscentritet() {
        return Math.sqrt(1 - (b * b) / (a * a));
    }
    public double vecaPoluosa() {
        return a;
    }
    public double manjaPoluosa() {
        return b;
    }
}
