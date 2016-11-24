package com.cz.test.util.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapEntryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map=new HashMap<String, String>();
		
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
