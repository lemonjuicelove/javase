package com.whut.javase.io;

/*
 * 拷贝目录：
 *   将一个目录拷贝到另一个盘下
 *
 * 提示：需要使用到：FileInputStream  FileOutputStream  File
 *                还可能用到递归
 */

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {

        File f1 = new File("C:\\Users\\73561\\Desktop\\FileCopy");

        File[] files = f1.listFiles();
        for (File file : files){
            // System.out.println(file.getName());
            FileOrDirectory(file);
        }

    }

    public static void FileOrDirectory(File file){

        if (file.isDirectory()){
            // 是个目录，先创建出新的目录，然后继续往下找
            File fileCopy = new File(file.getAbsolutePath().replace("C:\\Users\\73561\\Desktop\\FileCopy","C:\\Users\\73561\\Desktop\\CopyFile"));
            fileCopy.mkdir();
            File[] files = file.listFiles();
            for (File file1 : files){
                FileOrDirectory(file1);
            }
        }
        if (file.isFile()){
            // 是一个文件，就可以读了
            Copy(file);
        }

    }

    public static void Copy(File file){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file.getAbsolutePath());
            fos = new FileOutputStream(file.getAbsolutePath().replace("C:\\Users\\73561\\Desktop\\FileCopy","C:\\Users\\73561\\Desktop\\CopyFile"));
            byte[] bytes = new byte[1024 * 1024];
            int readNum;
            while((readNum = fis.read(bytes)) != -1){
                fos.write(bytes,0,readNum);
            }
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

