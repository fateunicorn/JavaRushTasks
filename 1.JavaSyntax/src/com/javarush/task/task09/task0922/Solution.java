package com.javarush.task.task09.task0922;

import jdk.nashorn.internal.objects.NativeDate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.*;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        ArrayList<Character> chan = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            chan.add(string.charAt(i));
        }
        ArrayList<Character> hug = new ArrayList<>();
        for (int i = 0; i < chan.size(); i++) {
            if (!chan.get(i).equals('-')){ //видимо гдето тут
                hug.add(chan.get(i).toString().charAt(0));
            }
            else {
                hug.add(' ');
            }
//            2000-12-12
        }
        StringBuilder builder = new StringBuilder(hug.size());
        for(Character ch: hug)
        {
            builder.append(ch);
        }
        String fff = builder.toString();
        SimpleDateFormat dvarf = new SimpleDateFormat("y MM dd", Locale.ENGLISH);
        Date date = dvarf.parse(fff);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String stringer = null;
        try {
            cal.add(Calendar.MONTH, +1);
            date = cal.getTime();
            stringer = Month.of(date.getMonth()).getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        }
        catch (DateTimeException e){
            cal.add(Calendar.YEAR, -1);
            stringer = "DEC";
        }
        ArrayList<Character> cha = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cha.add(stringer.toUpperCase().charAt(i));
            System.out.print(cha.get(i));
        }
        System.out.print(" "+date.getDate()+", "+cal.get(Calendar.YEAR));
    }
}

