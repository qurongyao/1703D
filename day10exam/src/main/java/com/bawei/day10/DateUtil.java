package com.bawei.day10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	//方法1：根据传入的日期获取年龄
	//示例:
	public static int getAge (Date src) {
	//TODO
		Date date = new Date();
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy");
		
		String format1 = simpleDateFormat1.format(date);
		String format2 = simpleDateFormat2.format(src);
		int int1 = Integer.parseInt(format1);
		int int2 = Integer.parseInt(format2);
		System.out.println(format1);
		System.out.println(format2);
		return int1-int2;
	}
	
	//方法2：根据传入的参数获取该日期的月初日期，
	//例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	//示例:
	public static Date getDateByMonthInit (Date src) {
		
		return src;
	//TODO
	}
	
	
	//方法3 :根据传入的参数获取该日器的月末日期，例如给定的日期为
	//“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	//示例:
	public static Date getDateByMonthLast(Date src) {
		return src;
	//TODO
	}
	
	
	//方法4：求未来日期离今天还剩的天数
	//示例:
	public static int getDaysByFuture (Date future) {
		Date date = new Date();
		long time1 = date.getTime();
		long time2 = future.getTime();
		long time = time2-time1;
		long i = (time/1000/60/60/24/30/12);
		return (int) i;
	//TODO
	}
	
	//方法5：求过去日期离今天过去的天数
	//示例:
	public static int getDaysByDeparted (Date departed) {
		Date date = new Date();
		long time1 = date.getTime();
		long time2 = departed.getTime();
		long time = time1-time2;
		long i = (time/1000/60/60/24/30/12);
		return (int) i;
	}
	public static void main(String[] args) {
		
		
	}
}
