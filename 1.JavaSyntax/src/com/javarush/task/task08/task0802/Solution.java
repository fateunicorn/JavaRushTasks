package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> a = new HashMap<>();
        a.put("арбуз", "ягода");
        a.put("банан", "трава");
        a.put("вишня", "ягода");
        a.put("груша", "фрукт");
        a.put("дыня", "овощ");
        a.put("ежевика", "куст");
        a.put("жень-шень", "корень");
        a.put("земляника", "ягода");
        a.put("ирис", "цветок");
        a.put("картофель", "клубень");
        for (Map.Entry<String, String> y  : a.entrySet()){
            System.out.println(y.getKey()+" - "+y.getValue());
        }
    }
}
