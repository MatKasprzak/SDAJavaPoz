public class Pracownik {

    //Deklaracja pola w klasie
    public String imie;

    public String nazwisko;

    public int wiek;

    private float pensja;


    public Pracownik(){
        pensja = 2000;
    }
    public void Podwyzka(int procent) {
        float kwota = pensja + procent/100;
        pensja +=kwota;
    }




    //metoda klasy Pracownik
    public void Opis(){
        System.out.println("Pracownik");
    }

    public void OpiszPracownika() {
        System.out.println("Imie: " + this.imie + " Nazwisko:" + this.nazwisko);
    }
    public void WypiszPodwyzke() {
        System.out.println("Penjsa to: " + pensja);
    }
}
