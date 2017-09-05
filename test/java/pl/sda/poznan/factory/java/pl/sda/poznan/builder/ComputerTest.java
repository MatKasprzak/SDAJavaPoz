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

}