package git.cncf.online.day16;

import java.io.File;
import java.io.IOException;

public class touchfile {
    public static void main(String[] args) {

        File file = new File("D:\\notes\\test.txt");
        //查看文件大小，单位为字节
        System.out.println(file.length());
        //获取文件名
        System.out.println(file.getName());
        //获取文件路径（获取到的是路径和文件名）
        System.out.println(file.getPath());
        //获取文件所在的目录
        System.out.println(file.getParent());
        //获取文件所在目录的字符串信息
        System.out.println(file.getParentFile());
        //获取文件绝对路径(使用字符串方法)
        System.out.println(file.getAbsolutePath());
        //获取\的位置
        System.out.println(file.getAbsolutePath().lastIndexOf("\\"));
        //获取文件绝对路径（使用file方法）
        System.out.println(file.getAbsoluteFile());

        //先判断是否是目录
        System.out.println(file.isDirectory());

        //获取目录下文件列表
        //如果输入的是一个目录遍历该目录下的文件
        //判断输入是否是一个目录

        if (file.isDirectory()) {
            //file.list 获取文件名称
            String[] strs = file.getParentFile().list();
            for (String s:strs) {
                System.out.println(s);
            }
            //如果输入的是一个文件遍历该文件所在目录下的文件
            //判断输入是否是一个文件
        } else if (file.isFile()) {
            //文件数组
            //listFiles 获取文件绝对路径
            File[] strs = file.getParentFile().listFiles();
            for (File s:strs) {
                System.out.println(s);
            }
        }
        //判断文件是否存在
        System.out.println(file.exists());
        //创建文件
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //判断是否是绝对路径
        System.out.println(file.isAbsolute());
        //判断是否是隐藏文件
        System.out.println(file.isHidden());
        //创建单个目录
        file.getAbsoluteFile().mkdir();
        //创建多层目录
        file.getAbsoluteFile().mkdirs();
        //删除文件
        //file.delete();
        //file.deleteOnExit();
        //查看文件是否可用写入
        System.out.println(file.canWrite());
        //设置是否可写
        file.setWritable(false);
        System.out.println(file.canWrite());
        file.setWritable(true);
        System.out.println(file.canWrite());
    }
}