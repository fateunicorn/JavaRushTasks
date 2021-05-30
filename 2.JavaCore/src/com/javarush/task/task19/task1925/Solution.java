package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));
        String wasWriting = "";
        int firstIterationWithSimbol = 0;
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] maLine = line.split(" ");
            for (int i = 0; i < maLine.length; i++) {
                if (maLine[i].length() > 6 && firstIterationWithSimbol == 1){
                    wasWriting = wasWriting + "," + maLine[i];
                } else if (maLine[i].length() > 6 && firstIterationWithSimbol == 0){
                    wasWriting = wasWriting + maLine[i];
                    firstIterationWithSimbol = 1;
                }
            }
        }
        bufferedReader.close();

        bufferedWriter.write(wasWriting);
        bufferedWriter.close();
    }
}


