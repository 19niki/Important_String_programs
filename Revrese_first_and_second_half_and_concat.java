/*
 * To reverse the first half of the string and cocat to original second half
 * i/p:"Bangalore"
 * o/p
 * first half="agnab"
 * second half="erol"
 * reesult=agnaberol
 */
public class Revrese_first_and_second_half_and_concat {

	public static void main(String[] args) {
		String str="Bangalore";
		String firsthalf="";
		String sechalf="";
		// to reverse first half
		System.out.println("original string:"+str);
		for(int i=str.length()/2; i>=0; i--)
		{
		   firsthalf=firsthalf+str.charAt(i);	
		}
		System.out.println("firsthalf of the string:"+firsthalf);
	       
       
          //to reverse other part of string
          for(int i=5; i<str.length();i++)
          {
        	  sechalf=str.charAt(i)+sechalf;
          }
          System.out.println("second half of the string:"+sechalf);
          //to concat first and second half
           System.out.println("concat of 2 strings:"+firsthalf+sechalf);
           

	}

}
