package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
//        String a2 = bufferedReader.readLine();
        a1 = "C:\\Users\\Sergey\\Desktop\\cd1.txt"; //del
//        a2 = "C:\\Users\\Sergey\\Desktop\\cd2.txt"; //del
        bufferedReader.close();
        FileReader fileReader = new FileReader(a1);
        BufferedReader bufferFileReader = new BufferedReader(fileReader);
        String sReadLineFromBuRe;
        String sAllFileTextInOne = "";
        while ((sReadLineFromBuRe = bufferFileReader.readLine()) != null){
            sAllFileTextInOne = sAllFileTextInOne + sReadLineFromBuRe.replace('.', '!');
//            bufferFileWriter.write(sReadLineFromBuRe);
        }
//        System.out.println(sAllFileTextInOne);
        ArrayList<Integer> listStart = new ArrayList<>();
        int intAr = -1;
//        Pattern pattern = Pattern.compile("<"+args[0]+".+?>");
        Pattern pattern = Pattern.compile("<"+args[0]+".*?>");
        Matcher matcher = pattern.matcher(sAllFileTextInOne);
        while (matcher.find()) {
            listStart.add(matcher.start());
            intAr++;
//            System.out.println(sAllFileTextInOne.substring(matcher.start(), matcher.end()) + " №:" + intAr + " on position:" + matcher.start());
        }
        ArrayList<Integer> listEnd = new ArrayList<>();
        intAr = -1;
        pattern = Pattern.compile("</"+args[0]+".*?>");
        matcher = pattern.matcher(sAllFileTextInOne);
        while (matcher.find()) {
            listEnd.add(matcher.end());
            intAr++;
//            System.out.println(sAllFileTextInOne.substring(matcher.start(), matcher.end()) + " №:" + intAr + " on position:" + matcher.end());
        }
        int iSt = 0;
        int iEn = 0;
        int i = 1;
        int j = 0;
        while (iSt < listStart.size()) {
            if (iSt!=listStart.size()-1) {
                if (listStart.get(iSt + i) < listEnd.get(iEn + j)){         //iEn++;
                    i++;
                    j++;
//                    System.out.println();
                } else {
                    if (listStart.get(iSt) >= listEnd.get(iEn)){
                        iEn++;
                    } else {
                        System.out.println(sAllFileTextInOne.substring(listStart.get(iSt), listEnd.get(iEn + j)));                      //System.out.println("AFTER iSt:" + iSt + "\ti:" + i + "\tiEn:" + iEn + " j:" + j);
                        iSt++;
                        i = 1;
                        j = 0;                                              //System.out.println("NOW iSt:" + iSt + "\tiEn:" + iEn);
                    }
                }
            } else {
                System.out.println(sAllFileTextInOne.substring(listStart.get(listStart.size()-1), listEnd.get(listEnd.size()-1)));
                break;
            }
        }
        bufferFileReader.close();



        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
//        String a2 = bufferedReader.readLine();
        a1 = "C:\\Users\\Sergey\\Desktop\\cd1.txt"; //del
//        a2 = "C:\\Users\\Sergey\\Desktop\\cd2.txt"; //del
        bufferedReader.close();
        FileReader fileReader = new FileReader(a1);
        BufferedReader bufferFileReader = new BufferedReader(fileReader);
        String sReadLineFromBuRe;
        String sAllFileTextInOne = "";
        while ((sReadLineFromBuRe = bufferFileReader.readLine()) != null){
            sAllFileTextInOne = sAllFileTextInOne + sReadLineFromBuRe;
        }
        System.out.println(sAllFileTextInOne);
        File file = new File("hh-test.html");
        Document document = Jsoup.parse(file, "UTF-8", "hh.ru");
        Elements h1 = document.select("h1");
        System.out.println(h1);*/

    }
}
