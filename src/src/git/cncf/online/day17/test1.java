package git.cncf.online.day17;

import java.util.Arrays;
import java.util.UUID;


public class test1 {

    public static void main(String[] args) {
        //初始高度100
        double higit = 100;
        //每次高度是上一次的1/2,循环十次
        for (byte i = 0; i < 10; i++) {
            higit = higit / 2;
        }
        //打印最后高度

        String randomString = usingUUID();
        System.out.println("Random string is: " + randomString);
        System.out.println("Random string of 4 characters is: "
                + randomString.substring(0, 4));

        SwitchLights switchLights = new SwitchLights();
        System.out.println(Arrays.toString(switchLights.onlights(6, 6)));
    }
        static String usingUUID() {
            UUID randomUUID = UUID.randomUUID();
            return randomUUID.toString().replaceAll("-", "");
        }
    }
