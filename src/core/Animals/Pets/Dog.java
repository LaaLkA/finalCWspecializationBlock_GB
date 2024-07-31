package core.Animals.Pets;

import core.Animals.Pet;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dog extends Pet {

    public Dog(String name, LocalDate birthDate) {
        super(name,birthDate);
        super.group = "Собака";
    }
}
