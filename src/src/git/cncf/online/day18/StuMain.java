package git.cncf.online.day18;

import java.util.ArrayList;

public class StuMain {
    public static void main(String[] args) {
        //学生信息存储位置
        ArrayList<Student> stulist = new ArrayList<>();
        //初始化学生的测试信息
        StuUtils.intinfo(stulist);
        //输出欢迎界面，通过欢迎界面获取用户操作意图
        while (true) {
            int a = Page.welcome();
            funAction(a, stulist);
        }
    }
    //用户操作意图
    //操作的学生集合
    private static void funAction(int a, ArrayList<Student> stulist) {
        switch (a) {
            case 1: //查询
                System.out.println("查询");
                break;
            case 2: // 插入
                System.out.println("插入");
                break;
            case 3: // 修改
                System.out.println("修改");
                break;
            case 4: // 删除
                System.out.println("删除");;
                break;
            case 0: // 退出
                System.out.println("欢迎再次使用！！");
                System.exit(0);
                break;

        }
    }
}
