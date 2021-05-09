package com.javarush.task.task18.task1828;

/* 
?????? 2
-u 19847983 Куртка(для сноубор истов, разм 33333.99 1234
-d 198479
*/

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int tcp = 0;
        boolean b = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();                   //uncomment
//        a1 = "C:\\Users\\Sergey\\Desktop\\cd1.txt"; //del
//        File file = new File(a1);
        reader.close();
        InputStream inputStream = new FileInputStream(a1);
        InputStreamReader inputStreamR = new InputStreamReader(inputStream, "UTF8");
        char[] argsToCharArray = args[1].toCharArray();
        ArrayList<Integer> firstArg = new ArrayList<>();
        for (char c : argsToCharArray) {
            firstArg.add((int) c);
        }
        ArrayList<Integer> secondAndMoreArgs = new ArrayList<>();
        for (int k = 2; k < args.length; k++) {
            char[] chars = args[k].toCharArray();
            for (int l = 0; l < chars.length; l++) {
                secondAndMoreArgs.add((int) chars[l]);
            }/*
            if (k<args.length-3) {
                secondAndMoreArgs.add(32);
            }*/
        }
        /*for (int l = 0; l < secondAndMoreArgs.size(); l++) {
            System.out.print((char)secondAndMoreArgs.get(l).intValue());
        }*/















        if (args[0].equals("-u")) {
            int idata = inputStreamR.read();
            tcp = idata;
//            System.out.println(firstArg.size());
            while(idata != -1){
//                System.out.println(tcp);
                char theChar = (char) idata;
                idata = inputStreamR.read();
//            while (0 < inputStream.available()) {
//            System.out.println("d;kf");
//
                if (i < 8 && firstArg.get(i) == tcp) {
//                System.out.println("if=" + firstArg.get(i));
//                    System.out.println("i=" + i);
                } else {
                    if (i != firstArg.size()) i = 0;
                    else i--;
                }
//            System.out.println(i+"int");
                if (b && j < secondAndMoreArgs.size()) {
                    tcp = secondAndMoreArgs.get(j);
                    j++;
                }
                if (i == 7) b = true;
//            System.out.println("tcp=" + /*(char)*/tcp + "\n");
                list.add(tcp);
                i++;
                tcp = idata;
            }
            inputStreamR.close();
            inputStream.close();
            OutputStream outputStream = new FileOutputStream(a1);
            /*for (int k = 0; k < list.size(); k++) {
                outputStream.write(list.get(k));
            }*/
            for (int k = 0; k < list.size(); k+=2) {
                try {
                    String temp = "" + (char) ((int) list.get(k)) + (char) ((int) list.get(k + 1));
                    outputStream.write(temp.getBytes());
                    System.out.println(temp);
                } catch (IndexOutOfBoundsException e){
                    String temp = "" + (char) ((int) list.get(k));
                    outputStream.write(temp.getBytes());
                    System.out.println(temp);
                }
            }
            outputStream.close();
        }
        if (args[0].equals("-d")) {
            String s1 = args[1];
            for (int k = 0; k < 8 - args[1].length(); k++) {
                s1=s1+" ";
            }
            try {
//                File fileDir = new File("c:\\temp\\test.txt");
                BufferedReader in = new BufferedReader(inputStreamR);
                String str;
                ArrayList<String> list1 = new ArrayList<>();

                while ((str = in.readLine()) != null) {
                    int indexM = str.indexOf(s1);
                    if (indexM == -1) {
//                        System.out.println("lkwef");
//                        bufferedWriter.write(str);
                        list1.add(str);
//                        System.out.println(str);
                    }
//                    outputStream.close();
                }
                in.close();

                OutputStream outputStream = new FileOutputStream(a1);
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
                bufferedWriter.write(list1.get(0));
                System.out.print(list1.get(0));
                for (int k = 1; k < list1.size(); k++) {
                    if (list1.get(k)!=null) {/*
                        outputStream.write(13);
                        outputStream.write(10);*/
                        bufferedWriter.write((byte)13);
                        bufferedWriter.write((byte)10);
                        System.out.println();
                        bufferedWriter.write(list1.get(k));
                        System.out.print(list1.get(k));
                    }
                }
                inputStreamR.close();
                inputStream.close();
                bufferedWriter.close();
                outputStream.close();
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

            /*BufferedReader bufferedReader = new BufferedReader(inputStreamR);
            ArrayList<String> list1 = new ArrayList<>();
            String s1 = args[1];
            for (int k = 0; k < 8 - args[1].length(); k++) {
                s1=s1+" ";
            }
            for (int k = 0; bufferedReader.ready(); k++) {
                String s = bufferedReader.readLine();
//                System.out.println(s);
//                int indexM = s.indexOf(args[1]); //|198479  |
                int indexM = s.indexOf(s1); //|198479  |
                System.out.println(s);
                if(indexM == - 1) {list1.add(s);
//                    System.out.println("No.");
                } else ;
//                    System.out.println("Слово из args найдено.");
            }
            inputStreamR.close();
            bufferedReader.close();
//            System.out.println(list1);
            OutputStream outputStream = new FileOutputStream(a1);*//*
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            for (int k = 0; k < list1.size(); k++) {
                bufferedWriter.write(list1.get(k));
            }
            bufferedWriter.write("call");*//*
            char[] chars = list1.get(0).toCharArray();
            for (int l = 0; l < chars.length; l++) {
                outputStream.write(chars[l]);
            }
            for (int k = 1; k < list1.size(); k++) {
                chars = list1.get(k).toCharArray();
                outputStream.write(13);
                outputStream.write(10);
                for (int l = 0; l < chars.length; l++) {
                    outputStream.write(chars[l]);
                }
            }
            outputStream.close();*/
        }

    }
}



