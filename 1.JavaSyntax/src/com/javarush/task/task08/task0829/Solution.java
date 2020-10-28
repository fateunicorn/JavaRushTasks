package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> li = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            li.add(family);
        }

        // Read the house number

        String x1 = reader.readLine();
        for (int i = 0; i < li.size(); i++) {
            if (li.get(i).equals(x1)){
                System.out.println(li.get(i+1));
            }
        }
    }
}
