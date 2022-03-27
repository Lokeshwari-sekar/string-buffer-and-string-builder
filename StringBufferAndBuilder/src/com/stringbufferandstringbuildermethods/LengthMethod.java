package com.stringbufferandstringbuildermethods;

public class LengthMethod
{

	public static void main(String[] args)
	{
		System.out.println("length using string buffer method");
		StringBuffer text1=new StringBuffer("");
		StringBuffer text2=new StringBuffer("Welcom to Maduranthakam");
		System.out.println(text1.length());
		System.out.println(text2.length());
		
		System.out.println("*********************************");
		
		System.out.println("length using string builder method");
		StringBuilder message1=new StringBuilder("");
		StringBuilder message2=new StringBuilder("Good Afternoon");
		System.out.println(message1.length());
		System.out.println(message2.length());
	}

}
