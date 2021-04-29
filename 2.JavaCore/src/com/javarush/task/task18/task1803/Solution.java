package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

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
            if (Collections.max(restacks)==restacks.get(i)){
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

/*
public static void main(String[] args) {
    Map<Character, Integer> letters = new HashMap<Character, Integer>();

    ArrayList<Character> fakeArray = new ArrayList<Character>();
    fakeArray.add('a');
    fakeArray.add('a');
    fakeArray.add('a');
    fakeArray.add('b');
    fakeArray.add('b');
    fakeArray.add('c');
    fakeArray.add('c');
    fakeArray.add('c');
    fakeArray.add('w');
    fakeArray.add('w');
    fakeArray.add('w');
    fakeArray.add('w');
    fakeArray.add('g');

    for (int i = 0; i < fakeArray.size(); i++) {
      Character tempChar = fakeArray.get(i);

      if (!letters.containsKey(tempChar)) {
        letters.put(tempChar, 1);
      } else {
        letters.put(tempChar, letters.get(tempChar) + 1);
      }
    }

    for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
      System.out.println("Буква = " + entry.getKey() + ", Повторений = " + entry.getValue());
    }

*/

/*
InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        String a1 = buffer.readLine();
        FileInputStream fileInputStream = new FileInputStream(a1);
        ArrayList<Integer> stack = new ArrayList();
        ArrayList<Integer> restacks = new ArrayList();
        while (fileInputStream.available()>0){
            int r=fileInputStream.read();
            stack.add(r);

            for (int i = 0; i < stack.size(); i++) {
                System.out.println(stack.get(i));
                if (r==stack.get(i)){
//                    System.out.println("fu");
                    for (int j = 0; j < restacks.size(); j++) {
                        if (r==restacks.get(j)){
                            restacks.set(j, restacks.get(j)+1);
                        }
                    }
                    try {
                        System.out.println(restacks);
                        System.out.print(i);
                        restacks.set(i, 654);
                        System.out.println("fu");
                    } catch (IndexOutOfBoundsException e){
                        System.out.println("e");
                    }
                } else {
                    restacks.add(1);
                }
            }

            restacks.add(1);
            /*if (stack.contains(stack.get(stack.size()-1))){
                restacks.set(restacks.size()-1, restacks.get(restacks.size()-1)+1);
            }
                    for (int i = 0; i < stack.size(); i++) {
        System.out.println(stack.contains(stack.get(i)));
        if (stack.contains(stack.get(i))){
        restacks.set(i,  restacks.get(i)+1);
        }
        }
        System.out.println(restacks);
            /*
//            System.out.println(stack);//C:\Users\Sergey\Desktop\cd.txt
//            System.out.println(restacks);

        }
        ArrayList<Integer> sta = new ArrayList();
        for (int i = 0; i < restacks.size(); i++) {
            if (restacks.size()==Collections.max(restacks)){
                for (int j = 0; j < Collections.max(restacks); j++) {
                    if (j!=0) {
                        System.out.print(" "+stack.get(i));
                    } else {
                        System.out.println(stack.get(i));
                    }
                }
                break;
            }
        }
        fileInputStream.close();
//        System.out.println(Collections.max(stack));
        }
        }

//C:\Users\Sergey\Desktop\cd.txt



*/
