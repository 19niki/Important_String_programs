import java.util.Arrays;

public class Find_Longest_word_in_String {

	public static void main(String[] args) {
		String str="hi hello how are you";
		String word[]=str.split(" ");
		int a[]=new int[word.length];
		// storing length of each word in a array
        for(int i=0; i<word.length;i++)
        {
             a[i]=word[i].length();	
        }
        //print length of each word
      for(int i=0; i<a.length;i++)
      {
    	  System.out.println(word[i]+"="+a[i]);
      }
      
 Arrays.sort(a);
 String large="";
     for(int i=0; i<word.length;i++)
     {
    	 if(a[a.length-1]==word[i].length())
    	 {
    		 large=word[i];
    		// break;
    	 }
     }
     System.out.println("Largest word in the array is:"+large);
	}

}
