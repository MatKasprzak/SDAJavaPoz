package pl.sda.poznan.Singleton;

public enum Kolor {
    ZIELONY("Z"), CZERWONY("C"), NIEBIESKI("N");

    private String code;

    Kolor(String code){
        this.code = code;
    }
}
