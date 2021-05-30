package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.*;
import java.util.ArrayList;

public class Solution{
    public static TestString testString = new TestString();

    int unClInt;

    public static void main(String[] args) throws IOException {
        PrintStream dfltPrSt = System.out;
        ByteArrayOutputStream strings = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(strings);
        System.setOut(printStream);

        testString.printSomething();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(strings.toByteArray())));
        String forConsole = "";
        int chOrNotCh = 0;
        while (bufferedReader.ready()){
            String sLine = bufferedReader.readLine();
            chOrNotCh++;
            if (chOrNotCh%2!=0){
                forConsole = forConsole + sLine + "\n";
            } else {
                forConsole = forConsole + sLine + "\nJavaRush - курсы Java онлайн\n";
            }
        }
        bufferedReader.close();

        System.setOut(dfltPrSt);
        forConsole = forConsole.replaceAll("\\n$", "");
        System.out.println(forConsole);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }

    /*public class PrintStreamAdapter extends PrintStream{

    }*/
}
