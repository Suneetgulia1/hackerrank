package hack;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan = new Scanner(System.in);
	int length=scan.nextInt();
	String s= scan.next();
	char c[]= new char[length];
	c=s.toCharArray();
	for(int i=0;i<=c.length;i++)
	{
		if((int)c[i]>64&&(int)c[i]<91||(int)c[i]>96&&(int)c[i]<123)
		{
			c[i]=(char) (c[i]+2);
		}

	
	}
	for(int i:c)
	System.out.print(c[i]);
	}

}
