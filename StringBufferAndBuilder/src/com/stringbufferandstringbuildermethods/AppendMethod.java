package com.stringbufferandstringbuildermethods;

public class AppendMethod 
{

	public static void main(String[] args)
	{
		//using string buffer method
		System.out.println("append using string buffer method:");
		StringBuffer text1=new StringBuffer("apple clour is ");
		System.out.println(text1);
		System.out.println(text1.append("red"));
		
		System.out.println("*********************************");
	
		//using string builder method
		System.out.println("append using string builder method:");
	    StringBuilder text2=new StringBuilder("mango clour is ");
		System.out.println(text2);
		System.out.println(text2.append("yellow"));
	
	}
}
