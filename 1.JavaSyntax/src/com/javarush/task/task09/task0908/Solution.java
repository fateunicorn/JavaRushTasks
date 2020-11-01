package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException a){
            System.out.println(a);
        }


        //напишите тут ваш кодNullPointerException
    }
}
