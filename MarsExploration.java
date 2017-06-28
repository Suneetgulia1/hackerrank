package hack;

import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scount=0,ocount=0,total=0;
Scanner scan = new Scanner(System.in);
String s1= scan.next();
s1=s1.toUpperCase();
int l= s1.length();
if(l%3==0 && l>=1&&l<=99)
for(int i=0;i<l;i++)
	{
	if(s1.charAt(i)=='O')
	{
		ocount++;

	}
	if(s1.charAt(i)=='S')
	{
		scount++;

	}
}
total=l-(ocount+scount);

	System.out.println(total);
	}

}
