package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> ff = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            ff.add("Лама"+i);
        }
        return ff;
    }

    public static void main(String[] args) {

    }
}
