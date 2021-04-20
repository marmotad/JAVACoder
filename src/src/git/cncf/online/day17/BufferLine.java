package git.cncf.online.day17;

import java.io.*;

public class BufferLine {
    public static void main(String[] args) throws IOException {
        //字符流读缓冲流(按行读)
        File readFile = new File("D:\\test.txt");
        File writeFile = new File("D:\\test1.txt");
        BufferedReader bufferedreader = new BufferedReader(new FileReader(readFile));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writeFile));
        String s = bufferedreader.readLine();
        while (s != null) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            s = bufferedreader.readLine();
        }
        bufferedreader.close();
        bufferedWriter.close();
    }
}