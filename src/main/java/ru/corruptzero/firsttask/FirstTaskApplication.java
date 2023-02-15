package ru.corruptzero.firsttask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FirstTaskApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstTaskApplication.class, args);

        List<IPet> petList = new ArrayList<>(){{
            add(new Cat());
            add(new Dog());
        }};
        for(IPet pet : petList){
            System.out.println(pet.talkToOwner());
        }

    }
}
