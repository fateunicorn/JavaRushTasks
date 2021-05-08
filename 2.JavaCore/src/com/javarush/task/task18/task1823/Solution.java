package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        ArrayList<String> lisd = new ArrayList<>();
        while (true){
            String a1 = buffer.readLine();
            if (a1.equals("exit")) {
                break;
            }
            lisd.add(a1);
        }
        for (int i = 0; i < lisd.size();  i++) {
            ReadThread readThread = new ReadThread(lisd.get(i));
            readThread.start();
            readThread.join();
            if (!readThread.isInterrupted()){
//                System.out.println("interr");
                readThread.interrupt();
            }
        }
//        System.out.println(resultMap);
//        System.out.println(lisd);
        inputStreamReader.close();
        buffer.close();
    }

    public static class ReadThread extends Thread {
        volatile FileInputStream fis1;
        volatile String fileN;

        public ReadThread(String fileName) throws IOException {
                fis1 = new FileInputStream(fileName);
                fileN = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут C:\\Users\\Sergey\\Desktop\\1.txt
        @Override
        public void run() {
//            System.out.println(fileN);
            try {
                synchronized (this) {
                    ArrayList<Integer> arIn = new ArrayList<>();
                    while (fis1.available() > 0) {
                        arIn.add(fis1.read());
                    }
                    fis1.close();
                    Collections.sort(arIn);
                    int ma=0;
                    int pm=0;
                    int si=0;
                    for (int i = 0; i < arIn.size()-1; i++) {
                        if (arIn.get(i)==(int)arIn.get(i+1)){
                            pm++;
                            if (pm>ma){
                                ma=pm;
                                si=arIn.get(i);
                            }
                        } else {
                            pm=0;
                        }
                    }
                    resultMap.put(fileN, si);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
C:\\Users\\Sergey\\Desktop\\1.txt
C:\\Users\\Sergey\\Desktop\\cd1.txt
C:\\Users\\Sergey\\Desktop\\cd2.txt
exit
*/
