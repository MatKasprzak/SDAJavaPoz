package pl.sda.poznan.Greeting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingTest {
    private Greeting greeting;
    @Before
    public void init() {
        greeting = new Greeting();
    }


    @Test
    public void greet() throws Exception {

        //Acta
        String result = greeting.greet("Jan");
        //Assert
        assertEquals("Hello, Jan", result);
    }
    @Test
    public void shouldReturnGeneralGreetingWhenNameIsNull (){

        String greet = greeting.greet(null);

        assertEquals("Hello, my friend", greet);
    }

    @Test
    public void shouldReturnCapitalizedGreetingWhenNameIsCapitalized (){

        String greet = greeting.greet("JAN");

        assertEquals("HELLO, JAN", greet);
    }
    @Test
    public void shouldReturnGreetingForTwoNames() {
        String greet = greeting.greet("Jan", "Ala");
        assertEquals("Hello, Jan and Ala", greet);
    }
    @Test
    public void shouldHandleMultipleNames(){
        String greet = greeting.greet("Piotr", "Anna", "Paulina", "Katarzyna", "Jadwiga");
        assertEquals("Hello Piotr, Anna, Paulina, Katarzyna and Jadwiga", greet);
    }
    @Test
    public void shouldHandleMultipleNamesAndMixedSizeLetter(){
        String greet = greeting.greet("Jan", "ALINA", "Ksawery", "TOMEK");
        assertEquals("Hello Jan, ALINA, Ksawery and TOMEK", greet);
    }
    @Test
    public void shouldHandleMultipleNamesAndMixedSizeLetterAndCapitalizedGreeting(){
        String greet = greeting.greet("Jan", "ALINA", "Ksawery", "TOMEK");
        assertEquals("Hello Jan, ALINA, Ksawery and TOMEK", greet);
    }
}