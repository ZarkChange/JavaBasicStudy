package com.cz.test.comparation;

public class StringComparationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("This is text");

        String s2 = new String("This is text");

        // s1 and s2 Comparison, use equals(..)
        boolean e1 = s1.equals(s2);

        // true
        System.out.println("first comparation: s1 equals s2 ? " + e1);

        
        s2 = new String("New s2 text");

        boolean e2 = s1.equals(s2);

        // false
        System.out.println("second comparation: s1 equals s2 ? " + e2);
	}

}
