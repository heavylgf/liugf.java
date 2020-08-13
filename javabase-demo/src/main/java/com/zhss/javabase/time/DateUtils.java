package com.zhss.javabase.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具类
 * @Author: liugf
 * @Date: 2020/8/13 下午3:32
 */
public class DateUtils {

    /**
     * 按照设置的格式获取当前时间
     * @return 当前时间
     */
    public Date currentTime() {
        //设置日期格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // new Date()为获取当前系统时间
        String time = simpleDateFormat.format(new Date());
        Date currentTime = null;
        try{
            currentTime = simpleDateFormat.parse(time);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return currentTime;
    }

    /**
     * 获取时间的时间戳：基于毫秒级的时间戳
     * @param time 时间
     * @return timestamp 时间戳
     */
    public Long getTimestamp(String time) {
        // 设置时间格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long timestamp = 0L;
        Date date = null;

        try {
            date = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 获取时间的时间戳
        timestamp = date.getTime();
        return timestamp;

    }

    /**
     * 增加n天后的时间
     * @param n
     * @return
     */
    public Date getAddDays(int n) {
        //设置日期格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date addTime = null;
        // 获取当前时间
        Calendar calendar = Calendar.getInstance();
        // 增加n天
        calendar.add(Calendar.DATE, n);

        String time = simpleDateFormat.format(calendar.getTime());
        try {
            addTime = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return addTime;
    }

    /**
     * 获取系统当前时间
     * @return
     */
    public Date getSystemTime () {
        // 设置时间格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 获取系统时间
        Calendar calendar = Calendar.getInstance();
        String time = simpleDateFormat.format(calendar.getTime());
        Date date = null;

        try {
            date = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        System.out.println("year: " + year);

        String time = simpleDateFormat.format(calendar.getTime());
        System.out.println("time: " + time);

    }

}
