package git.cncf.online.day11;

public class publicClass {

    protected String  name = "public";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test(){
        System.out.println("公共test");
    }
}
