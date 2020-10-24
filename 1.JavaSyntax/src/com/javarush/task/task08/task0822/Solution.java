package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String x1 = console.readLine();
        int N = Integer.parseInt(x1);
        List<Integer> array = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            String vv = console.readLine();
            int v = Integer.parseInt(vv);
            array.add(v);
        }
        return array;
    }
}
