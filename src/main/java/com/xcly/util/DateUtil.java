package com.xcly.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private final static String YEAR_MONTH_DAY_HOUR_MINUTE_SECONDS = "yyyy-MM-dd HH:mm:ss";

    /**
     *
     * @param date 时间
     * @param reg 格式
     * @return
     */
    public static String format1(Date date, String reg) {
        //定义一个格式
        SimpleDateFormat format = new SimpleDateFormat(reg == null ? YEAR_MONTH_DAY_HOUR_MINUTE_SECONDS : reg);

        return format.format(date);
    }
}
