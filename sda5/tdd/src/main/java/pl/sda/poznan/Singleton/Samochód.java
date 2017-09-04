package pl.sda.poznan.Singleton;

public class Samochód {
    private String marka;
    private String model;
    private Kolor kolor;

    public Samochód(){

    }
    public Samochód(String marka, String model, Kolor kolor){
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
    }
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Kolor getKolor() {
        return kolor;
    }

    public void setKolor(Kolor kolor) {
        this.kolor = kolor;
    }
}
