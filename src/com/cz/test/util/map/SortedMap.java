package com.cz.test.util.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortedMap {

	/**
	 * SortedMap是Map的子接口，它确保key/value对根据键以升序排列
	 * 在java.util中只有一个TreeMap类实现了SortedMap接口
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> map=new TreeMap<String, String>();
		
		map.put("10002", "tom");
		map.put("10005", "jack");
		map.put("10001", "merry");
		map.put("10003", "rose");
		map.put("10004", "chris");
		
		Set<Entry<String, String>> entries=map.entrySet();
		
		for(Entry<String, String> entry:entries){
			System.out.println("phone:"+entry.getKey()+"-"+entry.getValue());
		}
	}

}
