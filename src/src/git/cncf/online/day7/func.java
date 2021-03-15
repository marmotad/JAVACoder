package git.cncf.online.day7;

public class func {
    private static void sorts(int[] sorts) {
        //int[] sorts = {34,21,8,49};
        for (int j = 0; j < sorts.length-1; j++) {
            for (int i = 0; i < sorts.length - 1 - j; i++) {
                if (sorts[i] > sorts[i + 1]) {
                    int temp = sorts[i];
                    sorts[i] = sorts[i + 1];
                    sorts[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < sorts.length; i++) {

            System.out.println(sorts[i]);
        }

    }
    public static void main(String[] args) {
        int [] sorts1 = {20,10,0,39};
        int [] sorts2 = {20,10,0,39};
        sorts(sorts1);
        //引用方法时，要注意是否有形参，有的话需要对形参赋值，若有多个形参时，用“，”隔开
    }
}
