package git.cncf.online.day14;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class testtype {
    public static void main(String[] args) {
        /*
        //基本数据类型转引用数据类型 -----> 直接转
        int i = 10;
        //new创建对象存放在堆区中
        Integer i1 = new Integer(10);
        System.out.println(i1);
        //引用数据类型转基础数据类型 -----> 直接转
        //存放在运行时常量池
        Integer i2 = 10;
        //判断是否在常量池的相同位置
        Integer i4 = 10;
        System.out.println(i2 == i4);
        //超出一个字节后（8位），常量池的地址是不同的
        Integer i5 =128;
        Integer i6 =128;
        System.out.println(i5 == i6);
        int i3 = i2;
        System.out.println(i3);
        //比较基本数据类型和引用数据类型的地址
        System.out.println(i1 == i2);
        //比较值是否相同
        System.out.println(i1.equals(i2));

        System.out.println(Integer.max(22,1));
        System.out.println(Integer.sum(20,1));
        System.out.println(Integer.min(1,90));
        //字符串转换为数字
        System.out.println(Integer.parseInt("111"));
        //字符串转换为数字
        System.out.println(Math.PI);
        //向下取整
        System.out.println(Math.floor(8.99));
        //向上取整
        System.out.println(Math.ceil(8.01));
        //四舍五入
        System.out.println(Math.round(8.5));
        System.out.println(Math.round(8.4));
        //平方根
        System.out.println(Math.sqrt(9));
        System.out.println(Math.sqrt(5));
        //平方
        System.out.println(Math.pow(2,2));
        //随机数
        System.out.println(Math.random() * 10);
        System.out.println((int)(Math.random() * 10));
        //随机数类
        Random rand = new Random();
        System.out.println(rand.nextInt(50));

        //Scanner 控制台输入
        Scanner input = new Scanner(System.in);
        //返回int数据类型
//        System.out.println(input.nextInt());
        //控制台字符串接收，遇到空白标识符结束
//        System.out.println(input.next());
        //以回车为标识，遇到回车表示结束
        System.out.println(input.nextLine());

        //构造方法参数类型必须是字符串
        BigDecimal b1 = new BigDecimal("0.11");
        BigDecimal b2 = new BigDecimal("0.56");
        //小数的加法
        System.out.println(b1.add(b2));
        System.out.println(b2.subtract(b1));
        //除法，MathContext.DEVIMALxx --->保留的小数位数
        System.out.println(b1.divide(b2, MathContext.DECIMAL32));
        System.out.println(b1.divide(b2, MathContext.DECIMAL64));
        */
        //DecimalFormat 数字格式化
        DecimalFormat df = new DecimalFormat("###,##0.00");
        System.out.println(df.format(99900.99));
    }
}
