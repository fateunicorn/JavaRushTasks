/*package com.javarush.task.task16.task1628;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static volatile AtomicInteger readStringCount = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static long mill = 2000;


    public static void main(String[] args) throws IOException {

        CountThread countThread = new CountThread();
        countThread.start();

        //read count of strings
        int count = Integer.parseInt(reader.readLine());
        //init threads
        ReaderThread consolReader1 = new ReaderThread();
        ReaderThread consolReader2 = new ReaderThread();
        ReaderThread consolReader3 = new ReaderThread();

        consolReader1.start();
        consolReader2.start();
        consolReader3.start();

        while (count > readStringCount.get()) {
        }

        consolReader1.interrupt();
        consolReader2.interrupt();
        consolReader3.interrupt();
        System.out.println("#1:" + consolReader1);
        System.out.println("#2:" + consolReader2);
        System.out.println("#3:" + consolReader3);

        reader.close(); //если закомментировать
    }

    public static class ReaderThread extends Thread {
        private List<String> result = new ArrayList<String>();

        public void run()
        {

            try {
                try {
                    while (!this.isInterrupted()) {
                        Thread.sleep(mill);
                        if (!this.isInterrupted()) { //если закомментировать
                            String a1 = reader.readLine();
                            readStringCount.incrementAndGet();
                            result.add(a1);
                        } //если закомментировать
                    }

                } catch (IOException e) {
                    System.out.println(808.808);
                }
            } catch (InterruptedException e) {

            }
        }


        @Override
        public String toString() {
            return result.toString();
        }
    }

    public static class CountThread extends Thread implements Runnable{
        @Override
        public void run() {
            try {
                int rsc = readStringCount.get();
                int sl = 1;
            while (true){
                    Thread.sleep(100);
                    sl++;
                    if (rsc!=readStringCount.get()){
                        System.out.println(mill = sl * 100 + 1000);
                        sl=1;
                        rsc=readStringCount.get();
                    }
            }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}*/

package com.javarush.task.task16.task1628;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static volatile AtomicInteger readStringCount = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int counte;

    public static void main(String[] args) throws IOException {
        //read count of strings
        int count = Integer.parseInt(reader.readLine());
        counte=count;
        //init threads
        ReaderThread consolReader1 = new ReaderThread();
        ReaderThread consolReader2 = new ReaderThread();
        ReaderThread consolReader3 = new ReaderThread();

        consolReader1.start();
        consolReader2.start();
        consolReader3.start();

        while (count > readStringCount.get()) {
        }

        consolReader1.interrupt();
        consolReader2.interrupt();
        consolReader3.interrupt();
        System.out.println("#1:" + consolReader1);
        System.out.println("#2:" + consolReader2);
        System.out.println("#3:" + consolReader3);

        reader.close(); //если закомментировать
    }

    public static class ReaderThread extends Thread implements Runnable{
        private List<String> result = new ArrayList<String>();

        public void run()
        {
            try {
                try {

                    while (!this.isInterrupted()) {
                        Thread.sleep(1);
                        if (reader.ready()) { //если закомментировать
                            String a1 = reader.readLine();
                            readStringCount.incrementAndGet();
                            result.add(a1);
                        } //если закомментировать
                    }

                } catch (IOException e) {
                    System.out.println(808.808);
                }
            } catch (InterruptedException e) {

            }
        }


        @Override
        public String toString() {
            return result.toString();
        }
    }
}

/*
boolean isInterrupted = false;
        public void run() {

            if (!isInterrupted){
                String a1 = null;
                try {
                    a1 = reader.readLine();
                    System.out.println(readStringCount.addAndGet(1));
                    result.add(a1);
                } catch (IOException e) {
                    System.out.println(418);
                }


            }
        }



        String a1 = null;
                    try {
                        a1 = reader.readLine();
                        readStringCount.incrementAndGet();
                        result.add(a1);
                    } catch (IOException e) {
                        System.out.println(418);
                    }



                    package com.javarush.task.task16.task1628;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static volatile AtomicInteger readStringCount = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int counte;

    public static void main(String[] args) throws IOException {
        //read count of strings
        int count = Integer.parseInt(reader.readLine());
        counte=count;
        //init threads
        ReaderThread consolReader1 = new ReaderThread();
        ReaderThread consolReader2 = new ReaderThread();
        ReaderThread consolReader3 = new ReaderThread();

        consolReader1.start();
        consolReader2.start();
        consolReader3.start();

        while (count > readStringCount.get()) {
        }

        consolReader1.interrupt();
        consolReader2.interrupt();
        consolReader3.interrupt();
        System.out.println("#1:" + consolReader1);
        System.out.println("#2:" + consolReader2);
        System.out.println("#3:" + consolReader3);

        reader.close(); //если закомментировать
    }

    public static class ReaderThread extends Thread implements Runnable{
        private List<String> result = new ArrayList<String>();

        public void run()
        {
            try {
                try {

                    while (!this.isInterrupted()) {
                        Thread.sleep(1);
                        if (reader.ready()) { //если закомментировать
                            String a1 = reader.readLine();
                            readStringCount.incrementAndGet();
                            result.add(a1);
                        } //если закомментировать
                    }

                } catch (IOException e) {
                    System.out.println(808.808);
                }
            } catch (InterruptedException e) {

            }
        }


        @Override
        public String toString() {
            return result.toString();
        }
    }
}
*/