package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        ArrayList<Character> cha = new ArrayList<>();
        ArrayList<Character> chag = new ArrayList<>();
        ArrayList<Character> chas = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            cha.add(string.charAt(i));
            if (isVowel(cha.get(i))) {
                chag.add(cha.get(i));
            }
            else if (cha.get(i).equals(' ')||cha.get(i).equals('0')||cha.get(i).equals('1')||cha.get(i).equals('2')||cha.get(i).equals('3')||cha.get(i).equals('4')||cha.get(i).equals('5')||cha.get(i).equals('6')||cha.get(i).equals('7')||cha.get(i).equals('8')||cha.get(i).equals('9')) {

            }
            else {
                chas.add(cha.get(i));
            }
        }
        for (int i = 0; i < chag.size(); i++) {
            System.out.print(chag.get(i)+" ");
        }
        System.out.println();
        for (int i = 0; i < chas.size(); i++) {
            System.out.print(chas.get(i)+" ");
        }
    }
    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}

/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
//String ho;
//ho = cha.get(i).toString().toUpperCase();
hug.add(cha.get(i).toString().toUpperCase().charAt(0));
        }
        else {
        hug.add(cha.get(i));
        }
        }
        }
        for (int i = 0; i < hug.size(); i++) {
        System.out.print(hug.get(i));
        }*/