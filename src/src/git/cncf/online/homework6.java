package git.cncf.online;

import java.util.Arrays;

public class homework6 {
    public static void main(String[] args) {

        byte even = 0;
        byte odd = 0;
        for (byte i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                even++;
            } else if (i % 2 == 1) {
                odd++;
            }
        }
        System.out.println("奇数：" + odd + ";偶数：" + even);
        //统计1-100范围内奇数的个数和偶数的个数

        short factorial = 1;
        for (short i = 1; i <= 5; i++) {
            factorial = (short) (i * factorial);
        }
        System.out.println(factorial);
        //计算5的阶乘


        for (short i = 100; i <= 999; i++) {
            short a = (short) (i / 100);
            short b = (short) (i % 100 / 10);
            short c = (short) (i % 100 % 10);
            short outnum = (short) ((a * a * a) + (b * b * b) + (c * c * c));
            if (outnum == i) {
                System.out.println(i);
            }
        }
        //计算所有三位数中的水仙花数，并统计个数

        for (byte i = 1; i <= 9; i++) {
            System.out.println("\t");
            for (byte j = 1; j <= 9; j++) {
                if (j > i) {
                    // System.out.println("\t");
                    continue;
                }
                System.out.print(j + " * " + i + " = " + j * i);
                System.out.print("\t");
            }
        }
        //打印99乘法表


        System.out.println();
        //打印空行和上面代码做区分

        for(int i=1;i<=5;i++){
            //参考地址  https://www.runoob.com/w3cnote/java-print-the-triangle.html
            //控制打印的行数
            for(int j=5; i<=j; j--)
                System.out.print("#");
            for(int j=1; j<=i; j++)
                System.out.print("*");
            for(int j=1; j<i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}