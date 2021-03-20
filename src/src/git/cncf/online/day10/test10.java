package git.cncf.online.day10;

public class test10 {
    public static void main(String[] args) {
/*
        persion p1 = new persion();
        p1.setName("haha");
        p1.setAge((byte) 10);
        p1.setHight((short) 20);
        System.out.println(p1);
**/
        Student S1 = new Student("A", (byte) 73, (short) 173);
        Student S2 = new Student("bb", (byte) 74, (short) 178);
        Student S3 = new Student("cc", (byte) 84, (short) 184);

        Student S4 = new Student();
        S4.setName("dd");
        S4.setNum((short)55);
        S4.setScore((byte) 70 );


        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        System.out.println(S4);

        S4.a();
    }
}
