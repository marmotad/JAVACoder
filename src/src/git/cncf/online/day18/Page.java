package git.cncf.online.day18;

import java.util.Scanner;

public class Page {
    //欢迎界面
    public static int welcome() {

        System.out.println("*================================*");
        System.out.println("* 欢迎使用学员查询系统 *");
        System.out.println("* 1 - 查询学员 *");
        System.out.println("* 2 - 插入学员 *");
        System.out.println("* 1 - 修改学员 *");
        System.out.println("* 1 - 删除学员 *");
        System.out.println("* 0 - 退出系统 *");
        System.out.println("*================================*");

        int a;
        do {
            System.out.println("请输入正确的功能序号：");
            a = new Scanner(System.in).nextInt();
        } while (a < 0 || a > 4);
        return a;

    }
}
