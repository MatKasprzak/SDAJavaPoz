package pl.sda.poznan.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {

    @Test
    public void test() {
        Computer mojKomputer =
                new Computer.ComputerBuilder()
                        .addProcessor("Intel i5")
                        .addMatherBoard("Asus H270")
                        .addRam("8 GB")
                        .addHdd("SSD 350GB")
                        .build();
    }
    @Test
    public void builderTest(){
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
        builder.addMatherBoard("Asusu b151");
        builder.addRam("8GB");
        Computer build = builder.build();
    }

}