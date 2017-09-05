package pl.sda.poznan.Factory.enumExample;

import pl.sda.poznan.Factory.PersonFileReader;
import pl.sda.poznan.Factory.JsonPersonPersonFileReader;
import pl.sda.poznan.Factory.TxtPersonPersonFileReader;
import pl.sda.poznan.Factory.XmlPersonPersonFileReader;

public class EnumPersonREaderFactory {
    PersonFileReader create (PersonReaderFileType fileType){
        switch (fileType){
            case TXT:
                return new TxtPersonPersonFileReader();
            case XML:
                return new XmlPersonPersonFileReader();
            case JSON:
                return new JsonPersonPersonFileReader();

        }
        return null;
    }

}
