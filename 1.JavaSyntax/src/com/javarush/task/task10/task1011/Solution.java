package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        for (int i = 0; i < 40; i++) {
            int start = i;
            int end = s.length();
            char[] dst=new char[end - start];
            s.getChars(start, end, dst, 0);
            System.out.println(dst); // world
        }
        //напишите тут ваш код
    }

}

