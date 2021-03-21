package git.cncf.online.day11;

import git.cncf.online.day11.Animal;

public class dog extends Animal {
    private String type ;

    public dog(String name, int age) {
        super(name, age);
    }

    public dog(String name, int age, String type) {
        super(name,age);
        this.type = type;
    }

    public dog() {

    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //public void a() {
    //      super.test();
    //}

    public void a(){
        test();
    }
    public void run(){
        System.out.println("dog跑的很快");;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
