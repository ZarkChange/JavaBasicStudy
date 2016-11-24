package com.cz.test.string.stringbuilder;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create StringBuilder object
        // with no characters in it and
        // an initial capacity specified by the capacity argument
        StringBuilder sb = new StringBuilder(10);
        
        // Append the string Hello ... on sb.
        sb.append("Hello...");
        System.out.println("- sb after appends a string: " + sb);

        // append a character
        char c = '!';
        sb.append(c);
        System.out.println("- sb after appending a char: " + sb);

        // Insert a string at index 5
        sb.insert(8, " Java");
        System.out.println("- sb after insert string: " + sb);
        
    
        // Delete substring at index 5 to 8
        sb.delete(5,8);

        System.out.println("- sb after delete: " + sb);
        
        
        System.out.println("- sb length:"+sb.length());
	}

}
