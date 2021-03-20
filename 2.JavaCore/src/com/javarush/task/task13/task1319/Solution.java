/*
package com.javarush.task.task13.task1319;

*/
/*
Писатель в файл с консоли
*//*


import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String e = buffer.readLine();
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(e));

        while (true==true) {
            String s = buffer.readLine();
            fileWriter.write(s+"\n");
            if (s.equals("exit")){
                break;
            }
        }
        buffer.close();
        fileWriter.close();
    }
}








//C:\Users\Sergey\Desktop\otsd.txt*/
