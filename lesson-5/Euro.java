public class Euro implements Currency {
    private float balance;
    private FakeCantor cantor = new FakeCantor();
    public Euro(float amount){
        this.balance = amount;
    }

    @Override
    public Euro addedCurrency(float value, String currency) {
        float new_balance = this.balance + (this.cantor.euroToRate(currency) * value);
        Euro new_euro = new Euro(new_balance);
        return new_euro;
    }

    @Override
    public Euro subtractedCurrency(float value, String currency) {
        float new_balance = this.balance - (this.cantor.euroToRate(currency) * value);
        Euro new_euro = new Euro(new_balance);
        return new_euro;
    }

    @Override
    public String abbreviation() {
        return "EUR";
    }

    @Override
    public String symbol() {
        return "$";
    }

    @Override
    public String balance() {
        return Float.toString(this.balance);
    }

    @Override
    public float toDollarExchangeRate() {
        return this.cantor.euroToRate("USD");
    }
}