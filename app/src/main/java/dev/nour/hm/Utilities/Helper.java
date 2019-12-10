package dev.nour.hm.Utilities;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {
    public static String getDateTime(long time){
        Date date = new Date(time);
        Format format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }

    public static Date getDate(long time){
        return new Date(time);
    }
}

