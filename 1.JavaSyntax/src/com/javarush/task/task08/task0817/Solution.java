package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();
        map.put("aaa", "sss");
        map.put("ddd", "sss");
        map.put("wef", "wef");
        map.put("few", "wef");
        for (int i = 0; i < 6; i++) {
            map.put("k"+i, "v"+i);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        Map<String, String> map2 = new HashMap<>();
        Map<String, String> map3;
        Iterator<Map.Entry<String, String>> iterator3;
        Map.Entry<String, String> itera;
        while (iterator.hasNext()) {
            map3 = new HashMap<>(map);
            iterator3 = map3.entrySet().iterator();
            itera = iterator.next();

            String ke = itera.getKey();
            String va = itera.getValue();

            while (iterator3.hasNext()) {
                Map.Entry<String, String> itera3 = iterator3.next();
                String ke3 = itera3.getKey();
                String va3 = itera3.getValue();
                if (!ke.equals(ke3) && va.equals(va3)) {
                    map2.putIfAbsent(ke, va);
                    map2.putIfAbsent(ke3, va3);
                }
            }
        }
//        System.out.println("2" + map2.toString());
        Iterator<Map.Entry<String, String>> iterat = map2.entrySet().iterator();
        while (iterat.hasNext()) {
            removeItemFromMapByValue(map, iterat.next().getValue());
        }
//            System.out.println(map.toString());
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}

/*public class Solution {

    public static Map<String, String> createMap() {
    Map<String,String> map = new HashMap<>();
    map.put("aaa", "sss");
    map.put("ddd", "sss");
    map.put("wef", "wef");
    map.put("few", "wef");
        for (int i = 0; i < 6; i++) {
            map.put("k"+i, "v"+i);
        }
        return map;
    }

    private static String value;
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            value = iterator.next().getValue();
            removeItemFromMapByValue(map, value);
        }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }

Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(value)) {
                iterator.remove();
            }
        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(value)) {
                copy.put(pair.getKey(), pair.getValue());
            }
        }
        Iterator<Map.Entry<String, String>> iterat = map.entrySet().iterator();
        while (iterat.hasNext()) {
            Map.Entry<String, String> pai = iterat.next();
            map.remove(pai.getKey(), pai.getValue());
        }
    }

    public static void main(String[] args) {

        removeTheFirstNameDuplicates(createMap());
    }

    Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        Map<String, String> map2 = new HashMap<>(map);
        while (iterator.hasNext()){
            String ke = iterator.next().getKey();
            String va = iterator.next().getValue();
            Iterator<Map.Entry<String, String>> iterato = map.entrySet().iterator();
            while (iterato.hasNext()){
                Map.Entry<String, String> iter = iterato.next();
                if (!ke.equals(iter.getKey())&&va.equals(iter.getValue())){
                    map2.put(ke, va);
                }
            }

//            map2.put(ke, va);
        }
}*/