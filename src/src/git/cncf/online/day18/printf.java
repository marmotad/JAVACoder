package git.cncf.online.day18;

public class printf {
    public static void main(String[] args) {
        System.out.printf("整数类型：%d\n",1314);
        System.out.printf("浮点类型：%f\n",13.4);
        System.out.printf("String类型：%s\n","ss");
        System.out.printf("boolean类型：%b\n",true);
        System.out.printf("八进制类型：%o\n",37);
        System.out.printf("十六进制类型：%x\n",37);
        //占用指定长度字符
        System.out.printf("***%5s***\n","Java");
        System.out.printf("***%-5s***\n","Java");
    }
}
