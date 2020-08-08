package com.zhss.javabase.TimeUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: liugf
 * @Date: 2020/8/8 下午3:51
 */
public class TimeTest {

    public static void main(String[] args) {

        /**
         * String 转换Timestamp
         */
//    Timestamp ts = new Timestamp(System.currentTimeMillis());
//
//    // 设置日期格式
//    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//    // new Date()为获取当前系统时间
//    Date date = new Date();
//    System.out.println("date: " + date);
//
//    String tsStr = df.format(date);
//    try {
//        System.out.println("Timestamp: " + Timestamp.valueOf(tsStr));
//        ts = Timestamp.valueOf(tsStr);
//        System.out.println("ts: " + ts);
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//
//    // Date转Timestamp
//    Timestamp createTime = new Timestamp(new Date().getTime());
//    System.out.println("createTime: " + createTime);
//
//    System.out.println("......");

        /**
         * 基于毫秒的时间戳
         */
        String time = "2019-07-01 10:00:00";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long timestamp = 0L;

        Date date = null;
        try {
            date = simpleDateFormat.parse(time);
        } catch(ParseException e) {
            e.printStackTrace();
        }

        timestamp =date.getTime();//获取时间的时间戳
        System.out.println("timestamp: "+timestamp);

        //        data.setField("time1", timestamp);
    }

}
