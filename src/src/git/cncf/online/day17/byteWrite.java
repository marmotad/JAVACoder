package git.cncf.online.day17;

import java.io.*;

public class byteWrite {
        public static void main(String[] args) {
            File file = new File("D:\\test.txt");
            Writer writer = null;
            try {
                writer = new FileWriter(file, true);
                char[] chars = new char[(int) file.length()];
                writer.write("fsdfsd但是");
                //重点：catch可以写多个，但是必须是从上到下，从小到大捕捉
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
}