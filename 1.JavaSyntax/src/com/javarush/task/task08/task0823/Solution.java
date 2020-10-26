package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        ArrayList<Character> cha = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            cha.add(string.charAt(i));
        }
        ArrayList<Character> hug = new ArrayList<>();
        if (!cha.get(0).equals(' ')||!cha.get(0).equals(',')||!cha.get(0).equals('.')||!cha.get(0).equals('?')||!cha.get(0).equals('!')){
            hug.add(cha.get(0).toString().toUpperCase().charAt(0));
        }
        for (int i = 1; i < cha.size(); i++) {
            if (!cha.get(i).equals(' ')||!cha.get(i).equals(',')||!cha.get(i).equals('.')||!cha.get(i).equals('?')||!cha.get(i).equals('!')){
                if (cha.get(i-1).equals(' ')){
                    /*String ho;
                    ho = cha.get(i).toString().toUpperCase();*/
                    hug.add(cha.get(i).toString().toUpperCase().charAt(0));
                }
                else {
                    hug.add(cha.get(i));
                }
            }
        }
        for (int i = 0; i < hug.size(); i++) {
            System.out.print(hug.get(i));
        }
    }
}


