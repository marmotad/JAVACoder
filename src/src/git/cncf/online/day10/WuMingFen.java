package git.cncf.online.day10;

public class WuMingFen {
    private String theMa;
    private int quantity;
    private boolean likeSoup;

    WuMingFen(String theMa, int quantity, boolean likeSoup) {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
        check();
    }
    private WuMingFen(String theMa, int quantity) {
        this.theMa = theMa;
        this.quantity = quantity;
    }

    private void check() {
        System.out.println("类型：" + theMa + "重量：" + quantity + "是否带汤：" + likeSoup );
    }
}
