package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> hiu = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String x1 = console.readLine();
            int x = Integer.parseInt(x1);
            hiu.add(x);
        }
        int fg = 0,/* m = 0,*/ ag = 0;
        for (int i = 0; i < 10; i++) {
            int j = i+1;
            for (int o = 0; o < 10-i; o++) {
                if (i==10|j==10){
                    break;
                }
                if (hiu.get(i).equals(hiu.get(j))){
                    fg++;
                }
                else {
                    break;
                }
                if (j<10){
                    j++;
                }
            }
            /*System.out.println(2000000+fg);*/
            if (fg>=ag){
                ag=fg;
            }
            fg=0;

        }

        System.out.println(ag+1);

    }
}





/*
1111
2222
2222
1111
1111
1111
4444
5555
6666
2222
*/

/*
1
2
2
1
1
1
4
5
6
2
*/