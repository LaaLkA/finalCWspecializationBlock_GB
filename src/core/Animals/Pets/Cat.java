package core.Animals.Pets;

import core.Animals.Pet;

import java.time.LocalDate;

public class Cat extends Pet {

    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
        super.group = "Кошка";
    }
}