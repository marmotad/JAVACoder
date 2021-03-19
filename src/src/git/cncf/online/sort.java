package git.cncf.online;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] sorts = {1, 20, 0, 80};
        for (int j = 0; j < sorts.length-1; j++) {
            for (int i = 0; i < sorts.length - 1; i++) {
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
}


