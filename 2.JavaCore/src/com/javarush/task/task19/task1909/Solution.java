package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
        String a2 = bufferedReader.readLine();
//        a1 = "C:\\Users\\Sergey\\Desktop\\cd1.txt"; //del
//        a2 = "C:\\Users\\Sergey\\Desktop\\cd2.txt"; //del
        bufferedReader.close();
        FileReader fileReader = new FileReader(a1);
        BufferedReader bufferFileReader = new BufferedReader(fileReader);
        BufferedWriter bufferFileWriter = new BufferedWriter(new FileWriter(a2));
//        String fileStringCompilation = "";
        String sReadLineFromBuRe;
        while ((sReadLineFromBuRe = bufferFileReader.readLine()) != null){
            sReadLineFromBuRe = sReadLineFromBuRe.replace('.', '!');
            bufferFileWriter.write(sReadLineFromBuRe);
        }
        fileReader.close();
        bufferFileReader.close();
        bufferFileWriter.close();
    }
}
