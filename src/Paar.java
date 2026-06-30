public class Paar<T, U> implements Markierbar<String> {

    protected T firstValue;
    protected U secondValue;
    protected String marke;


    public Paar(T erstes, U zweites) {
        this.firstValue = erstes;
        this.secondValue = zweites;
    }

    public T getFirstValue() {

        return firstValue;
    }

    public U getSecondValue() {
        return secondValue;
    }

    public void setFirstValue(T firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(U secondValue) {
        this.secondValue = secondValue;
    }

    @Override
    public void setMarke(String m) {
        marke = m;
    }

    @Override
    public String getMarke() {
        return marke;
    }
}