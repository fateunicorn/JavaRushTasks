package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName=buffer.readLine();
            secondFileName=buffer.readLine();
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent() throws InterruptedException;

        void join() throws InterruptedException;

        void start();
    }
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fuFiNa = "";
        String csp = "";


        @Override
        public void setFileName(String fullFileName) {
            fuFiNa = fullFileName;
        }

        @Override
        public String getFileContent() throws InterruptedException {
            super.join();
            return csp;
        }

        @Override
        public void run() {

            //C:\Users\Sergey\Desktop\cd.txt
            //fileName = "C:\\Users\\Sergey\\Desktop\\cd.txt";

            InputStream fr = null;
            try {
                fr = new FileInputStream(fuFiNa);
            } catch (FileNotFoundException e) {
                System.out.println("problem2");
            }
            assert fr != null;
            BufferedReader buffer = new BufferedReader(new InputStreamReader(fr));

            while (true) {
                try {
                    if (buffer.ready()) {
                        if (!csp.equals("")) {
                            csp += " " + buffer.readLine();
                        } else {
                            csp += "" + buffer.readLine();
                        }
                    }
                    else {
                        buffer.close();
                        break;
                    }
                } catch (IOException e) {
                }
            }
        }
    }
}

/*
{
C:\\Users\\Sergey\\Desktop\\cd.txt
C:\\Users\\Sergey\\Desktop\\1.txt


        }*/
