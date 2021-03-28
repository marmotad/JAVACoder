package git.cncf.online.day14;

//使用别人写好的时，需要注意
public class teststring {
    public static void main(String[] args) {
        //String在java.long包下，调用java.long下的包不需要导包
        String str = new String();
        System.out.println(str);
        String str1 = new String("2222");
        System.out.println(str1);
        //数组转换为字符串
        char[] chs = {'1', 'f', 'c'};
        String str2 = new String(chs);
        System.out.println(str2);
        System.out.println(new String(chs, 1,2));
        //
        String s = "abcdefg";

    }
}
