/*
 * To check first character is present in the second character of the string
 */
public class Check_1st_charcter_is_present_2nd_String {

	public static void main(String[] args)
	{
	 String city="banaglore";
	 String country="beligum";
	 if(city.contains(country.substring(0,1)))
	 {
		 System.out.println("present");
	 }
	 else
		 System.out.println("not present");
	}

}
