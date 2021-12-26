package com.whut.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 最终版本，需要掌握
*/
public class FileInputStreamTest04 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("chapter24/src/com/whut/javase/io/HelloWorld");

            byte[] bytes = new byte[8];
            int readNum = 0;
            while ((readNum = fis.read(bytes)) != -1){
                System.out.print(new String(bytes, 0, readNum));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
