package com.javarush.task.task10.task1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Поправочки нужны
*/

public class Solution {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Solution() {
        this.map = new HashMap<Integer, String>();
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String rere = reader.readLine();
            try {
                int index = Integer.parseInt(rere);
                String name = reader.readLine();
                solution.map.put(index, name);
            }
            catch (NumberFormatException e){
                char []ch = rere.toCharArray();
                for (int j = 0; j < 10; j++) {
                    if (ch[j]==' '){
                        char chu[] = new char[j];
                        for (int k = 0; k < j; k++) {
                            chu[k]=ch[k];
                        }
                        char chi[] = new char[(ch.length+11)-j];
                        for (int k = j+1; k < ch.length; k++) {
                            chi[k]=ch[k];
                        }
                        int index = Integer.parseInt(String.valueOf(chu));
                        solution.map.put(index, String.valueOf(chi));
                        break;
                    }
                }
            }
        }

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
