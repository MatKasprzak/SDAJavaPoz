package pl.sda.poznan.dekorator;

public class SdgDollarDecorator implements Decorator {

    private Currency currency;

    public SdgDollarDecorator(Currency currency){
        this.currency = currency;
    }

    @Override
    public String getName(){
        return currency.getName() + ", it's a singapour Dolllarara";
    }
}
