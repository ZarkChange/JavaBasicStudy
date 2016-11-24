package com.cz.test;

public class Arrays {
	
	public  int[] arrayReverse(int[] arrray ){
		int[] result=new int[arrray.length];
		for(int i=0, j=result.length-1;i<result.length;i++,j--){
			result[j]=arrray[i];
		}
		return result;
		
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays arrays=new Arrays();
		int[] array={1,3,5,7,9};
		int[] result=arrays.arrayReverse(array);
		System.out.println(result.toString());
		
	}
	
	

}
