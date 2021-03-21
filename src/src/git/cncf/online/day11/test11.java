package git.cncf.online.day11;

public class test11 {
    public static void main(String[] args) {
        /*
        Animal animal = new Cat();

        animal.setAge(18);
        animal.setName("tom");
        Animal c1 = new Cat("tom", 88, "白色");
        System.out.println(animal);
        System.out.println(c1);
        */
        //b(new Cat("tom",88,"白色"));
        b(new Cat());
        //b(new dog("来福",55,"白色"));
        b(new dog());
    }


    private static void b(Animal animal) {
        System.out.println("================");
        animal.run();
        System.out.println("================");

    }
}