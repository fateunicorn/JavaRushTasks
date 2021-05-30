package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        //fileName = "c://temp//digitwords.txt";
        bufferedReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        while (fileReader.ready()){
            String line = fileReader.readLine();
            for (Map.Entry<Integer, String> e: map.entrySet()
            ) // line = line.replaceAll(" " + e.getKey() + " ", " " + e.getValue() + " ");
                line=line.replaceAll("\\b"+e.getKey()+"\\b",e.getValue());
            System.out.println(line);
        }

        fileReader.close();

    }
}


/*
//            Pattern pattern = Pattern.compile("(\\b\\d.+?\\b)");
            Pattern pattern = Pattern.compile("\\b\\d+?\\b");
            Matcher matcher = pattern.matcher(sReadLineFromBuRe);
            while (matcher.find()) {
//                System.out.println(sReadLineFromBuRe.substring(matcher.start(), matcher.end()));
                int putMapQwI = Integer.parseInt(sReadLineFromBuRe.substring(matcher.start(), matcher.end()));
                System.out.println(putMapQwI+ " -- it's "+(putMapQwI>=0&&putMapQwI<=12));
                if (putMapQwI>=0&&putMapQwI<=12) {
                    sReadLineFromBuRe = sReadLineFromBuRe.substring(0, matcher.start()) + map.get(putMapQwI) + sReadLineFromBuRe.substring(matcher.end(), sReadLineFromBuRe.length());
                }
                matcher = pattern.matcher(sReadLineFromBuRe);
//                Integer.parseInt(sReadLineFromBuRe.substring(matcher.start(), matcher.end()));
            }
            System.out.println(sReadLineFromBuRe);
            */

/*
public static void main(String[] args) {
    String text = "Егор Алла Александр";
    Pattern pattern = Pattern.compile("А.+а");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
        System.out.println(text.substring(matcher.start(), matcher.end()));
    }
}

\\b\\d*\\b

31
12
19
15
5
20
19

31
12
1987
15
5
2013
19

        String a2 = bufferedReader.readLine();
//        a2 = "C:\\Users\\Sergey\\Desktop\\cd2.txt"; //del

ноль, целковый, полушка, четвертушка, осьмушка, пудовичок, медячок, серебрячок, золотничок, девятичок, десятичок
*/
