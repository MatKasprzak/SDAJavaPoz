package pl.sda.poznan.dekorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorTest {

    @Test
    public void decoratorTest(){
        USADollarDecorator usaDollarDecorator = new USADollarDecorator(new Dollar());
        SdgDollarDecorator sdgDollarDecorator = new SdgDollarDecorator(new Dollar());

        System.out.println(usaDollarDecorator.getName());
        System.out.println(sdgDollarDecorator.getName());
    }

}