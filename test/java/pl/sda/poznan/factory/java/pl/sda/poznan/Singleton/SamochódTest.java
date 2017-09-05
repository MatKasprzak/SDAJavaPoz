package pl.sda.poznan.Singleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class SamochódTest {
    @Test
    public void getMarka() throws Exception {
        Samochód sm1 = new Samochód("Audi", "A5", Kolor.ZIELONY);
        Samochód sm2 = new Samochód("BMW", "M5", Kolor.NIEBIESKI);


        assertNotNull(sm1);
        assertNotNull(sm2);

        Kolor[] values;

        if (sm1.getKolor() == Kolor.ZIELONY){
            System.out.println("Kolor zielony");
        }
    }

}

