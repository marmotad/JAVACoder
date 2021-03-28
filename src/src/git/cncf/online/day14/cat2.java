package git.cncf.online.day14;

public class cat2 {
    private String name;
    private byte age;
    private String type;
    private static cat2 cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static cat2 getInstance() {
        if (cat == null) {
            cat = new cat2();
        }
        return cat;
    }
/*
    @Override
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
 */
}
