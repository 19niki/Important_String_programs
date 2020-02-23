/*
 * To reverse only the Sentence in the String not every word
 * i/p:This is Bangalore
 * o/p:Bangalore is this
 */
public class Reverse_only_Sentence_not_word 
{
public static void reverse_Sentence(String str)
{
	String words[]=str.split(" ");
    String reverse="";
    for(int i=words.length-1; i>=0;i--)
    {
    	reverse=reverse+words[i]+ " ";
    }
   System.out.println(reverse);
}
	public static void main(String[] args) {
		String str="This is Bangalore ";
		reverse_Sentence(str);
	}

}
