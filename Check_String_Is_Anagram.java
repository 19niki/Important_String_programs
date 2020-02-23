/*
 * TO check a string is anagram is not
 * i/p=listen
 * o/p=silent
 * both are different words but contains same words. 
 */
import java.util.Arrays;

public class Check_String_Is_Anagram {

	public static void main(String[] args) {
		String str1="Listen";
		String str2="silent";
		boolean found=false;
		if(str1.length() != str2.length())
		{
			System.out.println("not an anagram");
		}
		else
		{
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0; i<ch1.length;i++)
			{
				for(int j=0; j<ch2.length;j++)
				{
					if(ch1[i]==ch2[j])
					{
						found=true;
					}
					else
					{
						found=false;
					}
				}
			}
		}
			if(found)
			{
				System.out.println("String is a anagram");
			}
			else
				System.out.println("String is no anagram");
		

	}

}
