package oop.Interfaces;

/**
 * Created by RENT on 2017-07-25.
 */
public class ProgramKonto {
    public static void main(String[] args) {
        KontoOszczednosciowe mojeKonto = new KontoOszczednosciowe(2000);
        try {
            mojeKonto.Wyplata(500);
        } catch (Exception e) {
            System.out.println("Wystąpił błąd" + e.getMessage());
        }
        MaleKonto mojeMaleKonto = new MaleKonto(2000,500);
        try{
            mojeKonto.Wyplata(500);
        }catch (Exception e) {
            System.out.println("Wystąpił bład: " + e.getMessage());
        }

    }
}
