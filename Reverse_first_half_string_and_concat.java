/*
 * To reverse the first half of the string and cocat to original second half
 * i/p:"Bangalore"
 * o/p
 * first half="agnab"
 * second half="lore"
 * reesult=agnablore
 */
public class Reverse_first_half_string_and_concat {

	public static void main(String[] args) {
		String str="Bangalore";
		String firsthalf="";
		String sechalf="";
		System.out.println("original string:"+str);
		// to reverse first half
		for(int i=str.length()/2; i>=0; i--)
		{
		   firsthalf=firsthalf+str.charAt(i);	
		}
          System.out.println("firsthalf of the string:"+firsthalf);
       
          //to extract other part of string
          for(int i=5; i<str.length();i++)
          {
        	  sechalf=sechalf+str.charAt(i);
          }
          System.out.println("second half of the string:"+sechalf);
         //to concat first and second half
          System.out.println("concat of 2 strings:"+firsthalf+sechalf);
	}

}
