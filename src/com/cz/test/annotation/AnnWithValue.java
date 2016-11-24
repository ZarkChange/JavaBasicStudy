package com.cz.test.annotation;

public @interface AnnWithValue {
	public int value();
	
	public String name() default "";
}
