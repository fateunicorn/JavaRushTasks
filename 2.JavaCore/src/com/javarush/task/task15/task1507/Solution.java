package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
        System.out.println("1");
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
        System.out.println("2");
    }

    public static void printMatrix(int m, int n) {
        System.out.println("3");
        System.out.println("Заполняем объектами String");
    }

    public static void printMatrix(int m, String value) {
        System.out.println("Заполняем объектами String");
        System.out.println("4");
    }

    public static void printMatrix(int m, Object value) {
        System.out.println("5");
        System.out.println("Заполняем объектами String");
    }
    public static void printMatrix(int m, String value, int n) {
        System.out.println("Заполняем объектами String");
        System.out.println("6");
    }

    public static void printMatrix(int m, Object value, int n) {
        System.out.println("7");
        System.out.println("Заполняем объектами String");
    }

    public static void printMatrix(String value, int n) {
        System.out.println("Заполняем объектами String");
        System.out.println("8");
    }

    public static void printMatrix(Object value, int n) {
        System.out.println("9");
        System.out.println("Заполняем объектами String");
    }

    public static void printMatrix(Object value, int n, int m) {
        System.out.println("10");
        System.out.println("Заполняем объектами String");
    }
}
