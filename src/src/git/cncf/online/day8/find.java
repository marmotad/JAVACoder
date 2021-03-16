package git.cncf.online.day8;

public class find {
    public static void find(int[] arr, int findNum) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //start : 开始查找的数组的最小索引；end：数组结束的索引；half：数组为查找的元素的中间索引
            int half = (start + end) / 2;
            if (findNum == arr[half]) {
                //如果数组中间索引对应的数自是要查找的数字，则查找到值，并返回
                System.out.println(arr[half]);
                return;
            } else if (findNum > arr[half]) {
                //如果查找的数字比数组中间索引的值大，则中间的索引加1
                start = half + 1;
            } else if (findNum < arr[half]) {
                end = half - 1;
                //如果查找的数字比数组中间索引的值小，则结开始的索引减1
            }
        }
        //return -1;
    }


    public static void main(String[] args) {
        int[] arrs = {89,91,97,456};
        find(arrs, 456);
    }
}