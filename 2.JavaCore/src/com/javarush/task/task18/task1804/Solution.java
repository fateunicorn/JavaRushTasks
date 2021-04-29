package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> letters = new HashMap<>();
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        String a1 = buffer.readLine();
        FileInputStream fileInputStream = new FileInputStream(a1);
        ArrayList<Integer> stack = new ArrayList();
        ArrayList<Integer> restacks = new ArrayList();
        ArrayList<Integer> restacks1 = new ArrayList();
        while (fileInputStream.available() > 0) {
            int r = fileInputStream.read();
            stack.add(r);
        }
        fileInputStream.close();
        for (int i = 0; i < stack.size(); i++) {
            Integer tempInt = stack.get(i);

            if (!letters.containsKey(tempInt)) {
                letters.put(tempInt, 1);
            } else {
                letters.put(tempInt, letters.get(tempInt) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : letters.entrySet()) {
//            System.out.println("Буква = " + entry.getKey() + ", Повторений = " + entry.getValue());
            restacks.add(entry.getValue());
            restacks1.add(entry.getKey());
        }
//        System.out.println(restacks);
        Collections.max(restacks);
        int j=0;
        for (int i = 0; i < restacks.size(); i++) {
            if (Collections.min(restacks)==restacks.get(i)){
                if (j==0){
                    System.out.print(restacks1.get(i));
                    j++;
                } else {
                    System.out.print(" "+restacks1.get(i));
                }
                /*for (int j = 0; j < restacks.get(i); j++) {
                    if (j==0){
                        System.out.print(restacks1.get(i));
                    } else {
                        System.out.print(" "+restacks1.get(i));
                    }
                }*/
            }
        }
    }
}
