package com.javarush.task.task14.task1419;

public class MyException extends Exception {
    public MyException(String s) {
        System.out.println(s);
    }
}
