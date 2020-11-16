package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int id=0;
        String name=null;
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> s = new ArrayList<>();
            for (int i = 0; i < 1; ) {
                try {
                    id = Integer.parseInt(reader.readLine());
                    name = reader.readLine();
                    s.add(name);
                    hm.put(name, id);
                }
                catch (NumberFormatException e){
                    i++;
                }
            }

        for (Map.Entry<String, Integer> pair : hm.entrySet()) {
            name = pair.getKey();
            id = pair.getValue();
            System.out.println(id + " " + name);
        }
    }
}
