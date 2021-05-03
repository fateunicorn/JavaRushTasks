package com.javarush.task.task18.task1814;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : fileName.toCharArray()) {
            chars.add(c);
        }
        if (chars.get(chars.size()-1)=='t'&&chars.get(chars.size()-2)=='x'&&chars.get(chars.size()-3)=='t'&&chars.get(chars.size()-4)=='.'){

        } else {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public TxtInputStream(File file) throws FileNotFoundException {
        super(file);
    }

    public TxtInputStream(FileDescriptor fdObj) {
        super(fdObj);
    }

    public static void main(String[] args){
    }
}

