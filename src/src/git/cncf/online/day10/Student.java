package git.cncf.online.day10;

public class Student extends publicClass {
    private byte score;
    private short num;

    public byte getScore() {
        return score;
    }

    public short getNum() {
        return num;
    }


    public void setScore(byte score) {
        if (score > 0) {
        this.score = score;
        }
    }

    public void setNum(short num) {
        if (num > 0) {
        this.num = num;
    }
    }

    public Student () {

    }
    public Student (String name, byte score, short num) {
        this();//调用当前类中的构造方法
        this.name = name;
        this.score = score;
        this.num = num;
    }

    public void a () {
        System.out.println("a的无参方法");
        a(2);
    }

    public void a(int a) {
        System.out.println("a的有参方法");

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", num=" + num +
                '}';
    }
}
