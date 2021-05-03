/*
package com.javarush.task.task18.task1812;

*/
/*
Расширяем AmigoOutputStream
*//*


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream {
    private static AmigoOutputStream amigoOutputStream;

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.amigoOutputStream = amigoOutputStream;
    }

    */
/*public QuestionFileOutputStream() {
//        AmigoOutputStream amigoOutputStream = null;

    amigoOutputStream = new AmigoOutputStream() {
        @Override
        public void flush() throws IOException {

        }

        @Override
        public void write(int b) throws IOException {

        }

        @Override
        public void write(byte[] b) throws IOException {

        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {

        }

        @Override
        public void close() throws IOException {

        }
    };
    }*//*



    @Override
    public void flush() throws IOException {
        amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigoOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        String a1 = buffer.readLine();
        if (a1.equals("Д")){
            buffer.close();
            inputStreamReader.close();
            System.in.close();
            amigoOutputStream.close();
        }
    }
}

*/
