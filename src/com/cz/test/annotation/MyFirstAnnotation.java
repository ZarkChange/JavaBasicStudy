package com.cz.test.annotation;

public @interface MyFirstAnnotation {
	
	public String name();
	
	public String description() default "";
}
