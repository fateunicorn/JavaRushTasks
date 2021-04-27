/*package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

*//*
Транзакционность
*//*

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String a1 = buffer.readLine();
        String a2 = buffer.readLine();
        InputStream fr1=new FileInputStream(a1);
        InputStream fr2=new FileInputStream(a2);
        buffer = new BufferedReader(new InputStreamReader(fr1));

        while (buffer.ready()) {
            allLines.add(buffer.readLine());
        }
        buffer = new BufferedReader(new InputStreamReader(fr2));

        while (buffer.ready()) {
            forRemoveLines.add(buffer.readLine());
        }
//        System.out.println(allLines+"   0");
        Solution fm = new Solution();
        fm.joinData();
        buffer.close();
    }

    public void joinData() throws IOException {

        {
            for (int i = 0; i < forRemoveLines.size(); i++) {

                for (int j = 0; j < allLines.size(); j++) {
                    if (forRemoveLines.get(i).equals(allLines.get(j))){

                        allLines.remove(j);
                        allLines.add(j, null);

                    }
                }
            }
//            System.out.println(allLines+"   1");
            allLines.removeAll(Arrays.asList(null,""));
//            System.out.println(allLines+"   2");
            if (allLines.size()==0){

            } else {
                allLines.clear();
                throw new CorruptedDataException();
            }
        }
    }
}*/
/*
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));//C:\Users\Sergey\Desktop\cd.txt
        String fileName = buffer.readLine();

        //fileName = "C:\\Users\\Sergey\\Desktop\\cd.txt";

        InputStream fr=new FileInputStream(fileName);
        buffer = new BufferedReader(new InputStreamReader(fr));

        ArrayList<Integer> list = new ArrayList<>();

        while (buffer.ready()) {
            list.add(Integer.parseInt(buffer.readLine()));
        }

C:\\Users\\Sergey\\Desktop\\cd.txt
C:\\Users\\Sergey\\Desktop\\1.txt
*/
