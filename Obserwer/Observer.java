package pl.sda.poznan.Obserwer;

public abstract class Observer<T> {
    protected T observedObject;

    public abstract void onChange(Object sender, PriceChangedEventArgs e);

}
