package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream fileOutputStream;
    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException{
        super(fileName);
        this.fileOutputStream=fileOutputStream;
    }
    @Override
    public void write(int b) throws IOException{
        fileOutputStream.write(b);
    }
    @Override
    public void write(byte[] b) throws IOException{
        fileOutputStream.write(b);
    }
    @Override
    public void write(byte[] b,int off,int len) throws IOException{
        fileOutputStream.write(b,off,len);
    }
    @Override
    public void close() throws IOException{
        fileOutputStream.flush();
        write("JavaRush © All rights reserved.".getBytes());
        fileOutputStream.close();
    }
    @Override
    public void flush() throws IOException{
        fileOutputStream.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
/*
public static String fileName="C:/tmp/result.txt";
	FileOutputStream fileOutputStream;
	public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException{
		super(fileName);
		this.fileOutputStream=fileOutputStream;
	}
	@Override
	public void write(int b) throws IOException{
		fileOutputStream.write(b);
	}
	@Override
	public void write(byte[] b) throws IOException{
		fileOutputStream.write(b);
	}
	@Override
	public void write(byte[] b,int off,int len) throws IOException{
		fileOutputStream.write(b,off,len);
	}
	@Override
	public void close() throws IOException{
		fileOutputStream.flush();
		write("JavaRush © All rights reserved.".getBytes());
		fileOutputStream.close();
	}
	@Override
	public void flush() throws IOException{
		fileOutputStream.flush();
	}
	public static void main(String[] args) throws FileNotFoundException{
		new AmigoOutputStream(new FileOutputStream(fileName));
	}

*/
