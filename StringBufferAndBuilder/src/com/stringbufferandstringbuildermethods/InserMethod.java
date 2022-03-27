package com.stringbufferandstringbuildermethods;

public class InserMethod
{

	public static void main(String[] args)
	{
		//using string buffer
		System.out.println("using string buffer");
		StringBuffer text1=new StringBuffer("I love tea more coffee");
		System.out.println(text1.insert(16, "than "));
		
		System.out.println("******************");
		
		//using string builder
		System.out.println("using string builder");
		StringBuilder text2=new StringBuilder("I love tea more coffee");
		System.out.println(text2.insert(16, "than "));
	}

}
