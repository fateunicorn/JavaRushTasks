package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String a1 = buffer.readLine();
        if (a1.equals("helicopter")){
            result=new Helicopter();
        }
        if (a1.equals("plane")){
            String a2 = buffer.readLine();
            int a = Integer.parseInt(a2);
            result=new Plane(a);
        }
        buffer.close();
    }
}
