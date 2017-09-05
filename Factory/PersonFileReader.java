package pl.sda.poznan.Factory;

import lombok.Data;

import java.util.Date;
import java.util.List;


public interface PersonFileReader {
List<Person> readAll();
}
