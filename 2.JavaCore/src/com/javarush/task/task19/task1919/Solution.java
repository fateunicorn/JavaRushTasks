package com.javarush.task.task19.task1919;

/*
Считаем зарплаты
*/

import java.io.*;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[(int)file.length()];
        while (fileReader.ready()){
            fileReader.read(chars);
        }
        fileReader.close();
        String stringForCleanOf13 = new String(chars);
        String cleanOf13String = stringForCleanOf13.replaceAll("\\p{Punct}", "");
        String[] s = cleanOf13String.split("[ \\n]");
        Map<String, Double> map = new TreeMap<>();
        for (int i = 0; i < s.length; i=i+2) {
            double d = 0;
            if (map.containsKey(s[i])){
                d = map.get(s[i]);
            }
            map.put(s[i], Double.parseDouble(s[i+1])+d);
        }
        for (int i = 0; i < map.size(); i++){
            String key = (String) map.keySet().toArray()[i];
            Double value = map.get(key);
            System.out.println(key + " " + value);
        }
    }
}

/*
public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[(int)file.length()];
        while (fileReader.ready()){
        fileReader.read(chars);
        }
        fileReader.close();
        String stringForCleanOf13 = new String(chars);
        String cleanOf13String = stringForCleanOf13.replaceAll("\\r", "");
        String[] s = cleanOf13String.split("[ \\n]");
        Map<String, Double> map = new TreeMap<>();
        for (int i = 0; i < s.length; i=i+2) {
            double d = 0;
            if (map.containsKey(s[i])){
                 d = map.get(s[i]);
            }
            map.put(s[i], Double.parseDouble(s[i+1])+d);
        }
        for (int i = 0; i < map.size(); i++){
            String key = (String) map.keySet().toArray()[i];
            Double value = map.get(key);
            System.out.println(key + " " + value);
        }
    }
}

public static void main(String[] args) throws IOException {
        BufferedReader fileReader1 = new BufferedReader(new FileReader(args[0]));
        SortedMap<String, Double> persons = new TreeMap();

        while (fileReader1.ready()){
            String[] elements = fileReader1.readLine().split(" ");
            persons.put(elements[0], persons.containsKey(elements[0]) ? persons.get(elements[0]) + Double.parseDouble(elements[1]) : Double.parseDouble(elements[1]));
        }

        for (Map.Entry<String, Double> e : persons.entrySet()) System.out.println(e.getKey() + " " + e.getValue());

        fileReader1.close();
    }
*/
