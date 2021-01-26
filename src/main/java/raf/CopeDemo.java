package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *复制原理：从原文件中
 */
public class CopeDemo {
    public static void main(String[] args) throws IOException {
        /*
            复制原理：从原文件顺序读取每个字节并写入到另一个文件中
         */
        RandomAccessFile src = new RandomAccessFile("null.png","r");
        RandomAccessFile desc = new RandomAccessFile("null_cn.png","rw");
        /*

         */
        //用来记录每次读取到的字节
        int d;
        //获取当前系统时间的毫秒值
        long strart = System.currentTimeMillis();
        while((d = src.read())!=-1){
            desc.write(d);
        }
        System.out.println("复制完毕");
        src.close();
        desc.close();
    }
}
