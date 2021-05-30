package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String fileName = "";
        try {BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        fileName = bufferedReader.readLine();
        bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

            while (fileReader.ready()){
                String line = fileReader.readLine();
                System.out.println((new StringBuilder(line)).reverse());
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
