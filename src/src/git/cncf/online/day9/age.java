package git.cncf.online.day9;

public class age {
    private int age ;
    public void setA(int this.age){
        if (this.age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }
    //在类中获取值,并返回
    public int getA() {
           return age;
    }
    public void print() {
        System.out.println("年龄" + age);
    }
    //打印对象时，默认调用
    public String toString() {
        return "年龄" + age;
    }

}