package com.bawei.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.bawei.week.AssertUtil;

public class AssertTest {
	@Test
	public void test01(){
		AssertUtil.isTrue(true,"必须为真");
	}
	@Test
	public void test02(){
		AssertUtil.isFalse(false,"必须为假");
	}
	@Test
	public void test03(){
		AssertUtil.isNotNull("152346","对象不为空");
	}
	@Test
	public void test04(){
		AssertUtil.isNull("","对象必须空");
	}
	@Test
	public void test05(){
		List<Integer> list = new ArrayList<>();
		list.add(1);
		AssertUtil.conllectionNotNull(list, "List或Set集合不为空，没有元素也算空");
	}
	@Test
	public void test06(){
		Map map = new HashMap<>();
		
		AssertUtil.mapNotNull(map, "map不为空，没有元素也算空");
	}
	@Test
	public void test07(){	
		AssertUtil.hasText("dfs", "字符串必须有值，去掉空格后，长度必须大于0");
	}
	@Test
	public void test08(){	
		AssertUtil.absInt(-1, "一个值必须是正数");
	}
}
