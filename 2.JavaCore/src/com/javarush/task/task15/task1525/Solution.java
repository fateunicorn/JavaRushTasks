package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution extends IOException {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            //Statics.FILE_NAME = "C:\\Users\\Sergey\\Desktop\\otsd.txt";
            InputStream fr = new FileInputStream(Statics.FILE_NAME);
            buffer = new BufferedReader(new InputStreamReader(fr));

            //ArrayList<Integer> list = new ArrayList<>();

            while (buffer.ready()) {
                lines.add(buffer.readLine());
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
