package com.stringbufferandstringbuildermethods;

public class CapacityMethod
{

	public static void main(String[] args)


	{ 
		System.out.println("capcity using string buffer method");
		StringBuffer text1=new StringBuffer("");
		StringBuffer text2=new StringBuffer("Welcom to Maduranthakam");
		System.out.println(text1.capacity());
		System.out.println(text2.capacity());
		
		System.out.println("*********************************");
		
		System.out.println("capacity using string builder method");
		StringBuilder message1=new StringBuilder("");
		StringBuilder message2=new StringBuilder("Good Afternoon");
		System.out.println(message1.capacity());
		System.out.println(message2.capacity());
	}

}
