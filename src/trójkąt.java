package com.company;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-06.
 */
public class trójkąt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a;
        float b;
        float c;

        System.out.println("Podaj 1 odcinek");
        a = scanner.nextFloat();
        System.out.println("Podaj 2 odcinek");
        b = scanner.nextFloat();
        System.out.println("Podaj 3 odcinek");
        c = scanner.nextFloat();

        if ( a + b > c && a + c > b && b + c > a) {
            float p = ( a + b + c)/2;
            float wynikbezpierwiastka = (p - a) * ( p - b ) * ( p - c );
            double pole = Math.sqrt(wynikbezpierwiastka);
            double x = Math.round(pole);
            System.out.println("Pole trójkąta to: " + pole);
            System.out.println("Pole trójkąta po zaokrągleniu to: " + x);
        }else {
            System.out.println("Nie można zbudować trójkąta");
        }


        }
    }
}
