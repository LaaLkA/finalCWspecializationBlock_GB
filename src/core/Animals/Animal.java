package core.Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public class Animal {
    private String name;
    protected ArrayList<String> commands;
    private LocalDate birthDate;
    protected String type;
    protected String group;

    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.commands = new ArrayList<>();
        this.birthDate = birthDate;
        this.type = null;
        this.group = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGroup() {
        return group;
    }

    public void showGroup() {
        System.out.println("Тип животного - " + group);
    }

    public String getType(){
        return type;
    }
    public void showType(){
        System.out.println("Тип животного - " + type);
    }
}

