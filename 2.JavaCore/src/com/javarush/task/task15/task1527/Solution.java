package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
http://javarush.ru/alpha/index.html?obj=eee&obj=1234&name=Amigo&obj=sss&name=Amigo&obj=syu
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo&obj=eee&obj=4
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String a1 = buffer.readLine();
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<String> ooo = new ArrayList<>();
        ArrayList<Character>  ti = new ArrayList<>();
        ArrayList<Character> objs = new ArrayList<>();
        for (char c : a1.toCharArray()) {
            chars.add(c);
        }
        for (int i = 0; i < chars.size(); i++) {
            if (chars.get(i).equals('?')||chars.get(i).equals('&')){
                int o=1;
                for (int j = i+1; !chars.get(j).equals('&'); j++) {
                    if (!chars.get(j).equals('=')) {
                        ti.add(chars.get(j));
                        objs.add(chars.get(j));
                        if (o==3){
                            if (chars.get(j-2).equals('o')&&chars.get(j-1).equals('b')&&chars.get(j).equals('j')&&chars.get(j+1).equals('=')){
                                ArrayList<Character> list = new ArrayList<>();
                                try {
                                    for (int k = j+2; !chars.get(k).equals('&'); k++) {

                                        char pika = chars.get(k);
                                        list.add(pika);
                                        if (k==chars.size()){
                                            break;
                                        }
                                    }
                                }
                                catch (IndexOutOfBoundsException e){
                                }
                                StringBuilder builder = new StringBuilder(list.size());
                                for(Character ch: list)
                                {
                                    builder.append(ch);
                                }
                                ooo.add(builder.toString());
                                objs.clear();
                            }
                            o=1;
                        }
                        else {
                            o++;
                        }
                    }
                    else {

                        i=j;
                        break;
                    }

                }
                ti.add(' ');
            }
        }
        for (int i = 0; i < ti.size(); i++) {
            System.out.print(ti.get(i));
        }
        System.out.println();
        for (int i = 0; i < ooo.size(); i++) {
            try {
                double dou = Double.parseDouble(ooo.get(i));
                alert(dou);
            } catch (Exception e){
                alert(ooo.get(i));
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
