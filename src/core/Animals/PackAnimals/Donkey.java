package core.Animals.PackAnimals;

import core.Animals.PackAnimal;

import java.time.LocalDate;

public class Donkey extends PackAnimal {

    public Donkey(String name, LocalDate birthDate) {
        super(name, birthDate);
        super.group = "Осёл";
    }
}