package pl.sda.poznan.Obserwer;

import com.sun.deploy.uitoolkit.impl.awt.OldPluginAWTUtil;
import sun.plugin.cache.OldCacheEntry;

public class PriceChangedEventArgs {
    private double OldPrice;
    private double NewPrice;

    public double getOldPrice() {
        return OldPrice;
    }

    public void setOldPrice(double oldPrice) {
        OldPrice = oldPrice;
    }

    public double getNewPrice() {
        return NewPrice;
    }

    public void setNewPrice(double newPrice) {
        NewPrice = newPrice;
    }

    public PriceChangedEventArgs(double oldPrice, double newPrice){
        this.OldPrice = oldPrice;
        this.NewPrice = newPrice;


    }
}
