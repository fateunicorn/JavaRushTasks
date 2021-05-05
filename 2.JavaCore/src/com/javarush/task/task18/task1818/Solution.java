package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        String a1 = buffer.readLine();
        String a2 = buffer.readLine();
        String a3 = buffer.readLine();
        inputStreamReader.close();
        buffer.close();
        FileOutputStream fileOutputStream = new FileOutputStream(a1, true);
        FileInputStream fis2 = new FileInputStream(a2);
        FileInputStream fis3 = new FileInputStream(a3);
//        ArrayList<Integer> list = new ArrayList<>();
        while (0 < fis2.available()){
//            list.add(fis2.read());
            fileOutputStream.write(fis2.read());
        }
        fis2.close();
        while (0 < fis3.available()){
            fileOutputStream.write(fis3.read());
        }
        fis3.close();
        fileOutputStream.close();
    }
}
/*
C:\Users\Sergey\Desktop\cd.txt
C:\Users\Sergey\Desktop\cd2.txt
C:\Users\Sergey\Desktop\cd1.txt
*/
