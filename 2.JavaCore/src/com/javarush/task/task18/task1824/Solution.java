package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        while (true){
            String a1 = buffer.readLine();
            try {
                FileInputStream fileInputStream = new FileInputStream(a1);
                fileInputStream.close();
            } catch (FileNotFoundException e){
                inputStreamReader.close();
                buffer.close();
                System.out.println(a1);
                break;
            }
        }
    }
}
