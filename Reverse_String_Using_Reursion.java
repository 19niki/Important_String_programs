/*
 * Reverse the string using recursion
 */
public class Reverse_String_Using_Reursion {
public static String reverse(String str)
{
	if(str.isEmpty())
	{
		System.out.println("String is empty");
		return str;
	}
	return reverse(str.substring(1))+str.charAt(0);
}
	public static void main(String[] args) {
		String str="hi hello how are you";
		String revstr=reverse(str);
		System.out.println("Original string is:"+str);
		System.out.println("reverse string is:"+revstr);

	}

}
