package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> stack = new ArrayList();
        int ff = 0;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
//        inputStreamReader.close();
        String a1 = buffer.readLine();
        String a2 = buffer.readLine();
        String a3 = buffer.readLine();
        buffer.close();
        inputStreamReader.close();
        FileInputStream fileInputStream = new FileInputStream(a1);
        /*while (fileInputStream.available() > 0) {
            int r = fileInputStream.read();
            stack.add(r);
//            System.out.println(r);
            System.out.println(fileInputStream.available());
        }*/

        byte[] buffen;
//        System.out.println(fileInputStream);
//        System.out.println(fileInputStream.available());
        if (fileInputStream.available()%2!=0) {
            buffen = new byte[fileInputStream.available() / 2 + 1];
//            System.out.println("313131");
        } else {
            buffen = new byte[fileInputStream.available() / 2];
//            System.out.println("323232");
        }
//        System.out.println(stack);
//        System.out.println(9/2);
//        System.out.println(fileInputStream.available());
        int count = fileInputStream.read(buffen);
//        System.out.println(count);

        FileOutputStream outputStream = new FileOutputStream(a2);
        outputStream.write(buffen, 0, count);
        outputStream.close();
        outputStream = new FileOutputStream(a3);
//        System.out.println("Проверка через \"fileInputStream.available()\" на наличие данных перед flush:"+fileInputStream.available());
//        outputStream.write(outputStream.flush());

        buffen = new byte[fileInputStream.available()];
        fileInputStream.read(buffen);
        fileInputStream.close();
        outputStream.write(buffen);
        outputStream.close();
    }
}

/*
FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");
        byte[] buffer = new byte[inputStream.available()];
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском

            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

C:\Users\Sergey\Desktop\cd.txt
C:\Users\Sergey\Desktop\cd1.txt
C:\Users\Sergey\Desktop\cd2.txt
*/
/*
System.out.println("Проверка через \"fileInputStream.available()\" на наличие данных перед flush:"+fileInputStream.available());
//        outputStream.write(outputStream.flush());
        //count = fileInputStream.read(buffen);
        buffen = new byte[fileInputStream.available()];
        fileInputStream.read(buffen);
        // outputStream.write(buffen, buffen.length+1, count);
        outputStream.write(buffen);
        outputStream.flush();
        fileInputStream.close*/
