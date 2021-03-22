package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));//C:\Users\Sergey\Desktop\cd.txt
        String fileName = buffer.readLine();
/*
        fileName = "C:\\Users\\Sergey\\Desktop\\cd.txt";
*/
        InputStream fr=new FileInputStream(fileName);
        buffer = new BufferedReader(new InputStreamReader(fr));

        ArrayList<Integer> list = new ArrayList<>();

        while (buffer.ready()) {
            list.add(Integer.parseInt(buffer.readLine()));
        }
        Integer[] ints = new Integer[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i]=list.get(i);
        }
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]%2==0||ints[i]%-2==0) {
                System.out.println(ints[i]);
            }
        }
        buffer.close();
        fr.close();
    }
}
/*
5
8
-2
11
3
-5
2
10
*/
