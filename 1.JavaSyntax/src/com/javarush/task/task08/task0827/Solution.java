package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/




public class Solution {
    public static void main(String[] args) throws Exception{
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws Exception{
//        Date dd = new SimpleDateFormat("MMM d yyyy").parse(date.toLowerCase());
        Date dd = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH).parse(date);//проверял
/*                    ;       ;       ;           ;
        ;       ;   ;           ;       ;       ;       ;
        ;           ;           ;               ;       ;
        ;           ;           ;
        ;       ;           ;           ;       ;
        ;       ;           ;           ;
        ;       ;   ;           ;       ;       ;       ;
        ;           ;           ;               ;       ;
        ;           ;           ;
        ;       ;           ;           ;       ;
        ;       ;           ;           ;
        ;       ;   ;           ;       ;       ;       ;
        ;           ;           ;               ;       ;
        ;           ;           ;
        ;       ;           ;           ;       ;
        ;       ;           ;           ;
        ;       ;   ;           ;       ;       ;       ;
        ;           ;           ;               ;       ;
        ;           ;           ;
        ;       ;           ;           ;       ;
        ;       ;           ;           ;           ;   */
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dd);
//        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        if (calendar.get(Calendar.DAY_OF_YEAR)%2==0) {
            return false;
        }
        else {
            return true;
        }
    }
}