/*
public static void main(String[]args){

    try {
        File fileDir = new File("c:\\temp\\test.txt");

        BufferedReader in = new BufferedReader(
           new InputStreamReader(
                      new FileInputStream(fileDir), "UTF8"));

        String str;

        while ((str = in.readLine()) != null) {
            System.out.println(str);
        }

                in.close();
        }
        catch (UnsupportedEncodingException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
*/



















/*while (0 < inputStream.available()) {
//            System.out.println("d;kf");
            byte[] bytes = inputStream.readAllBytes();
            System.out.println(bytes[0]);
              *//*  tcp = inputStream.read();
//
                if (i < 8 && firstArg.get(i) == tcp) {
//                System.out.println("if=" + firstArg.get(i));
//                    System.out.println("i=" + i);
                } else {
                    if (i != firstArg.size()) i = 0;
                    else i--;
                }
//            System.out.println(i+"int");
                if (b && j < secondAndMoreArgs.size()) {
                    tcp = secondAndMoreArgs.get(j);
                    j++;
                }
                if (i == 7) b = true;
//            System.out.println("tcp=" + tcp + "\n");
                list.add(tcp);
                i++;

                for (int k = 0; k < list.size(); k++) {               //заменить на write
                    System.out.print((char) list.get(k).intValue());  //заменить на write
                }                         *//*                            //заменить на write
        }*/
/*

Reader      inputStreamReader = new InputStreamReader(inputStream);

int data = inputStreamReader.read();
while(data != -1){
    char theChar = (char) data;
    data = inputStreamReader.read();
}


Источник
Поделиться:
Теги:
java
apache-commons-io
9 ответов
17
Лучший ответ

String line = FileUtils.readLines(file).get(lineNumber);

но он все еще имеет проблему с эффективностью.

В качестве альтернативы вы можете использовать:

 LineIterator it = IOUtils.lineIterator(
       new BufferedReader(new FileReader("file.txt")));
 for (int lineNumber = 0; it.hasNext(); lineNumber++) {
    String line = (String) it.next();
    if (lineNumber == expectedLineNumber) {
        return line;
    }
 }
*/
































/*

 tcp = inputStream.read();

//            System.out.println(firstArg.size());
            if (tcp==firstArg.get(j)){
                j++;
                System.out.println((char)tcp +" "+ (char)firstArg.get(j).intValue() + " "+j);
                if (j==7){
                    tcp = inputStream.read();
                    for (int k = 0; k < secondAndMoreArgs.size()-40; k++) {
                        System.out.println("k");
                        list.add(secondAndMoreArgs.get(k));
                        tcp = inputStream.read();
                    }
                    j=0;
                }
            } else {
                j = 0;
            }
            list.add(tcp);
            i++;


*/


