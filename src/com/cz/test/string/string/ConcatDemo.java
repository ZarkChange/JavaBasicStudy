package com.cz.test.string.string;

public class ConcatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="one";
		String s2="two";
		String s3="three";
		
		// s1.concat(s2) same as s1 + s2
        String s = s1.concat(s2);
        System.out.println("s1.concat(s2) = " + s);

        // s1.concat(s2).concat(s3) same as s1 + s2 + s3;
        s = s1.concat(s2).concat(s3);

        System.out.println("s1.concat(s2).concat(s3) = " + s);
	}

}
