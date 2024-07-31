package core.Animals;

import java.time.LocalDate;

public class Pet extends Animal {

    public Pet(String name, LocalDate birthDate) {
        super(name, birthDate);
        super.type = "Домашнее животное";
    }
}
