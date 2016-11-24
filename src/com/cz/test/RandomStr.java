package com.cz.test;

import java.util.Random;

public class RandomStr {
	
	/**
	 * 生成6位随机数字符串
	 */
	public void randomStr(){
		String result="";
		for(int i=0;i<6;i++){
			//生成一个97-122之间的随机数
			int intval=(int) (Math.random()*26+97);
			//将intval强制转换为char类型然后连接到result后面
			result=result+(char)intval;
		}
		System.out.println(result);
	}
	
	public void random(){
		Random random=new Random();
		System.out.println(random.nextInt(10));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandomStr randomStr=new RandomStr();
		randomStr.randomStr();
		randomStr.random();

	}

}
