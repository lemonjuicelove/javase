package com.whut.javase.io;

import java.io.*;


public class CopyTest03 {
    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {

            FileInputStream fis = new FileInputStream("chapter24/src/com/whut/javase/io/CopyTest02.java");
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

            FileOutputStream fos = new FileOutputStream("chapter24/src/com/whut/javase/io/WriterTest03.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);

            String readFlag = null;
            while ((readFlag = br.readLine()) != null){
                bw.write(readFlag);
                bw.write('\n'); // 手动加入换行符
            }

            bw.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
