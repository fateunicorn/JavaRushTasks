package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);//читающий из args создаем
        byte[] bytes = new byte[inputStream.available()];//массив размером с args создем
        inputStream.read(bytes);//что-то странное
        inputStream.close();//поток закрываем
        int counter = 0;//счетчик создаем
        for (byte a : bytes) {//который проходит по  массиву байт создаем
            if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {//проверку на символы английскаго языка создаем
                counter++;//количество в счетчике изменяем
            }
        }
        System.out.println(counter);//результат смотрим
    }
}
