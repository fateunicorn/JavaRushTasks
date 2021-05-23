package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        filename = "C:\\Users\\Sergey\\Desktop\\cd1.txt";
        reader.close();
        reader = new BufferedReader(new FileReader(filename));

        String line;
        while ((line = reader.readLine()) != null) {
            int count = 0;
            for (String word : words) {
//                System.out.println(word);
                Pattern p = Pattern.compile("\\b"+word+"\\b");
                Matcher m = p.matcher(line);
                if (m.find()) count++;
            }
            if (count == 2) System.out.println(line);
        }
        reader.close();
//        C:\\Users\\Sergey\\Desktop\\cd1.txt
    }
}

/*
int index = str.("Привет");

      if(index == - 1){
         System.out.println("Подстрока \"привет\" не найдена");
      } else {
         System.out.println("Последнее вхождение подстроки \"привет\" в индексе " + index);
      }
*/

/*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
//        a1 = "C:\\Users\\Sergey\\Desktop\\cd1.txt"; //del
        bufferedReader.close();
        FileReader fileReader = new FileReader(a1);
        BufferedReader bufferFileReader = new BufferedReader(fileReader);
        String sReadLineFromBuRe;
        while ((sReadLineFromBuRe = bufferFileReader.readLine()) != null){
            String ReadLineFromBuRe;
            ReadLineFromBuRe = sReadLineFromBuRe;
            ReadLineFromBuRe = ReadLineFromBuRe.replaceAll(", ", " ");
            ReadLineFromBuRe = ReadLineFromBuRe.replaceAll("\\. ", " ");
            ReadLineFromBuRe = ReadLineFromBuRe.replaceAll("; ", " ");
            ReadLineFromBuRe = ReadLineFromBuRe.replaceAll(" \"", " ");
            ReadLineFromBuRe = ReadLineFromBuRe.replaceAll("\" ", " ");
            *//*int i1 = 0;
            for (int i = 0; i < words.size(); i++) {
                if (ReadLineFromBuRe.lastIndexOf(words.get(i)) != -1){
                    i1++;
                }
            }
            if (i1==2){
                System.out.println(sReadLineFromBuRe);
            }*//*
            String[] strings = ReadLineFromBuRe.split(" ");
//            System.out.println(Arrays.toString(strings));
            int[] ints = {0, 0, 0};
            for (int i = 0; i < words.size(); i++){
                for (int j = 0; j < strings.length; j++) {
                    if (strings[j].equals(words.get(i))){
                        ints[i] = ints[i]+1;
                    }
                }
            }
            int sum = 0;
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] != 0){
                    sum++;
                }
            }
            if (sum == 2){
                System.out.println(sReadLineFromBuRe);
            }
        }
        bufferFileReader.close();*/