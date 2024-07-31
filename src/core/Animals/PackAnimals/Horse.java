package core.Animals.PackAnimals;

import core.Animals.PackAnimal;

import java.time.LocalDate;

public class Horse extends PackAnimal {

    public Horse(String name, LocalDate birthDate) {
        super(name, birthDate);
        super.group = "Лошадь";
    }
}