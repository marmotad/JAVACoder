package git.cncf.online.day14;

//使用别人写好的时，需要注意
public class teststring {
    public static void main(String[] args) {
        //字符串创建对象的方式  1 构造方法赋值-----------存在于堆中
//        空的字符串
        
        String str = new String();
        System.out.println(str);
//        字符串的构造方法
        String str1 = new String("fdjfkd");
        System.out.println(str1);

        char[] chs = {'2','f','c'};
//        字符数组转成字符串
        String str2 = new String(chs);
        System.out.println(str2);
        System.out.println(new String(chs,1,2));
//  byte数组转字符串
        byte[] bytes = new byte[10];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i]=(byte)(i+97);
        }
        System.out.println(new String(bytes));
//        调用的方法加了删除线 方法不推荐使用
        System.out.println(new String(bytes,2,5));
//        2 进行直接赋值=======堆中 不同于new的对象的空间   字符串常量池

        String s = "++++http:/  /abcdefa.txt+++  ";
//        调用方法 查看方法功能
//        可以获取指定索引位置上的数据
        char a = s.charAt(0);
        System.out.println(a);
//        字符串进行数据存储  数组有关系
        System.out.println(s.charAt(0));
//        获取字符串长度
        System.out.println(s.charAt(s.length()-1));
//         获取数字对应的字符的索引
//        找到了 就返回索引位置  没找到 返回-1
        System.out.println(s.indexOf(98));
        System.out.println(s.indexOf(98,2));
        System.out.println(s.indexOf("ab"));
        System.out.println(s.indexOf("b",2));
//   从后向前找
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.lastIndexOf("a",5));
        System.out.println(s.lastIndexOf(98));
        System.out.println(s.lastIndexOf(98,5));
//        找到一个字符的位置 从字符串中获取想要的数据
//        默认取到结束的位置
        System.out.println(s.substring(4));
//        不包含结束位置的值
        System.out.println(s.substring(4,6));
//        获取到文件后缀名
        System.out.println(s.substring(s.indexOf(".")+1));
//        判断文件后缀
        System.out.println(s.endsWith("txt"));
//        判断文件前缀
        System.out.println(s.startsWith("http://"));
//    转大小写的方法
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
//        字符串是不是空的
        System.out.println(s.isEmpty());
//        去掉字符串前后空白
        System.out.println(s.trim());
//        字符串转byte数组
        System.out.println(s.getBytes());
//        字符串转char数组
       System.out.println(s.toCharArray());

//        上网  敏感  不想显示  用其他字符替换
        System.out.println(s.replace('a','X'));
        System.out.println();
//        匹配规则  指定规则 拆分字符串
        String[] strs = s.split("a",2);
        for (String s1:strs
        ) {
            System.out.println(s1);
        }
        System.out.println(s.replaceAll("a","QQ"));
        System.out.println(s.replaceFirst("a","QQ"));
        System.out.println();
    }
}
