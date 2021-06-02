package git.cncf.online.day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Page {
    //欢迎界面
    public static int welcome() {

        System.out.println("*================================*");
        System.out.println("* 欢迎使用学员查询系统 *");
        System.out.println("* 1 - 查询学员 *");
        System.out.println("* 2 - 插入学员 *");
        System.out.println("* 3 - 修改学员 *");
        System.out.println("* 4 - 删除学员 *");
        System.out.println("* 0 - 退出系统 *");
        System.out.println("*================================*");

        int a;
        do {
            System.out.println("请输入正确的功能序号：");
            a = new Scanner(System.in).nextInt();
        } while (a < 0 || a > 4);
        return a;

    }

    //输出指定的学生信息集合
    public static void showStudent(ArrayList<Student> stulist) {
        System.out.printf("+----------+-------+-------+\n");
        System.out.printf("+%-10s+%-7s+%-7s+\n","NAME","SEX","AGE");

        for (Student stu : stulist) {
            System.out.printf("+----------+-------+-------+\n");
            System.out.printf("+%-10s+%-7s+%-7s+\n", stu.getName(),stu.getSex(), stu.getAge());
        }
        System.out.printf("+----------+-------+-------+\n");

    }

    public static Student getAddStudent() {
        Student stu = null;
        System.out.println("请输入学生姓名：");
        String name = new  Scanner(System.in).nextLine();
        //如果输入的姓名是exit直接返回空，表示不想继续插入信息了
        if (name.equals("exit"))
            return null;
        System.out.println("请输入学生性别：");
        String sex = new Scanner(System.in).next();
        System.out.println("请输入学生年龄：");
        int age = new Scanner(System.in).nextInt();

        stu = new Student(name, sex, age);
        return stu;
    }

    //获取要删除的学生姓名
    public static String getDelStuName() {
        System.out.println("请输入要删除的学生姓名：");
        return new Scanner(System.in).nextLine();
    }

    //操作错误提升
    public static void error(String error) {
        System.out.println("操作错误原因：" + error);
    }

    //删除确认信息
    //delStu 要删除的学员
    public static String delStuAlert(Student delStu) {
        String delA = "";
        while (true){
            System.out.printf("姓名：name = %s,sex = %s, age = %d; 将被删除 (Y/N) \n", delStu.getName(), delStu.getSex(), delStu.getAge());
            delA = new Scanner(System.in).next();
            switch (delA) {
                case "y": case "Y": case "n": case "N":
                    return delA;
                default:
                    continue;
            }
        }
    }
}
