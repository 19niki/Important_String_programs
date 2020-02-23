/*
 * To count number of upper, lower, spaces, special charcter in string.
 */
public class Count_Upper_and_Lowercase_Letters {
	public static void check_string(String str)
	{
	  int upper=0, lower=0, num=0, special=0, spaces=0;
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				upper++;
			}
			else if(ch>='a' && ch<='z')
			{
				lower++;
			}
			else if(ch>='0' && ch<='9')
			{
				num++;
			}
			else if(ch== ' ')
			{
				spaces++;
			}
			else
				special++;
		}
		
		System.out.println("Number of uppercase letters in the String is:"+upper);
		System.out.println("Number of lowersace in the String are:"+lower);
		System.out.println("Number of digits in the String are:"+num);
		System.out.println("Number of spaces in the String are:"+spaces);
		System.out.println("Number of special charcter in the String are:"+special);
	}
	public static void main(String[] args) {
		String str="  This is@#$6 Our764 InDia  ";
		check_string(str);


	}

}
