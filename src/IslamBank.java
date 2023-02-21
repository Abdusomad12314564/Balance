public class IslamBank {
    private double summa=10000;

    public IslamBank(double summa) {
        this.summa = summa;
    }

    public double getSumma() {
        return summa;
    }

    public void setSumma(double summa) {
        this.summa = summa;
    }

    @Override
    public String toString() {
        return " "+summa ;
    }
}
