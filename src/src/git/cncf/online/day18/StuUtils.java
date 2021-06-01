package git.cncf.online.day18;

import java.util.ArrayList;

public class StuUtils {
    //用来存储学生信息的集合
    public static void intinfo(ArrayList<Student> stulist) {
        stulist.add(new Student("ZhangSan","boy",19));
        stulist.add(new Student("LiSi","girl",16));
    }
}
