package oop.Interfaces;

/**
 * Created by RENT on 2017-07-25.
 */
public class MaleKonto extends KontoOszczednosciowe implements Konto {
    private double limit;



     private double getLimit(){
         return limit;
     }

     public MaleKonto(double bilans, double limit){
         super(bilans);
         this.limit = limit;

     }

    @Override
    public double Wyplata(double kwota) throws Exception {
        if (kwota > limit) {
            throw new Exception("Za mało środków na koncie");
        }
        return super.Wyplata(kwota);

    }
}
