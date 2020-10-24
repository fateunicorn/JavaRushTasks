package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        return cats;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<Dog>();
        Dog do1 = new Dog();
        Dog do2 = new Dog();
        Dog do3 = new Dog();
        dogs.add(do1);
        dogs.add(do2);
        dogs.add(do3);
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        for (Object ite : dogs) {
            pets.add(ite);
        }
        for (Object ite : cats) {
            pets.add(ite);
        }
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        for (Object ite : cats) {
            pets.remove(ite);
        }
    }

    public static void printPets(Set<Object> pets) {
        for (Object ite : pets) {
            System.out.println(ite);
        }
    }

    public static class Cat{

    }
    public static class Dog{

    }
}
