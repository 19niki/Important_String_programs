/*
 * To find out number of vowels, conconants,  numbers and spaces in the string.
 */
public class Count_Vowels_in_String {

	public static void check_string(String str)
	{
		int vowel=0, num=0, consonants=0, spaces=0;
		str=str.toLowerCase();
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				num++;
			}
			
			else if(ch== ' ')
			{
				spaces++;
			}
			else if(ch=='a'|| ch=='e' || ch=='i'||ch=='o'|| ch=='u' )
			{
				vowel++;
			}
			else
				consonants++;
		}
		System.out.println("Number vowels in the String is:"+vowel);
		System.out.println("Numbr of consonants in the String are:"+consonants);
		System.out.println("Number of digits in the String are:"+num);
		System.out.println("Number of spaces in the String are:"+spaces);
	}
	public static void main(String[] args) {
		String str="  This is our764 India  ";
		check_string(str);

	}

}
