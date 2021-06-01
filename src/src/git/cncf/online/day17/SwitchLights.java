package git.cncf.online.day17;

public class SwitchLights {


    public boolean[] onlights(int numLights, int peoples) {
        boolean[] lights = new boolean[numLights];

        for (int i = 0 ; i < lights.length -1; i ++) {
            //i为第i盏灯
            for (int j = 1 ; j < peoples; j ++){
                //j为第j个人
                if (numLights % j  == 0) {
                    //如果当前灯对人数取余等于0则改变当前开关状态
                    lights[j] = !lights[j];
                }
            }
        }
        for (int x = 0 ; x < lights.length ; x ++) {
            //对最后结果取反（由于初始值为false，需要在运算后对结果取反得到正确的值）
            lights[x] = !lights[x];
        }
    return lights;
    }
}
