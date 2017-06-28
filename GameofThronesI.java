package hack;

import java.util.Scanner;

public class GameofThronesI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner x= new Scanner(System.in);
	String s1= x.next().toLowerCase();
	char a[]=s1.toCharArray();
	int k[]= new int[26];
	int oc=0;
	for(int i=0;i<a.length;i++)
	{
		if((++k[a[i]-97])%2!=0)
		{
			oc++;
		}
		else
		{
			oc--;
		}
	}
	if(oc>1)
	System.out.println("NO");
	else
	System.out.println("YES");

	}

}
