package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String a2 = reader.readLine();
        reader.close();

//        a1 = "C:\\Users\\Sergey\\Desktop\\cd1.txt"; //del
//        a2 = "C:\\Users\\Sergey\\Desktop\\cd2.txt"; //del
//        File file = new File(a1);
        BufferedReader bufferedReaderLt = new BufferedReader(new FileReader(a1));
        BufferedReader bufferedReaderRt = new BufferedReader(new FileReader(a2));
        ArrayList<String> arLiLt = new ArrayList<>();
        ArrayList<String> arLiRt = new ArrayList<>();
        while (bufferedReaderLt.ready()){
            arLiLt.add(bufferedReaderLt.readLine());
        }
        while (bufferedReaderRt.ready()){
            arLiRt.add(bufferedReaderRt.readLine());
        }
        int iRt = 0;
        int iLt = 0;
        while (iLt < arLiLt.size()||iRt < arLiRt.size()) {
            try {
                if (arLiLt.get(iLt).equals(arLiRt.get(iRt))) {
                    lines.add(new LineItem(Type.SAME, arLiLt.get(iLt)));
                    iLt++;
                    iRt++;
                } else if (arLiLt.get(iLt).equals(arLiRt.get(iRt + 1))) {
                    lines.add(new LineItem(Type.ADDED, arLiRt.get(iRt)));
                    iRt++;
                } else if (arLiLt.get(iLt + 1).equals(arLiRt.get(iRt))) {
                    lines.add(new LineItem(Type.REMOVED, arLiLt.get(iLt)));
                    iLt++;
                }
            } catch (IndexOutOfBoundsException e){
                if (arLiLt.size()>arLiRt.size()){
                    lines.add(new LineItem(Type.REMOVED, arLiLt.get(iLt)));
                    iLt++;
                } else {
                    lines.add(new LineItem(Type.ADDED, arLiRt.get(iRt)));
                    iRt++;
                }
            }
        }
/*
        System.out.println(arLiLt);
        System.out.println(arLiRt);
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).type == Type.ADDED){
                System.out.print("a\t");
            }
            if (lines.get(i).type == Type.REMOVED){
                System.out.print("r\t");
            }
            if (lines.get(i).type == Type.SAME){
                System.out.print("s\t");
            }
            System.out.println(lines.get(i).line);
        }*/

        bufferedReaderLt.close();
        bufferedReaderRt.close();
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}

/*
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String a2 = reader.readLine();
        reader.close();

//        a1 = "C:\\Users\\Sergey\\Desktop\\cd1.txt"; //del
//        a2 = "C:\\Users\\Sergey\\Desktop\\cd2.txt"; //del
//        File file = new File(a1);
        FileReader fileReader = new FileReader(a1);
        FileWriter fileWriter = new FileWriter(a2);
        int i = 1;
        while (fileReader.ready()){
            int i1 = fileReader.read();
            if (i%2==0) {
                fileWriter.write(i1);
//                System.out.println((char) i1);
//                System.out.println(i);
            }
            i++;
        }
        fileReader.close();
        fileWriter.close();
*/
