package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = args[0];
        String a2 = args[1];
        bufferedReader.close();
        FileReader fileReader = new FileReader(a1);
        BufferedReader bufferFileReader = new BufferedReader(fileReader);
        String sReadLineFromBuRe;
        String resultForWriter = "";
        String m = "";
        while ((sReadLineFromBuRe = bufferFileReader.readLine()) != null){
            String[] s = sReadLineFromBuRe.split(" ");
//            System.out.println(Arrays.toString(s));
            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < 10; j++) {
                    if (s[i].lastIndexOf(j+"") != -1){
                        resultForWriter = resultForWriter + m + s[i];
                        m = " ";
                        break;
                    }
                }
            }
        }
        bufferFileReader.close();
//        System.out.println(resultForWriter);
        try (BufferedWriter bufferFileWriter = new BufferedWriter(new FileWriter(a2))) {
                bufferFileWriter.write(resultForWriter);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
String cleanOf13String = stringForCleanOf13.("\\p{Punct}", "");
        String[] s = cleanOf13String.split("[ \\n]");
*/
