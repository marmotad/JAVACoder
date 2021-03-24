package git.cncf.online.day11.homewark.animal;

public class cat extends Animal {
    @Override
    public void eat() {
        System.out.println("吃猫粮");
    }
    public void cat() {
    }

    @Override
    public String toString() {
        return "cat{} " + super.toString();
    }
}
