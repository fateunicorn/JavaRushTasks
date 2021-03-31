package com.javarush.task.task15.task1515;

/* 
Статики-2
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int A;
    public static int B;

    static
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try {
            String A1 = buffer.readLine();
            int a = Integer.parseInt(A1);
            A=a;
            String B1 = buffer.readLine();
            int b = Integer.parseInt(B1);
            B=b;
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static final int MIN = min(A, B);

    public Solution() throws IOException {
    }

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