/*
        for (int j = 0; j < arrayListsChara.size(); j++) {
            System.out.println(arrayListsChara.get(j));
        }
       ArrayList<Character> argsListChar = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            char[] argsToChar = args[i].toCharArray();
            if (argsListChar.size()>8&&38>argsListChar.size()){
                argsListChar.add(' ');
            }
            for (int j = 0; j < argsToChar.length; j++) {
                argsListChar.add(argsToChar[j]);
            }
        }
//        System.out.println(argsListChar);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        a1 = "C:\\Users\\Sergey\\Desktop\\cd1.txt"; //del
        FileInputStream fileInputStream = new FileInputStream(a1);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 24);
        int i;
        int SI = 0;
        ArrayList<ArrayList<Character>> arrayListsChara = new ArrayList<>();
        // ????????  ????? ?? ?????? ????? txt
        arrayListsChara.add(new ArrayList<>());
        while((i = bufferedInputStream.read())!= -1) {
            if (i!=13){
                if (i!= 10) {
//                    System.out.print((char) i);
                    arrayListsChara.get(SI).add((char) i);
                } else {
                    SI++;
                    arrayListsChara.add(new ArrayList<>());
                }
            }
        }
        for (int j = 0; j < arrayListsChara.size(); j++) {
            for (int k = 0; k < arrayListsChara.get(j).size(); k++) {
                System.out.print(arrayListsChara.get(j).get(k));
            }
            System.out.println();
        }
        // ?????????? ? ?????????? -u
        if (args[0].equals("-u")){
        *//*  FileOutputStream fileOutputStream = new FileOutputStream(a1);
            String greetings = "0000";
            byte[] bytes = greetings.getBytes();

            InputStream inputStream = new ByteArrayInputStream(bytes);

            System.setIn(inputStream);*//*
//            char[] c = args[1].toCharArray();
//            System.out.println("-u");
//            System.out.println(arrayListsChara.get(2));
            for (int iii = 0; iii < arrayListsChara.size(); iii++) {
                boolean b = true;
                for (int j = 0; j < arrayListsChara.get(iii).size(); j++) {
//                    System.out.println(arrayListsChara.get(iii).get(j));
//                    System.out.println(argsListChar.get(j));
                    if (j>6){
//                        System.out.println("j1");
                        arrayListsChara.set(iii, argsListChar);
                        break;
                    }
                    if (j > -1&&b){
//                        System.out.println(j);
                        for (int k = 0; k < 8; k++) {
                            if (arrayListsChara.get(iii).get(k).equals(argsListChar.get(k))){

                            } else {
                                b=false;
                                break;
                            }
                            j = k;
                        }
                    }
                }
                *//*for (int iz = 0; iz < arrayListsChara.size(); iz++) {

                }*//*
//                System.out.println(arrayListsChara.get(2));

                *//*for (int j = 0; j < 8; j++) {
                    if (arrayListsChara.get(iii).get(j)!=' '){
                        if (arrayListsChara.get(iii).get(j)==argsListChar.get(j)){
                            System.out.println("whyareuoygay");
                        } else {
                            System.out.println("oktobegay");
                            doe=1;
                            break;
                        }
                    }
                }
                char[] co = (args[2]+args[3]+args[4]).toCharArray();
                if (doe!=1) {
                    for (int j = 7; j < arrayListsChara.get(iii).size() - 1; j++) {
                        arrayListsChara.get(iii).set(j, co[j - 7]);
                    }
                }*//*
            }

            FileOutputStream fileOutputStream = new FileOutputStream(a1);
            for (int k = 0; k < arrayListsChara.size(); k++) {
                System.out.print(k);
                for (int q = 0; q < arrayListsChara.get(k).size(); q++) {
//                    System.out.print(q);
                    System.out.print(arrayListsChara.get(k).get(q));
                    fileOutputStream.write(arrayListsChara.get(k).get(q));
                }
                System.out.println();
                fileOutputStream.write(13);
                fileOutputStream.write(10);*/
