package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
        String a2 = bufferedReader.readLine();
        a1 = "C:\\Users\\Sergey\\Desktop\\cd1.txt"; //del
        a2 = "C:\\Users\\Sergey\\Desktop\\cd2.txt"; //del
        bufferedReader.close();
        FileReader fileReader = new FileReader(a1);
        BufferedReader bufferFileReader = new BufferedReader(fileReader);
        BufferedWriter bufferFileWriter = new BufferedWriter(new FileWriter(a2));
        String fileStringCompilation = "";
        String sReadLineFromBuRe;
        while ((sReadLineFromBuRe = bufferFileReader.readLine()) != null){
            fileStringCompilation = fileStringCompilation+sReadLineFromBuRe;
        }
        String[] sMass = fileStringCompilation.split("\\p{Punct}");
        String finResultString = "";
        for (int i = 0; i < sMass.length; i++) {
             finResultString = finResultString+sMass[i];
        }
        bufferFileWriter.write(finResultString);
        fileReader.close();
        bufferFileReader.close();
        bufferFileWriter.close();
    }
}
/*
        stringFromFile = stringFromFile.replace('/', ' ');
        stringFromFile = stringFromFile.replace(',', ' ');
        stringFromFile = stringFromFile.replace('.', ' ');
        stringFromFile = stringFromFile.replace('?', ' ');
        stringFromFile = stringFromFile.replace('!', ' ');
*/
