package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream outToConsole = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        testString.printSomething();

        String s = byteArrayOutputStream.toString();
        String[] strings = s.split(" ");
        int i = 0;
        if (strings[1].equals("+")){
            i = Integer.parseInt(strings[0])+Integer.parseInt(strings[2]);
        }
        if (strings[1].equals("-")){
            i = Integer.parseInt(strings[0])-Integer.parseInt(strings[2]);
        }
        if (strings[1].equals("*")){
            i = Integer.parseInt(strings[0])*Integer.parseInt(strings[2]);
        }

        s = (strings[0]+" "+strings[1]+" "+strings[2]+" "+strings[3]+" "+i);

        System.setOut(outToConsole);
        System.out.println(s);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

