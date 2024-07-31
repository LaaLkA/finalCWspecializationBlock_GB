package core.Animals;

import java.time.LocalDate;

public class PackAnimal extends Animal {

    public PackAnimal(String name, LocalDate birthDate) {
        super(name, birthDate);
        super.type = "Вьючное животное";
    }
}
