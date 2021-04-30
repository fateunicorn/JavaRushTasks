package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        String a1;
        FileInputStream fileInputStream;
        while (true) {
            a1 = buffer.readLine();
            fileInputStream = new FileInputStream(a1);
            if (fileInputStream.available()<1000){
                inputStreamReader.close();
                buffer.close();
                fileInputStream.close();   /*
                (new DownloadException()).printStackTrace();
                System.out.println((new DownloadException()).getStackTrace());
                System.err.println((new DownloadException()).getStackTrace());*/
                throw new DownloadException();
//                break;
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}

/*
C:\Users\Sergey\Desktop\cd1.txt
C:\Users\Sergey\Desktop\cd.txt

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        int u=0;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        String a1;
        FileInputStream fileInputStream = null;
        while (u==0) {
            a1 = buffer.readLine();
            fileInputStream = new FileInputStream(a1);
            for (int i = 0; i < 1000; i++) {
                if (fileInputStream.read() == -1) {
                    inputStreamReader.close();
                    buffer.close();
                    fileInputStream.close();
                    DownloadException e = new DownloadException();
                    e.printStackTrace();
                    u++;
                    break;
                }
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
*/
