package git.cncf.online.day16;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        //写入文件
        File wrirt = new File("D:\\test.txt");
        OutputStream out = null;
        try {
            //会覆盖原文件内容，默认append是false，不会在文件中追加内容
            out = new FileOutputStream(wrirt);
            out.write("aaa".getBytes());
            //追加文件内容
            out = new FileOutputStream(wrirt,true);
            out.write("aaa".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //文件复制
        //指定复制后的文件
        File copy = new File("D:\\copytest.txt");
        //定义变量input，用于从指定文件中读取数据
        InputStream input = null;
        try {
        //指定文件中读取数据
        input = new FileInputStream(wrirt);
        //指定每次读取文件的长度
        byte[] bytes = new byte[1024];
        //定义变量a记录读取文件次数
        int a = input.read(bytes);
        //将读取到的文件写入copy变量指定的文件
        out = new FileOutputStream(copy,true);
        //判断文件数据是否读取完
        while (a != -1) {
            //写入从数组开始位置到结束位置大小的数据
            out.write(bytes,0,a);
            a = input.read(bytes);
        }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
