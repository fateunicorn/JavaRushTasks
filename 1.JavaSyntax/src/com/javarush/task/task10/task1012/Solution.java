package com.javarush.task.task10.task1012;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');
        List<Integer> betagamm = new ArrayList<>();
        for (int i = 0; i < 33; i++) {
            betagamm.add(0);
        }
        // Ввод строк
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < 33; k++) {
                    if (alphabet.get(k).equals(s.toLowerCase().charAt(j))) {//toLowerCase()
                        betagamm.set(k, (betagamm.get(k)+1));//betagamm.get(k)+1;
                    }
                }
            }
        }
        for (int i = 0; i < 33; i++) {
            System.out.println(alphabet.get((char)i)+" "+betagamm.get(i));
        }
    }
}
