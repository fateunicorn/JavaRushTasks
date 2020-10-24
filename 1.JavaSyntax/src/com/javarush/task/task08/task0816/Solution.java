package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Добрая Зинаида и летние каникулы
Jun, Jul, Aug
*/


public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлонерс", dateFormat.parse("MAY 1 2012"));
        for (int i = 0; i < 8; i++) {
            map.put("Сталлонерс"+i, dateFormat.parse("JUN 1 2012"));
        }
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator itr = map.entrySet ().iterator();

        Date dt;
        while (itr.hasNext()) {
            Map.Entry pair = (Map.Entry) itr.next();
            dt = (Date) pair.getValue();
            if (dt.getMonth()>=5 && dt.getMonth()<=7)
                itr.remove();
        }

        String key;
        for(Map.Entry entry: map.entrySet()) {
            key = entry.getKey().toString();
            dt = (Date) entry.getValue();
        }


        return;
    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());
    }
}
