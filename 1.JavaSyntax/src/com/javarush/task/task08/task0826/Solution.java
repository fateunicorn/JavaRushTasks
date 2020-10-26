package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
//        System.out.println(Collections.max(Arrays.asList(array)));
        /*Arrays.sort(array, new Comparator<Arrays>()) {
            public int compare(Arrays array[i], Arrays o2) {
                return o1.toString().compareTo(o2.toString());
            }*/
        for (int ie = 0; ie < 1; ie++) {
            int t;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < array[i]) {
                        t = array[i];
                        array[i] = array[j];
                        array[j] = t;
                    }
                }
            }
            /*for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }*/
            for (int i = 0; i < array.length/2; i++) {
                int tmp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = tmp;
            }
//            System.out.println(" ");
        }
        /*int t;
        for (int i = 0; i < 20; i++) {
            for (int j = i + 1; j < 19; j++) {
                if (array[j] < array[i]) {
                    t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }*/
    }
}



