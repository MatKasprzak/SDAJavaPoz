package pl.sda.poznan.Obserwer;

public class stockObserver extends Observer<Stock> {
    public stockObserver (Stock stock){
        this.observedObject = stock;
        stock.attachObserver(this);
    }

    @Override
    protected void onChange(Stock sender, PriceChangedEventArgs e){
        System.out.println("Cena sie zmieniła, Stara cena: " + e.getOldPrice() + " nowa cena: " + e.getNewPrice());
    }
}
