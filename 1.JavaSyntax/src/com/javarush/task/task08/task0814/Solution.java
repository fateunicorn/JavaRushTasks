package com.javarush.task.task08.task0814;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


//Больше 10? Вы нам не подходите


public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i+1);
        }
        /*System.out.println(set.toString());*/
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set sete = new HashSet();

        for (Integer item : set) {
            if (item>10){
                sete.add(item);
            }
        }
        //System.out.println(sete.toString());
        for (Object ite : sete) {
        set.remove(ite);
        }
        return set;
    }

    public static void main(String[] args) {
        /*System.out.println(removeAllNumbersGreaterThan10(createSet()).toString());*/
    }
}
/*for (int ie = 0; ie < 20; ie++) {
            for (int i = 0; i < 10; i++) {
                if (set.contains(i)) {
                    sete.add(set(i));
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            set.remove(i);
        }
        for (int i = 0; i < 20; i++) {
            set.add(sete.contains(i));
        }
        return set;
        for (Integer oiy : set){
            if (oiy>10){
                ???.remove();
            }
        }*/
        /*for (Integer item : set) {
            if (item>10){
                sete.add((Integer)item.hashCode());
            }
        }
        for (Integer ite : sete) {

        }*/