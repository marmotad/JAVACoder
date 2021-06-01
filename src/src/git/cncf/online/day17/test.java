package git.cncf.online.day17;

import java.io.*;

public class test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

    File file = new File("D:\\test.txt");

    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
    cat cat = new cat();
    cat.setAge(3);
    cat.setName("tomcat");
    objectOutputStream.writeObject(cat);
    objectOutputStream.close();

    ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream(file));
    //标记接口
    Object object = objectInputStream.readObject();
    if (object instanceof cat) {
        cat cat1 = (cat) object;
        System.out.println(cat1);
    }
    }
}
