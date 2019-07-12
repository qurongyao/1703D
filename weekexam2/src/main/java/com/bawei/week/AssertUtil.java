package com.bawei.week;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	//断言为真
	public static void isTrue(Boolean bool,String massage){
		if(!Boolean.TRUE.equals(bool)){
			throw new DRuntimeException(massage);
		}
	}
	//断言为假
	public static void isFalse(Boolean bool,String massage){
		if(Boolean.TRUE.equals(bool)){
			throw new DRuntimeException(massage);
		}
	}
	//断言对象不为空
	public static void isNotNull(String str,String message){
		if(str==null||str.length()==0){
			throw new DRuntimeException(message);
		}
	}
	//断言对象必须空
	public static void isNull(String str,String message){
		if(str!=null||str.length()>0){
			throw new DRuntimeException(message);
		}
	}
	//断言List或Set集合不为空，没有元素也算空
	public static void conllectionNotNull(Collection<?> col,String message){
		if(col==null||col.size()==0){
			throw new DRuntimeException(message);
		}
	}
	//断言Map容器不为空，没有元素也算空
	public static void mapNotNull(Map<?,?> map,String message){
		if(map==null||map.size()==0){
			throw new DRuntimeException(message);
		}
	}
	//断言字符串必须有值，去掉空格后，长度必须大于0
	public static void hasText(String str,String message){
		if(str.trim().length()<=0){
			throw new DRuntimeException(message);

		}
	}
	//断言一个值必须是正数
	public static void absInt(int str,String message){
		if(str <= 0){
			throw new DRuntimeException(message);
		}
	}
	
}
