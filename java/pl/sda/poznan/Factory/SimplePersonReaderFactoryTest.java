package pl.sda.poznan.Factory;

import org.junit.Test;
import pl.sda.poznan.Factory.SimpleFactory.SimplePersonReaderFactory;

import static org.junit.Assert.*;

public class SimplePersonReaderFactoryTest {
    @Test
    public void createReader() throws Exception {

        String dumyPath = "Plik.txt";
        SimplePersonReaderFactory factory = new SimplePersonReaderFactory();

        PersonFileReader personFileReader =factory.createReader(dumyPath);

        assertTrue(personFileReader instanceof TxtPersonPersonFileReader);
        assertEquals(TxtPersonPersonFileReader.class, personFileReader.getClass());

    }
    @Test
    public void jsonReaderTest(){
        String path = "C:\\pliki\\obosy.json";
        SimplePersonReaderFactory factory = new SimplePersonReaderFactory();
        PersonFileReader personFileReader = factory.createReader(path);

        assertTrue(personFileReader instanceof JsonPersonPersonFileReader);
        assertEquals(JsonPersonPersonFileReader.class, personFileReader.getClass());
    }
    @Test
    public void xmlReaderTest(){
        String path = "C:\\pliki\\osoby.xml";
        SimplePersonReaderFactory factory = new SimplePersonReaderFactory();
        PersonFileReader personFileReader = factory.createReader(path);

        assertTrue(personFileReader instanceof XmlPersonPersonFileReader);
        assertEquals(XmlPersonPersonFileReader.class, personFileReader.getClass());
    }

}