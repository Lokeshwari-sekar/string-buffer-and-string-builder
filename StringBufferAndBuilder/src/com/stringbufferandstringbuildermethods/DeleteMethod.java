package com.stringbufferandstringbuildermethods;

public class DeleteMethod
{

	public static void main(String[] args) 
	{
		//using string buffer
		System.out.println("using string buffer");
		StringBuffer text1=new StringBuffer("I love tea more than than coffee");
		System.out.println(text1);
		System.out.println(text1.delete(16,20));
		System.out.println(text1.delete(0,2));


		System.out.println("******************");

		//using string builder
		System.out.println("using string builder");
		StringBuilder text2=new StringBuilder("I love tea more than than coffee");
		System.out.println(text2);
		System.out.println(text2.delete(16,20));

		
	}

}
