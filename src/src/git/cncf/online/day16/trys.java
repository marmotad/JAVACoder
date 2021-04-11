package git.cncf.online.day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class trys {
    public static int a(int num) {
        try {
            int s = 10 / num;
            System.out.println(s);
            return 200;
        } catch (ArithmeticException e) {
            System.out.println("err");
            return 500;
            //当有返回值时，返回值是finally中的，因为finally是最后执行的
        } finally {
            return 400;
        }
    }

    public static void main (String[]args){
       String setdate = "2021-02-11 18:00:01.000";
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
       //相当于在编译是进行代码检查,调用代码检查这个方法可能会出错
       //可能因为参数和格式不统一出现错误
       //解决代码提示报错的方式
       //try {可能异常的代码},若发生异常
       try {
           Date date = sdf.parse(setdate);
           System.out.println(date);
           //catch 若try中的代码发生异常，虚拟机会产生一个异常对象，在catch中捕获
           //catch (数据类型 变量名)
           //catch中的代码会在异常发生后执行
       } catch (ParseException e) {
           //exception异常
           //打印异常轨迹 可以根据异常轨迹进行错误代码查找
           e.printStackTrace();
           System.out.println("error");
           //finally中的代码无论是否异常都会执行
           //可以用来关闭统一资源
       } finally {
           System.out.println("finally");
       }

        System.out.println(a(1));
    }
}