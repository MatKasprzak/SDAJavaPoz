package pl.sda.poznan.Factory.SimpleFactory;

import pl.sda.poznan.Factory.PersonFileReader;
import pl.sda.poznan.Factory.JsonPersonPersonFileReader;
import pl.sda.poznan.Factory.TxtPersonPersonFileReader;
import pl.sda.poznan.Factory.XmlPersonPersonFileReader;

public class SimplePersonReaderFactory {
    public PersonFileReader createReader(String path){
        if(path.endsWith(".txt")){
            return new TxtPersonPersonFileReader();
        }else if(path.endsWith(".json")){
            return new JsonPersonPersonFileReader();
        }else if (path.endsWith(".xml")){
            return new XmlPersonPersonFileReader();
        }else {
            return null;
        }
    }
}
