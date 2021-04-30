package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> stack = new ArrayList();
        int ff = 0;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        String a1 = buffer.readLine();
        FileInputStream fileInputStream = new FileInputStream(a1);
        while (fileInputStream.available() > 0) {
            int r = fileInputStream.read();
            stack.add(r);
        }
//        System.out.println(stack);
        fileInputStream.close();
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i)==(44)){
                ff++;
            }
        }
        System.out.println(ff);
    }
}

//C:\Users\Sergey\Desktop\cd.txt