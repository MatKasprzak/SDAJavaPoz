package pl.sda.poznan.Facade.workexample;

public class internWorker extends AbstractWorker {
   public String preperDocuments(){
       System.out.println("Documents prepaired");
       String raport = "Ciężka praca";
       return raport;
   }

}
