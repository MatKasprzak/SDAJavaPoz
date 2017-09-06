package pl.sda.poznan.dekorator;

public class USADollarDecorator extends Dollar {
    private Currency currency;

    public USADollarDecorator(Currency currency) {
        this.currency = currency;
    }
//Własciwy proces dekorowania.
    @Override
    public String getName(){
    return currency.getName() + ", it's USA DOLLLLLARRRR";
}
}
