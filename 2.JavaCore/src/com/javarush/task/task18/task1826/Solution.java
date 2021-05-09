package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream is = new FileInputStream(args[1]);
        FileOutputStream ot = new FileOutputStream(args[2]);
        switch (args[0]) {
            case "-e":
                while (is.available() > 0) {
                    int data = is.read() + 1;
                    ot.write(data);
                }
                is.close();
                ot.close();
                break;
            case "-d":
                while (is.available() > 0) {
                    int data = is.read() - 1;
                    ot.write(data);
                }
                is.close();
                ot.close();
                break;
        }
    }
}
/*
C:\\Users\\Sergey\\Desktop\\1.txt
C:\\Users\\Sergey\\Desktop\\cd1.txt
C:\\Users\\Sergey\\Desktop\\cd2.txt
exit
*/