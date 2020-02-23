/*
 * To check the string is palindrome or not
 * i/p:pop
 * o/p:pop
 * print the string as palindrome
 * 
 * i/p:hello
 * o/p:olleh
 * print string is not palindrome
 */
public class String_Palindrome {
	public static void palindrome(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
	   if(str.equals(rev))
	   {
		   System.out.println("String is a palindrome:"+rev);
	   }
	   else
		   System.out.println("String is not Plaindrome:"+rev);
	}
		
	public static void main(String[] args) {
		String str="hello";
		palindrome(str);

	}

}
