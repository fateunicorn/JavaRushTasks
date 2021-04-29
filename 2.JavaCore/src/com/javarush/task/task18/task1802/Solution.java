package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        String a1 = buffer.readLine();
        FileInputStream fileInputStream = new FileInputStream(a1);
        ArrayList<Integer> stack = new ArrayList();
        while (fileInputStream.available()>0){
            stack.add(fileInputStream.read());
        }
        fileInputStream.close();
        System.out.println(Collections.min(stack));
    }
}
