package com.cz.test.util.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	/**
	 * map.keySet获取map的键值
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object, Object> map=new HashMap<Object, Object>();
		map.put("name", "tom");
		map.put("age", 21);
		map.put("gender", "男");
		
		
		Set<Object> keySet=map.keySet();
		System.out.println(keySet);
		
	}

}
