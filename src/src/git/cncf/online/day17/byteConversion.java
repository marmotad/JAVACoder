package git.cncf.online.day17;

import java.io.*;

public class byteConversion {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\test.txt");
        InputStream inputStream = new FileInputStream(file);
        //字节流转换为字符流
        InputStreamReader input = new InputStreamReader(inputStream);

        BufferedReader bufferedReader = new BufferedReader(input);

        String s = bufferedReader.readLine();

        while (s != null) {
            System.out.println(s);
            s = bufferedReader.readLine();

        }
        bufferedReader.close();
    }
}
