/*
 * To Print this pattern
 * 
 * G
 * GO
 * GOO
 * GOOG
 * GOOGL
 * GOOGle
 */
public class String_Concat_Pattern {

	public static void main(String[] args) {
		String str="GOOGLE";
	    String str2="";
	    char ch[]=str.toCharArray();
	    for(int i=0; i<ch.length;i++)
	    {
	    	str2=str2+ch[i];
	    	System.out.println(str2);
	    }
	}

}
