package git.cncf.online.day17;

import java.io.Serializable;

public class cat implements Serializable {
    private static final long serialVersionUID = 4639690024075146279L;
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
