package com.javarush.task.task09.task0921;

import javax.management.ListenerNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) /*throws IOException*/ {
        readData();
    }

    public static void readData() /*throws IOException*/ {
        ArrayList<Integer> array = new ArrayList<>();
        try {
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 2000000; i++) { //цикл пока i меньше длинны массива array
                String x1 = console.readLine();
                int x = Integer.parseInt(x1);
                array.add(x);
            }
        }
        catch(NumberFormatException | ArithmeticException | IOException e){
            /*array.remove(array.size()-1);*/
            for (int i = 0; i < array.size(); i++) {
                System.out.println(array.get(i));
            }
        }
    }
}
