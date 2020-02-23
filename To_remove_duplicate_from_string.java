/*
 * To Remove the duplicates from the array
 */

import java.util.HashSet;
import java.util.Set;

public class To_remove_duplicate_from_string {

	public static void main(String[] args) {
		String str="AAADddaaDDUSsIAB";
		str=str.toLowerCase();
		Set s=new HashSet();
		char ch[]=str.toCharArray();
		for(int i=0; i<ch.length;i++)
		{
			for(int j=i+1; j<ch.length;j++)
			{
				if(ch[i]!=ch[j])
				{
					if(!s.contains(ch[i]))
					{
						s.add(ch[i]);
					}
				}
				}
	}
	String o=s.toString();
System.out.println(o);
}
}
