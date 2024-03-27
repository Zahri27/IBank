public class Bank {
    private String name;
    private double exchangeRate;

    public Bank(String name, double exchangeRate) {
        this.name = name;
        this.exchangeRate = exchangeRate;

    }

    public String getName() {
        return name;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
