package com.qurongyao.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.qurongyao.bean.Student;
import com.qurongyao.common.uitls.AssertUtil;

import junit.framework.Assert;

public class DTest {
	
	//测试AssertUtil.isTrue()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void test01(){
		AssertUtil.isTrue(true, "只能为真");
	}
	//测试AssertUtil.isFalse()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void test02(){
		AssertUtil.isFalse(false, "只能为假");
	}
	//测试AssertUtil.notNull()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void test03(){
		Student s = new Student();
		s.setSid(1);
		s.setSname("张三");
		//System.out.println(s);
		AssertUtil.notNull(s, "对象不能为空");
	}
	//测试AssertUtil.isNull()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void test04(){
		Student s = new Student();
		AssertUtil.isNull(null, "对象必须为空");
	}
	//用List对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void test05(){
		Student s = new Student();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		AssertUtil.notEmpty(list, "对象不能空，以及必须包含1个元素");
	}
	//用Map对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test 
	public void test06(){
		Map<Integer,Integer> map =new HashMap<>();
		map.put(1, 1);
		AssertUtil.notEmpty(map, "Map集合不为空，对象不能空，以及必须包含1个元素");
	}
	//用String对象测试AssertUtil.hasText()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void test07(){
		AssertUtil.hasText("11", "字符串必须有值");
	}
	//测试AssertUtil. greaterThanZero()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void test08(){
		BigDecimal b = new BigDecimal(-1);
		System.out.println(b);
		AssertUtil.greaterThanZero(b, "必须大于0");
	}
	
}
