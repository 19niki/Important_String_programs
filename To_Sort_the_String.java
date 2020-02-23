/*
 * To sort the string is ascending order
 * i/p:ZXDFAIOYT
 * o/p:ADFIOTXYZ
 */
public class To_Sort_the_String {

	public static void main(String[] args) {
		String str="ZXDFAIOYT";
		char ch[]=str.toCharArray();
		System.out.println("String before sorting:"+str);
		for(int i=0; i<ch.length-1;i++)
		{
			for(int j=0; j<ch.length-i-1; j++)
			{
				if(ch[j]>ch[j+1])
				{
				char temp=ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=temp;
			}
		}
		}
		String str2=new String(ch);// converting character array to string
		System.out.println("String after sorting:"+str2);

	}

}
