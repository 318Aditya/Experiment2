import java.util.*;

class string_method
{
	public static void main(String[] args)
	{
		String str="rit islampur";
		System.out.println(str.length());
	
		char ch=str.charAt(10);
		System.out.println(ch);
		
		int index=str.indexOf('t');
		System.out.println(index);

		String str1=str.replace('i','I');
		System.out.println(str1);

		String substring = str.substring(0,3);
		System.out.println(substring);
	}
}