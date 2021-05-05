package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);*/
        String a1 = args[0];
//        String a1 = "C:\\Users\\Sergey\\Desktop\\1.txt";
        /*inputStreamReader.close();
        buffer.close();*/
        FileInputStream fis1 = new FileInputStream(a1);
//        System.out.println(fis1.available());
//        FileOutputStream fos2 = new FileOutputStream(a2);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> lis = new ArrayList<>();
        ArrayList<ArrayList<Integer>> arari = new ArrayList<>();
        list.add(fis1.read());
//        arari.add(list);
        arari.add(new ArrayList<>());
        arari.get(0).add(list.get(0));
        arari.get(arari.size()-1).add(1);
//        System.out.println(arari.get(0).get(0)+" 1");
        list.clear();
//        System.out.println(arari.get(0).get(0)+" 2");
        int lip;
        boolean pp;
        while (0 < fis1.available()) {
            lip = fis1.read();
            lis.add(lip);
            pp=true;
            for (int i = 0; i < arari.size(); i++) {
                if (lip == arari.get(i).get(0)) {
                    pp = false;
//                    break;
                }
            }
            if (pp) {
                list.add(lip);
//                arari.add(list);
                arari.add(new ArrayList<>());
                arari.get(arari.size()-1).add(list.get(0));
                arari.get(arari.size()-1).add(0);
//                System.out.println(arari.get(arari.size()-1));
//                System.out.println(arari.get((arari.size()-1)));
            }
            list.clear();
        }
        fis1.close();
//        System.out.println(arari.get(arari.size()-1)+"     rrr");
        for (int i = 0; i < lis.size(); i++) {
            for (int j = 0; j < arari.size(); j++) {
                if ((int)lis.get(i)==arari.get(j).get(0)){
                    arari.get(j).set(1, arari.get(j).get(1)+1);
                }
            }
        }
        /*
//        System.out.println(arari.get(arari.size()-1)+"     rer");

        for (int i = 0; i < arari.size(); i++) {
//            System.out.println(arari.get(arari.size()-1)+"     rbr");
//            System.out.println(arari.get(0).get(1)+"     rbr");
            System.out.println((char)arari.get(i).get(0).intValue()+ " "+arari.get(i).get(1));
        }
//        int[] array = {10, 2, 10, 3, 1, 2, 5};//
//        System.out.println(Arrays.toString(array));//
        */
        for (int left = 0; left < arari.size(); left++) {
            // Вытаскиваем значение элемента
            ArrayList<Integer> value = new ArrayList<>();
            value = arari.get(left);
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше array[i]?=arari.get(i).get(0)
                if (value.get(0) < arari.get(i).get(0)) {
//                    arari.get(i+1).set(0, arari.get(i).get(0));

                    arari.set(i+1, new ArrayList<>(arari.get(i)));
//                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            arari.set(i+1, value);
//            array[i + 1] = value;
        }
//        System.out.println("");
        for (int i = 0; i < arari.size(); i++) {
            System.out.println((char)arari.get(i).get(0).intValue()+ " "+arari.get(i).get(1));
        }
        /*int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }*/

//        System.out.println(Arrays.toString(array));
    }
}
/*
C:\Users\Sergey\Desktop\cd2.txt
*/