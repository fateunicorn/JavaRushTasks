package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.nio.CharBuffer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
//        String a2 = bufferedReader.readLine();
//        a1 = "C:\\Users\\Sergey\\Desktop\\cd1.txt"; //del
//        a2 = "C:\\Users\\Sergey\\Desktop\\cd2.txt"; //del
        bufferedReader.close();
        File file = new File(a1);
        FileReader fileReader = new FileReader(a1);
        char[] chars = new char[(int)file.length()];
//        byte[] bytes = new byte[(int)file.length()];
        while (fileReader.ready()){
            fileReader.read(chars);
        }
        fileReader.close();
        String stringFromFile = new String(chars);
//        stringFromFile = "cabj1/cabj2.world,cabj4?world cabj6";
        stringFromFile = stringFromFile.replace('/', ' ');
        stringFromFile = stringFromFile.replace(',', ' ');
        stringFromFile = stringFromFile.replace('.', ' ');
        stringFromFile = stringFromFile.replace('?', ' ');
        stringFromFile = stringFromFile.replace('!', ' ');
        String[] s = stringFromFile.split("\\s");
        int sumAllWords = 0;
        for (int i = 0; i < s.length; i++) {
            if("world".equals(s[i])){
                sumAllWords++;
            }
        }
        System.out.println(sumAllWords);
    }
}
