package chatgptquests.secondTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public ArrayList<Animal> zooList = new ArrayList<>();

    public void addAnimal(String name, String species) {
        Animal animal = new Animal(name, species);
        zooList.add(animal);
        System.out.println(animal.getSpecies() + " по кличке " + animal.getName() + " теперь в зоопарке!");
    }

    public void deleteAnimal(String name) {
        Animal animalToRemove = null;
        int coinstance = 0;
        for (Animal animal : zooList) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animalToRemove = animal;
                coinstance++;

            }
        }
        if (coinstance <= 1) {
        if (animalToRemove != null) {
            zooList.remove(animalToRemove);
            System.out.println("Животное удалено из зоопарка.");
        } else {
            System.out.println("Такого животного нет в зоопарке.");
        }} else {
            System.out.println("В зоопарке несколько животных с такой кличкой:");
            for (Animal b : zooList) {
                if (b.getName().equalsIgnoreCase(name)) {
                    System.out.println((zooList.indexOf(b) + 1) + " " + b.getName() + " " + b.getSpecies());
                }
            }
            System.out.println("Какое удалить? Введите его номер.");
            Scanner delete = new Scanner(System.in);
            int d = delete.nextInt();
            zooList.remove(zooList.get(d - 1));
        }
    }

        public void displayAnimals() {
          if (zooList.isEmpty()) {
              System.out.println("В зоопарке нет животных.");
          } else {
              System.out.println("Список всех животных в зоопарке.");
              for (Animal a : zooList) {
                  String tempName = a.getName();
                  String tempSpecies = a.getSpecies();
                  System.out.println((zooList.indexOf(a) + 1) + " " + tempSpecies + " "+ tempName);
              }
          }
        }
    }


