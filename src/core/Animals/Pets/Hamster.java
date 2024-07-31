package core.Animals.Pets;

import core.Animals.Pet;

import java.time.LocalDate;

public class Hamster extends Pet {

    public Hamster(String name, LocalDate birthDate) {
        super(name,birthDate);
        super.group = "Хомяк";
    }
}