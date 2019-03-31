package money;

public class Dollar {

    private double cash;

    public Dollar(double cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return String.format("$%.2f", cash) ;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double minus(Dollar o){

        return this.getCash()-o.getCash();
    }
}
