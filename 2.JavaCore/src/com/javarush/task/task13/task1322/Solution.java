package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject implements Solution.SimpleObject<String> {

        @Override
        public Solution.SimpleObject<String> getInstance() {
            return null;
        }
    }
}

