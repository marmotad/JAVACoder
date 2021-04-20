package git.cncf.online.day17;

import java.io.*;

public class BufferReadFile {
    public static void main(String[] args) throws IOException {
        //缓存流
        //字节流读缓冲流
        File file = new File("D:\\test.txt");
        BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(file));
        byte[] bytes = new byte[(int) file.length()];
        buffer.read(bytes);
        System.out.println(new String(bytes));
        buffer.close();
        System.out.println("----------------------");
        //字符流读缓冲流
        File files = new File("D:\\test.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(files));
        char[] chars = new char[(int) file.length()];
        bufferedReader.read(chars);
        System.out.println(new String(chars));
        bufferedReader.close();
    }
}
