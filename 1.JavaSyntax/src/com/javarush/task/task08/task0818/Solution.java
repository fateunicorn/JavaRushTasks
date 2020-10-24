package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put(""+i, 400);
        }
        for (int i = 0; i < 5; i++) {
            map.put("S"+i, 1400);
        }
        return     map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        map.entrySet().removeIf(pair -> pair.getValue()<500);
        /*System.out.println(map);*/
    }

    public static void main(String[] args) {
//        removeItemFromMap(createMap());
    }
}