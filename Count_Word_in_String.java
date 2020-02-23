/*
 * To count number of words in a string
 * i/p: "this is bangalore"
 * o/p:3
 */
public class Count_Word_in_String {
public static void count_words(String str)
{
char ch[]=str.toCharArray();
int count=0;
for(int i=0 ;i<ch.length;i++)
{
	int start=i;
	while(i<ch.length && ch[i] != ' ')
	{
		i++;
	}
	int end=i-1;
	if(end>=start)
	{
		
		count++;
	}
}
System.out.println("number of words in the string:"+count);
}

public static void main(String[] args) {
		String str="  This is banglore city and it is";
		count_words(str);
	}

}
