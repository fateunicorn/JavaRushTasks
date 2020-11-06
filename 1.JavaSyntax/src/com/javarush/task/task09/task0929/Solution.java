package com.javarush.task.task09.task0929;

import java.io.*;

/* 
C:\Users\Sergey\Desktop\otesd.txt
C:\Users\Sergey\Desktop\cd.txt

C:\Users\Sergey\Desktop\otsd.txt
C:\Users\Sergey\Desktop\cd.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName;
        String destinationFileName;
        InputStream fileInputStream;
        OutputStream fileOutputStream;
        for (int i = 0; i < 2; i++) {
            try {
                sourceFileName = reader.readLine();
                fileInputStream = getInputStream(sourceFileName);
                i=200;
                destinationFileName = reader.readLine();
                fileOutputStream = getOutputStream(destinationFileName);
        /*for (; fileInputStream.available()==0;) {
            System.out.println("Файл не существует.");
        }
        System.out.println(fileInputStream.available());*/
                while (fileInputStream.available() > 0) {
                    int data = fileInputStream.read();
                    fileOutputStream.write(data);
                }
                fileInputStream.close();
                fileOutputStream.close();
            }
            catch (FileNotFoundException e){
                System.out.println("Файл не существует.");
            }
        }



    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

