package pl.sda.poznan.Obserwer;

public abstract class Observer<T> {
    protected T observedObject;

    protected abstract void onChange(T sender, PriceChangedEventArgs e);

}
