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
                Page.showStudent(stulist);
                System.out.println("查询");
                break;
            case 2: // 插入
                //通过学员插入界面，获取一个学生对象
                //将学生对象插入到集合
                //一次插入一个还是多个
                //Student stu = Page.getAddStudent();
                //stu要么是要插入的对象，要么为空，表示不继续插入了
                while (addStu(Page.getAddStudent(), stulist));
                break;
                //System.out.println("插入");
            case 3: // 修改
                System.out.println("修改");
                break;
            case 4: // 删除
                //通过删除界面获取要删除的学生姓名
                String name = Page.getDelStuName();
                //调用删除方法，获取刚刚被删除的学员信息
                Student delStu = delByStuName(name, stulist);
                if (delStu != null) {
                    //确认删除信息,获取y/n，y表示删除，n表示不删除
                    String delA = Page.delStuAlert(delStu);
                    //String delA = Page.delStuAlert(delStu);
                    //如果输入为y，什么都不做，如果是n，再将刚刚删除的信息插入回去
                    if (delA.equals("N") || delA.equals("n"))
                        stulist.add(delStu);
                } else {
                    Page.error("要删除的用户不存在");
                }
                break;
            case 0: // 退出
                System.out.println("欢迎再次使用！！");
                System.exit(0);
                break;

        }
    }

    //通过学生姓名删除成员
    //name 要删除的学员姓名
    //stuList 学员集合
    //return 删除成功，返回被删除的学员对象，删除失败返回nill
    private static Student delByStuName(String name, ArrayList<Student> stulist) {
        for ( int i = 0 ; i < stulist.size(); i++) {
            if (name.equals(stulist.get(i).getName()))
                return stulist.remove(i);
        }
        return null;
    }

    //插入学员信息
    //stu要插入的学员信息
    //stuList 学员信息存储的集合
    //true 表示继续插入，false表示停止插入
    private static boolean addStu(Student stu, ArrayList<Student> stuList) {
        if (stu == null)
            return false;
        return stuList.add(stu);
    }

}
