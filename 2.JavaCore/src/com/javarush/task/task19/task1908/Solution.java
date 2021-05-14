package com.javarush.task.task19.task1908;

/* 
Выделяем числа
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
        String fileStringCompilation = "";
        String sReadLineFromBuRe;
        while ((sReadLineFromBuRe = bufferFileReader.readLine()) != null){
            fileStringCompilation = fileStringCompilation + sReadLineFromBuRe;
        }
//        String s = (fileStringCompilation.replaceAll("\\D", " "));
        String s = fileStringCompilation;
        StringBuffer sb = new StringBuffer(s);
        s = String.valueOf(sb.insert(s.length()," "));
        String[] strings = s.split(" ");
        s="";
        for (int i = 0; i < strings.length; i++) {
            try {
                 s=s+(Integer.parseInt(strings[i])+" ");
            } catch (NumberFormatException e){}
        }
        s=s.substring(0, s.length() - 1)/*System.out.println(s)*/;
        fileReader.close();
        bufferFileReader.close();
        BufferedWriter bufferFileWriter = new BufferedWriter(new FileWriter(a2));
        bufferFileWriter.write(s);
        bufferFileWriter.close();
    }
}
