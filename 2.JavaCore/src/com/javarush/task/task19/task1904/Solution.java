package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
/*
        String name = "Иванов Иван Иванович 13 09 1993";

        PersonScannerAdapter adapter = new PersonScannerAdapter(new Scanner(name));

        System.out.println(adapter.read());*/
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

//        File file = fileScanner; //ctrl+alt+k

        @Override
        public Person read() throws IOException {
            Date date = null;
            //String s = scanner.nextLine();
            ;
            String a1 = fileScanner.nextLine();
            /*PersonScanner personScanner = null;
            assert personScanner != null;
            personScanner.read();*/
            String[] s = a1.split(" ");
            String strDate = String.format("%s %s %s", s[3], s[4], s[5]);
            SimpleDateFormat ft = new SimpleDateFormat ("dd MM yyyy");
            try {
                date = ft.parse(strDate);
            } catch (ParseException e) {
                System.out.println("F:KF:KFK:");
            }
            return new Person(s[1], s[2], s[0], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}

/*
И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
В классе адаптере создать приватное финальное поле Scanner fileScanner. Поле инициализировать в конструкторе с одним аргументом типа Scanner.

Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950
Петров Петр Петрович 31 12 1957

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные только одного человека.


Требования:
1. PersonScanner должен быть интерфейсом.
2. Класс PersonScannerAdapter должен реализовывать интерфейс PersonScanner.
3. Класс PersonScannerAdapter должен содержать приватное поле fileScanner типа Scanner.
4. Класс PersonScannerAdapter должен содержать конструктор с параметром Scanner.
5. Метод close() класса PersonScannerAdapter должен делегировать полномочие такому же методу fileScanner.
6. Метод read() класса PersonScannerAdapter должен читать строку с файла, парсить её, и возвращать данные только одного человека, в виде объекта класса Person.
*/
