package com.javarush.task.task14.task1419;




import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) throws MyException {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() throws MyException{   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
            try {
                int j[] = {1, 2, 2, 3, 2, 4};
                j[9] = 60;
            } catch (Exception MyException){

            }
            int i = 1;
            if (i==1) {
                exceptions.add(new MyException("String can not be empty!"));
            }
            if (i==1) {
                exceptions.add(new ErfException("String can not be empty!"));
            }
            if (i==1) {
                exceptions.add(new ErException("String can not be empty!"));
            }
            if (i==1) {
                exceptions.add(new ErsdfException("String can not be empty!"));
            }
            if (i==1) {
                exceptions.add(new ErdfgfException("String can not be empty!"));
            }
            if (i==1) {
                exceptions.add(new ErfshhException("String can not be empty!"));
            }
            if (i==1) {
                exceptions.add(new ErflodlodlodException("String can not be empty!"));
            }
            if (i==1) {
                exceptions.add(new ErflodlsssssssssssssssodlodException("String can not be empty!"));
            }
            if (i==1) {
                exceptions.add(new ErflodlodfffffffffffffflodException("String can not be empty!"));
            }

        }
    }
}
