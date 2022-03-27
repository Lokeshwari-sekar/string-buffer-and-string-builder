package com.stringbufferandstringbuildermethods;

public class ReverseMethod 
{

	public static void main(String[] args)
	{
		//using string buffer
		System.out.println("using buffer method");
		StringBuffer word=new StringBuffer("MADAM");
		System.out.println(word);
		System.out.println(word.reverse());
		
		
		System.out.println("**********************");
		
		
		//using string builder method
		System.out.println("using builder method");
		StringBuilder word1=new StringBuilder("DREAM");
		System.out.println(word1);
		System.out.println(word1.reverse());
	}

}
