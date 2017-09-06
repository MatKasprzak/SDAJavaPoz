package pl.sda.poznan.Obserwer;

import org.junit.Test;

import static org.junit.Assert.*;

public class stockObserverTest {

    @Test
    public void test(){
        Stock orlen = new Stock("Orlen" , 10);

        stockObserver orlenObserver = new stockObserver(orlen);
        orlen.setPrice(20);
        orlen.setPrice(20);
        orlen.setPrice(20);
        orlen.setPrice(30);
        orlen.setPrice(1800);
    }

}