package core.GUI;

import core.Animals.PackAnimals.Donkey;
import core.Animals.PackAnimals.Horse;
import core.Animals.Pets.Cat;
import core.Animals.Pets.Dog;
import core.Animals.Pets.Hamster;
import core.Registry.AnimalRegistry;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GUI {
    private static boolean flag = true;

    public static void run() {
        AnimalRegistry registry = new AnimalRegistry();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        while (flag) {
            System.out.print("""
                1. Добавить животное \s
                2. Показать команды животного \s
                3. Обучить животное новой команде \s
                4. Показать счётчик \s
                5. Выйти
                """);

            String action = scanner("Выберите пункт: \n");
            switch (action) {
                case ("1"):
                    int typeAnimal = Integer.parseInt(scanner("""
                            Какое тип животного вы хотите создать?
                            1. Домашнее животное;
                            2. Вьючное животное.
                            """));
                    if (typeAnimal == 1) {
                        int typePet = Integer.parseInt(scanner("""
                                Какое животное вы хотите создать?
                                1. Кошка;
                                2. Собака;
                                3. Хомяк.
                                """));
                        if (typePet == 1) {
                            registry.addAnimal(new Cat(scanner("Введите имя питомца "),
                                    LocalDate.parse(scanner("Введите дату рождения питомца в формате - yyyy.MM.dd\n"), formatter)
                            ));
                            break;
                        } else if (typePet == 2) {
                            registry.addAnimal(new Dog(scanner("Введите имя питомца "),
                                    LocalDate.parse(scanner("Введите дату рождения питомца в формате - yyyy.MM.dd\n"), formatter)
                            ));
                            break;
                        } else if (typePet == 3) {
                            registry.addAnimal(new Hamster(scanner("Введите имя питомца "),
                                    LocalDate.parse(scanner("Введите дату рождения питомца в формате - yyyy.MM.dd\n"), formatter)
                            ));
                            break;
                        } else {
                            System.out.println("Неверно выбран пункт!");
                            break;
                        }
                    } else if (typeAnimal == 2) {
                        int typePet = Integer.parseInt(scanner("""
                                Какое животное вы хотите создать?
                                1. Лощадь;
                                2. Осёл.
                                """));
                        if (typePet == 1) {
                            registry.addAnimal(new Horse(scanner("Введите имя питомца "),
                                    LocalDate.parse(scanner("Введите дату рождения питомца в формате - yyyy.MM.dd\n"), formatter)
                            ));
                            break;
                        } else if (typePet == 2) {
                            registry.addAnimal(new Donkey(scanner("Введите имя питомца"),
                                    LocalDate.parse(scanner("Введите дату рождения питомца в формате - yyyy.MM.dd\n"), formatter)
                            ));
                            break;
                        } else {
                            System.out.println("Неверно выбран пункт! ");
                            break;
                        }
                    } else {
                        System.out.println("Неверно выбран пункт! ");
                        break;
                    }
                case ("2"):
                    registry.showRegistry();
                    registry.showCommands(scanner("Введите имя животного, команды которого хотите посмотреть: \n"));
                    break;
                case ("3"):
                    registry.showRegistry();
                    registry.trainAnimal(scanner("Введите имя животного, которое будет обучаться новой команде: \n")
                            , scanner("Введите команду, которой будет обучаться животное: \n"));
                    break;
                case ("4"):
                    registry.showCounter();
                    break;
                case ("5"):
                    System.out.println("Завершение работы...");
                    flag = false;
                    break;
                default:
                    System.out.println("Вы ввели неверно номер пункта! Пожалуйста, попробуйте снова.");
            }
        }
    }

    private static String scanner(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
}
