package git.cncf.online.day11.homewark.area;

public class round implements publicClass {

    @Override
    public void area(int radius) {
        System.out.print("面积是");
        System.out.println(3.14 * radius * radius);
    }

    @Override
    public void perimeter(int radius) {
        System.out.print("周长是");
        System.out.println(3.14 * 2 * radius);
    }
}
