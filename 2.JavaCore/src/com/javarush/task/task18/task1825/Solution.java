package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = "";
        ArrayList<String> list = new ArrayList<>();
        try {
            while (!filename.equals("end")) {
                filename = reader.readLine();
                list.add(filename);
            }
        }catch (IOException e){
        }
//        System.out.println(list);
        Collections.sort(list); // Сортировка имен частей
//        System.out.println(list);
        filename = list.get(0).substring(0, list.get(0).lastIndexOf(".")); // Формирование имени основного файла
        int bytebuffer;
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filename))){
            for (String s : list) {
                try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(s))){
                    while((bytebuffer = in.read()) != -1){
                        out.write(bytebuffer);
                    }
                } catch (IOException e){
                }
            }
        } catch (IOException e){
        }
    }
}
/*
C:\Users\Sergey\Desktop\pls_no\p.avi.part2
C:\Users\Sergey\Desktop\pls_no\p.avi.part1
C:\Users\Sergey\Desktop\pls_no\p.avi.part3
end

       FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Username\\Desktop\\test.txt");

       BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);

       int i;

       while((i = bufferedInputStream.read())!= -1){

           System.out.print((char)i);



*/
