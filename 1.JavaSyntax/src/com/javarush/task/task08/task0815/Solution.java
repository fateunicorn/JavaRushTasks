package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


//Перепись населения


public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Фамилия"+i, "Имя"+i);
        }
        /*map.put("SNAIL", "XXXX");
        map.put("SNAIL", "SNAI");
        map.put("SNAIL", "SNAI");*/
        /*map.put ("Иванов", "Иван");
        map.put ("Петров", "Иван");
        map.put ("Иванов", "Александр");
        map.put ("Петров", "Иван");*/
        /*String name = "Иван";
        String lastName = "Иванов";
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();*/
        /*Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + ":" + value);
        }*/
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int ere = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(name)) ere++;
        }
        return ere;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        /*int ere = 0;

        String court;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> ite = iterator.next();

            court=ite.getKey();
            for (int i = 0; i < 10; i++) {
                while (iterator.hasNext())
                {
                    Map.Entry<String, String> lawy = iterator.next();
                    if (court.equals(lawy.getKey())){
                        ere++;
                    }
                }
                ere--;
            }
        }
        return ere;*/
        if (map.containsKey(lastName)) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        /*System.out.println(getCountTheSameFirstName(createMap(), "Иван"));
        System.out.println(getCountTheSameLastName(createMap(), "Иванов"));*/
    }
}
        /*for (int i = 0; i < 10; i++) {
            for (int j = 9; j > -1; j--) {
                if (map.containsKey(i).equals(map.containsKey(j))){
                    ere++;
                }
            }
        }*/