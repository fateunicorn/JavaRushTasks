package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.awt.image.ImageProducer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader1 = new BufferedReader(new FileReader(args[0]));
        SortedMap<String, Double> persons = new TreeMap();

        while (fileReader1.ready()){
            String[] elements = fileReader1.readLine().split(" ");
            persons.put(elements[0], persons.containsKey(elements[0]) ? persons.get(elements[0]) + Double.parseDouble(elements[1]) : Double.parseDouble(elements[1]));
        }

        Double maxV = 0.0d;
        for (int i = 0; i < persons.size(); i++) {
            String key = (String) persons.keySet().toArray()[i];
            Double value = persons.get(key);
            if (value>maxV){maxV=value;}
        }
        for (int i = 0; i < persons.size(); i++){
            String key = (String) persons.keySet().toArray()[i];
            Double value = persons.get(key);
            if (value.equals(maxV)){
                System.out.println(key);
            }
        }

        fileReader1.close();
    }
}
