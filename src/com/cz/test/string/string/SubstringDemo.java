package com.cz.test.string.string;

public class SubstringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "This is text";

        // Returns the substring from index 3 to the end of string.
        String substr = str.substring(3);

        System.out.println("- substring(3)=" + substr);

        // Returns the substring from index 2 to index 7.
        substr = str.substring(2, 7);

        System.out.println("- substring(2, 7) =" + substr);
	}

}
