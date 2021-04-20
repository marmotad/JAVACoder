package git.cncf.online.day17;

import java.io.*;

public class byteread {
    public static void main(String[] args) {
        File file = new File("D:\\test.txt");
        Reader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int)file.length()];
            reader.read(chars);
            System.out.println(new String(chars));
            //重点：catch可以写多个，但是必须是从上到下，从小到大捕捉
            } catch (FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
