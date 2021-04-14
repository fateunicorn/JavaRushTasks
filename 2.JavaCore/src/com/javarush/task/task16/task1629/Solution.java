package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1
2
3
4
5
6
*/
public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread{
        private String a;

        @Override
        public void run() {
            try {
                String a1 = reader.readLine();
                String a2 = reader.readLine();
                String a3 = reader.readLine();
                a = a1+" "+a2+" "+a3;
            } catch (IOException e) {

            }
        }

        public void printResult() {
            System.out.println(a);
        }
    }
}

