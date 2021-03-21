package git.cncf.online.day11;

public class Cat extends Animal {
        private String type ;
        /*

        public Cat(String name, int age) {
                super(name, age);
        }

        public Cat(String name, int age, String type) {
                super(name,age);
                this.type = type;
        }

        public Cat() {

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
*/
        @Override
        public void run(){
                System.out.println("cat可以跑");
        }

        @Override
        public String toString() {
                return "Cat{" +
                        "type='" + type + '\'' +
                        "} " + super.toString();
        }
}