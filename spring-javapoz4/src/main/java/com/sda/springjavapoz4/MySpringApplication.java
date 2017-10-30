package com.sda.springjavapoz4;

import com.sda.springjavapoz4.service.RandomGeneratorNumberService;
import com.sda.springjavapoz4.service.SomeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.util.Random;

@SpringBootApplication
public class MySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringApplication.class, args);
    }

/*    formularz wysłanie zapisanie w bazie danych, wyswietleniena innej strone, spring data, na h2, get, post, wyswietlic, bootstrap

            wtyczka bootstrap bs3 do intelij*/
}
