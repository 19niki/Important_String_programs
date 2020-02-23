/*
 * To convert the upper case to lower case without using built-in
 */
public class Covert_Upper_to_Lower_Without_func 
{
	public static void convert(String str)
	{
		
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=64 && ch<=91)
			{
				ch=(char) (ch+32);
				System.out.println(ch);
			}
			else if(ch>=96 && ch<=123)
			{
				ch=(char) (ch-32);
				System.out.println(ch);
			}
			//String convert=new String(ch);
		}
	}
    public static void main(String[] args)
    {
    	String str="Helllo How Are U";
    	convert(str);
    }
}
