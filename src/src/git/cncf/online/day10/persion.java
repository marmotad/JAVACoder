package git.cncf.online.day10;

public class persion {
    private String name;
    private byte age;
    private short hight;

    public void setName(String name) {
        this.name = name;

    }
    public void setAge(byte age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setHight(short hight) {
       if (hight > 0) {
            this.hight = hight;
        }
    }

    public byte getAge() {
        return age;
    }

    public short getHight() {
        return hight;
    }

    @Override
    public String toString() {
        return "persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hight=" + hight +
                '}';
    }
}

