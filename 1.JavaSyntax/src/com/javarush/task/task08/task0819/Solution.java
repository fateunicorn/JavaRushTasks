package com.javarush.task.task08.task0819;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Cat> sete = new HashSet<>();

        for (Cat ite : cats) {
            if (sete.size()<1) {
                sete.add(ite);
            }
        }
//        printCats(cats);
        for (Object ite : sete) {
            cats.remove(ite);
        }
//        System.out.println("SNAIL");
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        Cat cat = new Cat();
        cats.add(cat);
        Cat cat2 = new Cat();
        cats.add(cat2);
        Cat cat3 = new Cat();
        cats.add(cat3);
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Object ite : cats) {
            System.out.println(ite);
        }
    }

    public static class Cat{

    }
}
