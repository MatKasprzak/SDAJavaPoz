package pl.sda.poznan;

import org.junit.Test;
import lombok.*;
import java.util.*;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;


public class StringTest {

    @Test
    public void test() {
        String napis = "ala";

        assertEquals("ala", napis);

        assertThat(napis).isEqualTo("ala");
    }

    @Test
    public void dataTest() {
        Date date = new Date();

        date.getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 10, 9);
        Date result = calendar.getTime();

        Calendar instance = Calendar.getInstance();
        instance.set(1980, 10, 10);
        Date birthday = instance.getTime();

        assertThat(birthday).isBefore(result);
    }

    @Test
    public void listTest() {
        List<Object> objects = new ArrayList<>();

        assertNotNull(objects);
        assertFalse(objects.isEmpty());

        assertThat(objects).isNotNull();
    }

    @Test
    public void mapTest(){
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("1020", "PKO BP");
        stringMap.put("1040", "Nordea");
        assertThat(stringMap).containsKeys("1020");


}



}
