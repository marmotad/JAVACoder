package git.cncf.online.day16;

import java.io.*;

public class RWfile {
    public static void main(String[] args) {
        File file = new File("D:\\notes\\JAVA\\1.txt");
        InputStream catfile = null;
        try {
            //1 创建通道(输入通道)
            catfile = new FileInputStream(file);
            //2 通过通道进行数据的流向 可以通过通道传输数据
            //3 创建合适的数据类型，并存储通道中数据
            byte[] bytes = new byte[(int)file.length()];
            catfile.read(bytes);
            //4 打印数组中内容
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5 关闭通道
            try {
                catfile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
