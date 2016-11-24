package com.cz.test.annotation;

public class UsingAnnWithValue {
	
	
	@AnnWithValue(name="Name1",value=100)
	public void someMethod1(){
		
	}
	
	@AnnWithValue(value=100)
	public void someMethod2(){
		
	}
	
	@AnnWithValue(100)
	public void someMethod3(){
		
	}
}
