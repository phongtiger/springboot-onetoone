package com.example.onetoone;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class OnetooneApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OnetooneApplication.class, args);
    }

    private final PersonRepository personRepository;
    private final AddressRepository addressRepository;
    @Override
    public void run(String... args) throws Exception {
        Person person = Person.builder().name("loda").build();

        personRepository.save(person);

        Adress adress = Adress.builder().city("Hanoi").person(person).build();

        addressRepository.save(adress);
    }
}
