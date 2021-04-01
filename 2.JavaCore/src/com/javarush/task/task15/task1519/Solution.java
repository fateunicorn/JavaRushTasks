package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        /*ArrayList<String> funks = new ArrayList<>();
        ArrayList<String> A1s = new ArrayList<>();*/
        for (int i = 0; i < 100000; i++) {
            String A1 = buffer.readLine();
            if (A1.equals("exit")){
                buffer.close();
                break;
            }
            /*
            A1s.add(A1);
            */
            if (A1.contains(".")){
                try {/*
                    funks.add("D");*/
                    Double ad = Double.parseDouble(A1);
                    print(ad);
                } catch (NumberFormatException e){
                    print(A1);
                }
            } else {
                try {
                    int a = Integer.parseInt(A1);
                    if (a>0&&a<128) {
                        print((short) a);
                    }
                    else print(a);
                } catch (NumberFormatException e){
                    print(A1);
                }
            }
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
