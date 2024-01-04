package chatgptquests.secondTask;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        int inputInt = 0;
        Scanner scanner = new Scanner(System.in);
        while(inputInt != 4) {
//тест обновления
        System.out.println("Перед вами зоопарк.");
        System.out.println("\n ------------------------");
        System.out.println("");
        System.out.println("1. Показать список животных в зоопарке.");
        System.out.println("2. Добавить животное в зоопарк.");
        System.out.println("3. Удалить животное из зоопарка.");
        System.out.println("4. Выход.");
        System.out.println("\n ------------------------");
        System.out.println("Введите номер команды.");

            try {
            inputInt = scanner.nextInt();
            scanner.nextLine();
            } catch (InputMismatchException a){
                System.out.println("Ввод некорректный. Вы должны ввести число от 1 до 4.");
                scanner.nextLine();
                continue;
            }

                switch (inputInt) {
                    case 1:
                        zoo.displayAnimals();
                        break;
                    case 2:
                        System.out.println("Добавим новое животное в зоопарк. \nВведите кличку животного:");
                        String animalName = scanner.nextLine();
                        System.out.println("Введите тип животного:");
                        String animalSpecies = scanner.nextLine();
                        zoo.addAnimal(animalName, animalSpecies);

                        break;
                    case 3:
                        System.out.println("Введите кличку животного:");
                        String animalNameDelete = scanner.nextLine();
                        zoo.deleteAnimal(animalNameDelete);
                        break;
                    default:
                        System.out.println("Вы должны ввести число от 1 до 4.");
                        break;

                }


        } //while
    }
}