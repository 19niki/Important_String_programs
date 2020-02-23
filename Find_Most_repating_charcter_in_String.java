/* To find most occurring character in a string
 * 
 */
public class Find_Most_repating_charcter_in_String {

	public static void main(String[] args) {
		String str="AAggaffAAuu";
		char temp=0;
		int count=1;
		char pop=0;
		char ch[]=str.toCharArray();
		for(int i=0; i<ch.length;i++)
		{
			 temp=ch[i];
			int tempcount=0;
			for(int j=0; j<ch.length;j++)
			{
				if(temp==ch[j])
				{
					tempcount++;
				}
				if(tempcount>=count)
				{
				
					  pop=temp;
				      count=tempcount;
				}
			}
		}
      System.out.println("The max occuring charcter is:"+pop+":it occured:"+count);
	}

}
