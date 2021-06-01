package git.cncf.online.day18;

import java.util.ArrayList;

public class ArraylistTest {
    public static void main(String[] args) {
        //通过ArrayList 实现类实例化一个对象，获取了一个空集合
        ArrayList<String>  list = new ArrayList<>();

        //向集合添加元素
        list.add("sss");
        list.add("bbb");
        //打印集合中内容
        System.out.println(list);
        //第一个参数是索引，集合的索引和数组也是从0开始
        list.add(1,"ccc");
        System.out.println(list);
        //使用索引进行插入时，索引的最大取值范围不超过集合元素的个数
        list.add(3,"ddd");
        //删除指定内容的索引，并返回true/false
        System.out.println(list.remove("sss"));
        System.out.println(list.remove("sss"));
        System.out.println(list);
        //修改指定索引内容并返回修改前的内容
        System.out.println(list.set(0,"aaa"));
        System.out.println(list);
        //集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //增强for遍历
        for (String name : list) {
            System.out.println(name);
        }
    }
}
