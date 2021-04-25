package com.javarush.task.task17.task1714;/*
package com.javarush.task.task17.task1714;

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Ttt("naoracka", (float) 345.55, 9);
        Thread t2 = new Ttt("nacka", (float) 34.55, 2);
        t1.start();
        t1.join();
        t2.start();
        t2.join();


    }

    public static class Ttt extends Thread{
        String a;
        float b;
        int c;

        Ttt(String a, float b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public void run() {
            System.out.println(new Beach(a, b, c).compareTo(new Beach(a, b, c)));

        }
    }
}
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Beach b1 = new Beach("bacuke", 13.54f, 34);
        System.out.println(b1.compareTo(new Beach("bakuce", 11.54f, 34)));
    }
}