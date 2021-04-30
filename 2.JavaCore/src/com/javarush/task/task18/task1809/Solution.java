package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        String a1 = buffer.readLine();
        String a2 = buffer.readLine();
        inputStreamReader.close();
        buffer.close();
        FileInputStream fileInputStream = new FileInputStream(a1);
        FileOutputStream fileOutputStream = new FileOutputStream(a2);
        ArrayList<Integer> list = new ArrayList<>();
        while (fileInputStream.available()>0){
            list.add(fileInputStream.read());
        }
        fileInputStream.close();
        for (int i = list.size()-1; i > -1; i--) {
            fileOutputStream.write(list.get(i));
        }
        fileOutputStream.close();
    }
}
/*
C:\Users\Sergey\Desktop\cd.txt
C:\Users\Sergey\Desktop\cd1.txt
C:\Users\Sergey\Desktop\cd2.txt
*/
