package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        PrintStream dfltSystemOut = System.out;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bufferedReader.readLine();
//        String a2 = bufferedReader.readLine();
//        a1 = "C:\\Users\\Sergey\\Desktop\\cd1.txt"; //del
//        a2 = "C:\\Users\\Sergey\\Desktop\\cd2.txt"; //del
        bufferedReader.close();
        /*FileReader fileReader = new FileReader(a1);
        BufferedReader bufferFileReader = new BufferedReader(fileReader);
        BufferedWriter bufferFileWriter = new BufferedWriter(new FileWriter(a2));
//        String fileStringCompilation = "";
        String sReadLineFromBuRe;
        while ((sReadLineFromBuRe = bufferFileReader.readLine()) != null){
            sReadLineFromBuRe = sReadLineFromBuRe.replace('.', '!');
            bufferFileWriter.write(sReadLineFromBuRe);
        }
        fileReader.close();
        bufferFileReader.close();
        bufferFileWriter.close();*/
        FileOutputStream fileOutputStream = new FileOutputStream(a1);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String s = byteArrayOutputStream.toString();
//        PrintStream printStreamDou = new PrintStream(a1, dfltSystemOut.toString());
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        System.setOut(dfltSystemOut);
        System.out.println(s);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String a1 = bufferedReader.readLine();
        String a2 = bufferedReader.readLine();
//        a1 = "C:\\Users\\Sergey\\Desktop\\cd1.txt"; //del
        a2 = "C:\\Users\\Sergey\\Desktop\\cd2.txt"; //del
        bufferedReader.close();
//        BufferedWriter bufferFileWriter = new BufferedWriter(new FileWriter(a2));

        PrintStream outToConsole = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String s = byteArrayOutputStream.toString();
//        PrintStream printStream1 = new PrintStream(String.valueOf(bufferFileWriter));
        PrintStream printStream1 = new PrintStream(a2);
//        PrintStream dualStream = new DualStream(printStream, printStream1);
        System.setOut(printStream1);
        System.out.println(s);

//        s = s.replaceAll("[^\\d]", "");

        System.setOut(outToConsole);
        System.out.println(s);
    }*/
        /*public static class DualStream extends PrintStream {

        PrintStream out;

        public DualStream(PrintStream out1, PrintStream out2) {
            super(out1);
            this.out = out2;
        }

        public void write(byte buf[], int off, int len) {
            try {
                super.write(buf, off, len);
                out.write(buf, off, len);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void flush() {
            super.flush();
            out.flush();
        }
    }*/