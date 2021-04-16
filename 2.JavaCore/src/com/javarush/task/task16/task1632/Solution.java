package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
    }

    public static class t1 extends Thread{
        @Override
        public void run() {
            while (true){

            }
        }
    }

    public static class t2 extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class t3 extends Thread{
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {}
        }
    }

    public static class t4 extends Thread implements Message{

        @Override
        public void run() {
            while (true){

            }
        }

        @Override
        public void showWarning() {
            this.stop();
        }
    }

    public static class t5 extends Thread{

        @Override
        public void run() {
            int s=0;
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            try {
                while (true) {
                    String a1 = buffer.readLine();
                    if (!a1.equals("N")) {
                        int a = Integer.parseInt(a1);
                        s += a;
                    } else {
                        System.out.println(s);
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static {
        t1 ot1 = new t1();
        t2 ot2 = new t2();
        t3 ot3 = new t3();
        t4 ot4 = new t4();
        t5 ot5 = new t5();
        threads.add(ot1);
        threads.add(ot2);
        threads.add(ot3);
        threads.add(ot4);
        threads.add(ot5);
    }
}