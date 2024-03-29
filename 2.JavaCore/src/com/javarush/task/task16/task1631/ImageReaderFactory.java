package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory{

    public static ImageReader getImageReader(ImageTypes iti){
        try {
            if (iti==(ImageTypes.BMP)) {
                return new BmpReader();
            } else if (iti==(ImageTypes.JPG)) {
                return new JpgReader();
            } else if (iti==(ImageTypes.PNG)) {
                return new PngReader();
            } else throw new IllegalArgumentException();
        } catch (Exception e){
            throw new IllegalArgumentException();
        }
    }
}
