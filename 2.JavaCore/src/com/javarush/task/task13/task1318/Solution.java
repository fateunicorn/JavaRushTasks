package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String s = buffer.readLine();
        InputStream inStream = new FileInputStream(s);//C:\Users\Sergey\Desktop\otsd.txt

        while (inStream.available() > 0)
        {
            int data = inStream.read(); //читаем один int из потока для чтения
//            write(data); //записываем прочитанный int в другой поток.
            System.out.print((char)data);
        }

        buffer.close();
        inStream.close();
    }

}