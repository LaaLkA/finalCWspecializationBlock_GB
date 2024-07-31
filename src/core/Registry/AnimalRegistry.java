package core.Registry;

import core.Animals.Animal;
import util.Counter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class AnimalRegistry {

    private List<Animal> animals;
    private Counter counter;

    public AnimalRegistry(String name) {
        animals = new ArrayList<>();
        this.counter = new Counter();
    }

    public AnimalRegistry() {
        animals = new ArrayList<>();
        this.counter = new Counter();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        counter.add();
    }

    public void showCommands(String name) {
        for (Animal animal : animals){
            if (Objects.equals(animal.getName(), name)) {
                System.out.print("Животное с именем " + name + " знает команды: ");
                for (int i = 0; i < animal.getCommands().size(); i++) {
                    System.out.print(animal.getCommands().get(i));
                    if (i < animal.getCommands().size() - 1) {
                        System.out.print(", ");
                    }

                }
            }
        }
        System.out.println();
    }


    public void showCounter() {
        counter.showCounter();
    }

    public void showRegistry(){
        System.out.println("Зарегистрированные животные:");
        for(Animal animal : animals){
            System.out.print(animal.getName() + " ");
        }
        System.out.println();
    }

    public void trainAnimal(String name, String command) {
        for(Animal animal : animals){
            if(Objects.equals(animal.getName(), name)){
                animal.addCommand(command);
            }
        }
    }
}

