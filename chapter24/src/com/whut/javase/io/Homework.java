package com.whut.javase.io;

import java.io.*;

/*
* 拷贝目录：
*   将一个目录拷贝到另一个盘下
*
* 提示：需要使用到：FileInputStream  FileOutputStream  File
*                还可能用到递归
*/
public class Homework {
    public static void main(String[] args) throws IOException {

        // 拷贝源
        File file1 = new File("C:\\Users\\73561\\Desktop\\python学习");
        // 拷贝目标
        File file2 = new File("C:\\Users\\73561\\Desktop\\现代控制理论作业\\python学习");
        // 如果拷贝目标不存在的话，创建出来
        if (!file2.exists()){
            file2.mkdir();
        }

        // 得到一个包括目录下所有文件的File数组
        File[] files = file1.listFiles();
        /*for(File file : files){
            System.out.println(file.getName());
        }*/

        FindFile.find(files);
        // 将下面代码拿出去写成一个新的工具类
        /*for (File f : files){
            if (f.isDirectory()){
                // 是目录的话需要继续往下直到查找
                System.out.println(f.getName() + "是一个目录");
            }
            if (f.isFile()){
                // 是文件的话可以直接copy过去
                System.out.println(f.getName() + "是一个文件");
                CopyHelp.copy(f);
            }
        }*/

    }
}

// 边读边写的工具类
class CopyHelp{
    public static void copy(File file) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 里面参数可以是文件的路径名，也可以是文件本身(看源码知道是有不同的构造方法)
            // fis = new FileInputStream(file.getAbsolutePath() + "");
            fis = new FileInputStream(file);
            // 同样通过获取绝对路径的方式来创建字节输出流对象
            // fos只能创建文件，不能连带着目录一起创建，所以会报错：java.io.FileNotFoundException
            fos = new FileOutputStream((file.getAbsoluteFile()+"").replace("C:\\Users\\73561\\Desktop", "C:\\Users\\73561\\Desktop\\现代控制理论作业"), true);
            // 开始边读边写
            byte[] bytes = new byte[1024*1024];
            int readNum = 0;
            while ((readNum = fis.read(bytes)) != -1){
                fos.write(bytes, 0, readNum);
            }
            // 刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
// 查找是文件还是目录的工具类
class FindFile{
    public static void find(File[] file) throws IOException {

        for (File f : file){
            if (f.isDirectory()){
                // 是目录的话需要继续往下直到查找
                // System.out.println(f.getName() + "是一个目录");
                File[] files = f.listFiles();
                // 是目录的话还要在拷贝过去的地方创建一个新的目录
                // File f1 = new File("C:\\Users\\73561\\Desktop\\现代控制理论作业\\python学习\\"+f.getName()); // 这样创建目录有问题，不够全面
                // 通过获取绝对路径，然后经过字符串的替换，
                File f1 = new File((f.getAbsoluteFile()+"").replace("C:\\Users\\73561\\Desktop", "C:\\Users\\73561\\Desktop\\现代控制理论作业"));
                if (!f1.exists()){
                    f1.mkdir();
                }
                // 递归继续往下查找
                find(files);
            }
            if (f.isFile()){
                // 是文件的话可以直接copy过去
                // System.out.println(f.getName() + "是一个文件");
                CopyHelp.copy(f);
            }
        }

    }
}
