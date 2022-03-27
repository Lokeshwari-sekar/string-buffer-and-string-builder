package com.stringbufferandstringbuildermethods;

public class IndexOfMethod
{

	public static void main(String[] args) 
	{
		System.out.println("using string buffer and string builder");
		
		//using characters
		System.out.println("using characters");
		String message1="I am Learning Java Language it is programming Language";
		System.out.println(message1.indexOf('J'));
		System.out.println(message1.indexOf('L'));
		System.out.println(message1.indexOf('L', 0));
		System.out.println(message1.indexOf('L', 7));
		
		//using string
		System.out.println("using strings");
		System.out.println(message1.indexOf("Java"));
		System.out.println(message1.indexOf("Language",20));

		
	}

}
