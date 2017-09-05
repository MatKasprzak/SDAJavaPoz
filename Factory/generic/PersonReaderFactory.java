package pl.sda.poznan.Factory.generic;

import pl.sda.poznan.Factory.JsonPersonPersonFileReader;
import pl.sda.poznan.Factory.PersonFileReader;
import pl.sda.poznan.Factory.TxtPersonPersonFileReader;
import pl.sda.poznan.Factory.XmlPersonPersonFileReader;
import pl.sda.poznan.Factory.enumExample.PersonReaderFileType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PersonReaderFactory implements Factory <PersonReaderFileType, PersonFileReader> {

    private Map<PersonReaderFileType, Supplier<PersonFileReader>> map;

    public PersonReaderFactory(){
        map = new HashMap<>();

        map.put(PersonReaderFileType.TXT, () -> new TxtPersonPersonFileReader());
        map.put(PersonReaderFileType.JSON, () -> new JsonPersonPersonFileReader());
        map.put(PersonReaderFileType.XML, () -> new XmlPersonPersonFileReader());
    }

    @Override
    public PersonFileReader create(PersonReaderFileType key) {
        if(map.containsKey(key)){
            //lub return map.containsKey(key) ? map.get(key).get() : null
            Supplier<PersonFileReader> supplier = map.get(key);
            PersonFileReader fileReader = supplier.get();
            return fileReader;
        }
        return null;
    }
}
