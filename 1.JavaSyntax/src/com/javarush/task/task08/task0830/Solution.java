package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        if (isGreaterThan("с", "b")) {
            List ray = new ArrayList();
            for (int i = 0; i < array.length; i++) {
                ray.add(array[i]);
                array[i]=null;
            }
            Collections.sort(ray);
            for (int i = 0; i < ray.size(); i++) {
                array[i] = (String) ray.get(i);
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
