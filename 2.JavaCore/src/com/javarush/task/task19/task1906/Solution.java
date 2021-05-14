













package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String a2 = reader.readLine();
        reader.close();

//        a1 = "C:\\Users\\Sergey\\Desktop\\cd1.txt"; //del
//        a2 = "C:\\Users\\Sergey\\Desktop\\cd2.txt"; //del
//        File file = new File(a1);
        FileReader fileReader = new FileReader(a1);
        FileWriter fileWriter = new FileWriter(a2);
        int i = 1;
        while (fileReader.ready()){
            int i1 = fileReader.read();
            if (i%2==0) {
                fileWriter.write(i1);
//                System.out.println((char) i1);
//                System.out.println(i);
            }
            i++;
        }
        fileReader.close();
        fileWriter.close();
    }
}
