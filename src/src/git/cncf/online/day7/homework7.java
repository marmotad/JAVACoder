package git.cncf.online.day7;

public class homework7 {
    private static void bignum(int[] bignum) {
        for (byte i = 0;i < bignum.length - 1 ; i ++) {
            for (byte j = 0; j < bignum.length - 1 - i; j++ )
            if (bignum[j] > bignum[j + 1]) {
                int temp = bignum[j];
                bignum[j] = bignum[j + 1];
                bignum[j + 1] = temp;
            }
        }
        System.out.println(bignum[bignum.length - 1]);
    }



public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,97,77};
        bignum(num);

        int[] ints = {1,2,3,4};

        for (int i = 0 ; i < ints.length; i++) {
            int a, b, c, d;
            a = ints[0];
            b = ints[1];
            c = ints[2];
            d = ints[3];

<<<<<<< HEAD
=======



>>>>>>> f942bc00ed82689ad18274dd3126c75033c7bf3f

            /*
            System.out.print(ints[i]);
            if (i + 1 < ints.length) {

                System.out.println(ints[i + 1]);
             */

            }
        }


}

