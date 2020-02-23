/*
 * To reverse a string 
 * i/p: hello world
 * o/p  dlrow olleh
 */

public class String_reverse {
public static void reverse(String str)
{
	String rev="";
	for(int i=str.length()-1;i>=0; i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
}
	public static void main(String[] args) {
		String str="Hello world";
		reverse(str);

	}

}
