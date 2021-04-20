package git.cncf.online.day17;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferWritFile {
    public static void main(String[] args) throws IOException {
        //字节缓冲流
        File file = new File("D:\\test.txt");
        BufferedOutputStream oupt = new BufferedOutputStream(new FileOutputStream(file, true));
        oupt.write("hjvfdjvdf".getBytes(StandardCharsets.UTF_8));
        oupt.close();
        //字符缓冲流
        BufferedWriter bufferWritFile = new BufferedWriter(new FileWriter(file,true));

    }
}
