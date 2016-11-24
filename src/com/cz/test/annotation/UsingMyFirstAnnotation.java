package com.cz.test.annotation;

@MyFirstAnnotation(name="Some name",description="Some description")
public class UsingMyFirstAnnotation {
    
	// Annotation on Constructor.
    // The value of the element name is "John"
    // Value element description is "Write by John".	
	@MyFirstAnnotation(name="tom",description="write by tom")
	public UsingMyFirstAnnotation(){
		
	}
	
    // Annotation tied up method.
    // The value of the element name is "Tom"
    // Description element is not declared, it will be assigned a default value    
    @MyFirstAnnotation(name = "Tom")
    public void someMethod() {

    }
    
    // An Annotation on parameter of method.
	public void todo(@MyFirstAnnotation(name="none") String job){
		
		@MyFirstAnnotation(name="Some name")
		int localVariable=0;
	}
	
	
	public static void main(String [] args){
		UsingMyFirstAnnotation uAnnotation=new UsingMyFirstAnnotation();
		uAnnotation.someMethod();
	}
}
