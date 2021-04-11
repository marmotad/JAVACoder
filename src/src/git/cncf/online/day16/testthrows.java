package git.cncf.online.day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testthrows {

    public static int a(String str) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = sdf.parse(str);
        System.out.println(date);
        return 200;
    }

    public static void main(String[] args) throws ParseException {
        //抛出异常 throws向外抛出异常
        //谁执行抛给谁
        String setdate = "2020-11-11 14:40:02.111";
        a(setdate);
        throw new NumberFormatException();
    }
}
