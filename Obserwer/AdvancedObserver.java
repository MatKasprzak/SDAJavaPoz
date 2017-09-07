package pl.sda.poznan.Obserwer;

import javax.swing.*;

public class AdvancedObserver extends Observer<Stock>{
public AdvancedObserver(Stock stock){
    this.observedObject = stock;
    stock.attachObserver(this);
}

    @Override
    protected void onChange(Stock sender, PriceChangedEventArgs e){
    if (1000 < (e.getNewPrice()-e.getOldPrice())/e.getOldPrice()*100){
        JOptionPane.showMessageDialog(null, "Jesteś nadziany!!!");
    }
        System.out.println("Cena sie zmieniła, Stara cena: " + e.getOldPrice() + " nowa cena: " + e.getNewPrice());
        System.out.println("Zmiana o "+ (e.getNewPrice()-e.getOldPrice())/e.getOldPrice()*100 + " %");
    }
}
