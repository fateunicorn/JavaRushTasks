package com.javarush.task.task18.task1820;

/*
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        String a1 = buffer.readLine();
        String a2 = buffer.readLine();
        inputStreamReader.close();
        buffer.close();
        FileInputStream fis1 = new FileInputStream(a1);
        FileOutputStream fos2 = new FileOutputStream(a2, true);
        PrintStream filePrintStream = new PrintStream(fos2);
//        fos2.close();
        ArrayList<String> arSt = new ArrayList<>();
        ArrayList<Integer> arIn = new ArrayList<>();
        ArrayList<String> arIn1 = new ArrayList<>();
        while (fis1.available()>0){
            arIn.add(fis1.read());
        }
        fis1.close();
        int s = 0;
        char chab;
        for (int i = 0; i < arIn.size(); i++) {
            if (arIn.get(i)!=' '){
                try {
                    if (!arSt.get(s).equals("ooo")) {
                        chab=(char) arIn.get(i).intValue();
                        arSt.set(s, arSt.get(s) + Character.toString(chab));//<-
/*

                        int ps = 54;

                        String dfr2 = Character.toString(ps);

                        char ch1 = (char)(Integer)ps;

                        char ch2 = (Character)(Integer)ps;




*/
                    }
                } catch (IndexOutOfBoundsException e){
                    chab=(char) arIn.get(i).intValue();
                    arSt.add(Character.toString(chab));
                }

                /*if (arSt.get(s)==null) {
                    arSt.add(Character.toString(arIn.get(i)));
                } else {

                }*/

                /*if (s>0) {
                    arSt.set(s, arSt.get(s) + Character.toString(arIn.get(i)));
//                    System.out.println("chalo");
                } else {
//                    System.out.println("ho");
                    arSt.add(Character.toString(arIn.get(i)));
                }*/
            } else {
                s++;
            }
        }
//        System.out.println(arSt);//flshhhhhhhhhhhlhsfhlfshlfshlfshlsjhwaoh4lufgahl4tiyfsgylgiufygw4gls
        for (int i = 0; i < arSt.size(); i++) {
            arIn1.add(""+(Math.round(Float.parseFloat(arSt.get(i)))));
        }
//        System.out.println(arIn1);//dkahkhadkadhljadadljadjladjladjladljadljdjlaljdaadjladjladjlljadlj
        /*System.out.print(arIn.get(0));
        for (int i = 1; i < arIn.size(); i++) {
            System.out.print(" "+arIn.get(i));
        }*/

        filePrintStream.print(arIn1.get(0));
        for (int i = 1; i < arIn1.size(); i++) {
            filePrintStream.print(" "+arIn1.get(i));
        }
        fos2.close();
        filePrintStream.close();
        /*fos2.write(arIn.get(0));
        for (int i = 1; i < arIn.size(); i++) {
            fos2.write(' ');
            fos2.write(arIn.get(i));
        }*/

        /*ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            a.add("a.");
            a.add("a.");
            a.add("a");
            a.add(".");
        }
        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(".")){
                a.set()
            }
        }
        System.out.println(a);*/

    }
}

/*
        System.out.println(((int) Math.round(3.49f)));// => 3
        System.out.println(((int) Math.round(3.50f)));// => 4
        System.out.println(((int) Math.round(3.51f)));// => 4
        System.out.println(((int) Math.round(-3.49f)));// => -3
        System.out.println(((int) Math.round(-3.50f)));// => -3
        System.out.println(((int) Math.round(-3.51f)));// => -4

C:\Users\Sergey\Desktop\cd1.txt
C:\Users\Sergey\Desktop\cd2.txt
*/