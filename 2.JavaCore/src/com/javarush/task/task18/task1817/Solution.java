package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);//читающий из args создаем
        byte[] bytes = new byte[inputStream.available()];//массив размером с args создем
        inputStream.read(bytes);//чтение в массив производим
        inputStream.close();//поток закрываем
        int cou = 0;//счетчик создаем
        int cou2 = 0;//счетчик 2-ой создаем
        for (byte a : bytes) {//который проходит по  массиву байт создаем
            cou2++;
            if (a == ' ') {//проверку на символ-пробел создаем
                cou++;//количество в счетчике изменяем
            }
        }
        /*cou=9;
        cou2=17;*/
        float psv = (float)cou/(float)cou2*100.00f;
        psv = Math.round(psv*100f)/100f;
        System.out.println(psv);
    }
}
