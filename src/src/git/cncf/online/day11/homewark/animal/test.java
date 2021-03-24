package git.cncf.online.day11.homewark.animal;

public class test {
    public static void main(String[] args) {
        a(new cat());
        a(new dog());
        a(new eagle());
    }
        public static void a(Animal animal){
            System.out.println("=================");
            animal.eat();
        }

    }
