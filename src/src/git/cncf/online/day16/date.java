package git.cncf.online.day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        //表示当前日期
        Date date = new Date();
        //获取unix时间的毫秒值
        System.out.println(date.getTime());
        System.out.println(date);

        //指定输出日期格式,日期转换为字符串
        /*
         * y 年
         * M 月 m分
         * d 日 D 一年中的第几天
         * h 12小时格式的时，H 24小时格式的时
         * s 秒 S毫秒
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        System.out.println(sdf.format(date));

        //字符串转换为日期
        String setdate = "2012-11-12 13:30:22.222";
        try {
            Date date1 = sdf.parse(setdate);
            System.out.println(sdf.parse(setdate));
            //判断时间先后（判断date是否在date1后面）
            System.out.println(date.after(date1));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar ca = Calendar.getInstance();
        //get 方法可以获取每个字段上的值  常量表示字段上的值
        System.out.println(ca.get(Calendar.YEAR));
        System.out.println(ca.get(Calendar.MONTH)+ 1);
        System.out.println(ca.get(Calendar.DAY_OF_MONTH));
        System.out.println(ca.get(Calendar.DAY_OF_YEAR));
        System.out.println(ca.get(Calendar.DATE));
        System.out.println(ca.get(Calendar.HOUR_OF_DAY));
        System.out.println(ca);
        //清空每个字段的值
        //ca.clear();
        //设置某个字段的值
        ca.set(Calendar.YEAR,2012);
        System.out.println(ca.get(Calendar.YEAR));

        //日期格式转换
        //获取指定格式日期
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println(ca.getTime());
        System.out.println(sdf1.format(ca.getTime()));
        //计算时间间隔后是哪一天
        //ca.add(Calendar.YEAR,1);
        //ca.add(Calendar.MONTH,6);
        ca.add(Calendar.DAY_OF_YEAR,90);
        System.out.println(sdf1.format(ca.getTime()));
    }
}
