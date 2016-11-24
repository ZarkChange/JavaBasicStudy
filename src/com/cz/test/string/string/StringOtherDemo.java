package com.cz.test.string.string;

public class StringOtherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "This is text";

        System.out.println("- str=" + str);
        
        
        // Return lower case string.转换为全小写
        String s2 = str.toLowerCase();

        System.out.println("- s2=" + s2);

        // Return upper case string.转换为全大写
        String s3 = str.toUpperCase();

        System.out.println("- s3=" + s3);

        // Check string started by "This" or not.
        boolean swith = str.startsWith("This");

        System.out.println("- 'str' startsWith This ? " + swith);
       
        // A string with whitespace in beginning and end.
        // Note: \t is tab character
        // \n is new line character
        str = " \t Java is hot!  \t \n ";

        System.out.println("- str=" + str);

        // Returns a copy of the string, with leading and trailing whitespace omitted.
        String s4 = s2.trim();

        System.out.println("- s4=" + s4);
	}

}
