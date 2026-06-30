import java.util.Objects;

public class KomplexeZahlen {
    private double re; // Realteil (a)
    private double im; // Imaginärteil (b)

    public KomplexeZahlen(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KomplexeZahlen)) return false;

        KomplexeZahlen k = (KomplexeZahlen) o;


        return Double.compare(re, k.re) == 0 &&
                Double.compare(im, k.im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    @Override
    public String toString() {
        return re + " + " + im + "i";
    }
}
