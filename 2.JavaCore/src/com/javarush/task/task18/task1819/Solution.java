package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        String a1 = buffer.readLine();
        String a2 = buffer.readLine();
        inputStreamReader.close();
        buffer.close();
        FileInputStream fis1 = new FileInputStream(a1);
//        System.out.println(fis1.available());
//        FileOutputStream fos2 = new FileOutputStream(a2);
        FileInputStream fis2 = new FileInputStream(a2);
        ArrayList<Integer> list = new ArrayList<>();
        while (0 < fis2.available()) {
            list.add(fis2.read());
        }
        fis2.close();
        while (0 < fis1.available()) {
            list.add(fis1.read());
        }
        fis1.close();
        FileOutputStream fos1 = new FileOutputStream(a1);
        for (int i = 0; i < list.size(); i++) {
            fos1.write(list.get(i));
        }
        fos1.close();
    }
}
/*
C:\Users\Sergey\Desktop\cd.txt
C:\Users\Sergey\Desktop\cd1.txt
*/
