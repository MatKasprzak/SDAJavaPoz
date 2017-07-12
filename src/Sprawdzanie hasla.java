import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź napis");
        String napis = sc.next();

        if (napis.length() < 30) {
            System.out.println("Wybierz Opcje");
            System.out.println("1.Mała na duże. 2.Duże na małe 3. Duże na małe i małe na duże");
            int wybor = sc.nextInt();
            if (wybor  <= 3 && wybor > 0) {
                String wynik = "";
                switch (wybor) {

                    case 1: {
                        for (int i = 0; i < napis.length(); i++) {
                            char znak = napis.charAt(i);
                            //Sprawdza czy znak jest małą literą
                            if (znak >= 97 && znak <= 122) {
                                znak -= 32;
                            }
                            wynik += znak;

                        }

                    }
                    break;
                    case 2: {
                        for (int i = 0; i < napis.length(); i++) {
                            char znak = napis.charAt(i);
                            if (znak <= 97 && znak >= 40) {
                                znak += 32;
                            }
                            wynik += znak;


                        }
                    }
                    break;
                    case 3: {
                        for (int i = 0; i < napis.length(); i++) {
                            char znak = napis.charAt(i);
                            if (znak <= 90 && znak >= 65) {
                                znak += 32;
                                wynik += znak;
                            } else if (znak >= 97 && znak <= 122) {
                                znak -= 32;
                                wynik += znak;
                            }else {
                            }
                                //żadna operacja się nie wykonuje bo nie ma znaku ale spacje przeskakuje
                            }

                        }break;
                    default: {
                        System.out.println("Wybrano niepoprawną opcję");
                    }
                    }System.out.println(wynik);

                }


            }else {
                System.out.println("Napis zadlugi");
            }


        }

    }


