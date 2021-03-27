package com.javarush.task.task14.task1420;

/*
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception, MreException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try {
            String e1 = reader.readLine();
            int e= Integer.parseInt(e1);
            e1 = reader.readLine();
            int o= Integer.parseInt(e1);
            if (e>0&&o>0){
                int i;
                if (e > o) {
                    i = o;
                    o = e;
                    e = i;
                }
                i = e;
                for (; (o % i) + (e % i) != 0; i--) {
                }
                System.out.println(i);
            } else {
                throw new Exception();
            }
//        } catch (NumberFormatException e){
//            System.out.println(e);
//        }
    }
}
