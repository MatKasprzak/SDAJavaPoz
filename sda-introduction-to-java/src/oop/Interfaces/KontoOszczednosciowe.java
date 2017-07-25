package oop.Interfaces;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-25.
 */
public class KontoOszczednosciowe implements Konto {

    private double bilans;

    public KontoOszczednosciowe(double bilans) {
        this.bilans = bilans;
    }

    @Override
    public double getBilans() {
        return bilans;
    }

    protected void setBilans(double bilans) {
        this.bilans = bilans;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void Wplata(double kwota) {
        if (kwota < 0) {
            throw new IllegalArgumentException("Wpłacane kwota nie może byc ujemna");
        }
        bilans += kwota;
    }

    @Override
    public double Wyplata(double kwota) throws Exception {
        //System.out.println("Podaj kwote do wyplaty");
        if (kwota > bilans) {
            throw new Exception("Zbyt mało środkow na koncie");
        }
        bilans -= kwota;
        return kwota;

    }

}
