/*
 * To reverse every word in a string
 * i/p:"hi hello how are you"
 * o/p:"ih olleh woh era uoy"
 */
public class Reverse_every_word_in_String {
public static void rev_word(String str)
{
	String revstr="";
	String[] words=str.split(" ");
	for(int i=0; i<words.length;i++)
	{
		String word=words[i];
		String revword=" ";
		for(int j=word.length()-1; j>=0;j--)
		{
			revword=revword+word.charAt(j);
		}
		revstr=revstr+revword;
	}
	System.out.println("Original String is:"+str);
	System.out.println("every word reverse string is:"+revstr);

}
	public static void main(String[] args) {
		String str="hi hello how are you";
		rev_word(str);
		
	}

}
