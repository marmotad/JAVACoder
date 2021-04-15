package git.cncf.online.day16;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("D:\\notes\\JAVA\\JAVA算法.md");
        InputStream catfile = null;
        /*
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
         */
        try {
            //1 创建通道(输入通道)
            catfile = new FileInputStream(file);
            //2 通过通道进行数据的流向 可以通过通道传输数据
            //3 创建合适的数据类型，并存储通道中数据
            byte[] bytes = new byte[1024];
            //创建变量用于存储上次读取到的位置
            int a = catfile.read(bytes);
            //如果最后存储位置有数据执行以下while循环
            while (a != -1){
                //打印bytes数组中，从开始到结束的数据（0：数组开始位置，a：数组结束吧位置）
                System.out.println(new String(bytes,0,a));
                //从通道中读取新的数据
                a = catfile.read(bytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
