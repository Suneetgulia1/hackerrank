package hack;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
	int t= scan.nextInt();
	while(t>0)
	{
		int count =0;
		String s1=scan.next();
		for(int i=1;i<s1.length();i++)
		{
			if(s1.charAt(i)==s1.charAt(i-1))
			{
				count++;
			}
		}
	System.out.println(count);
	
	
	t--;
	}
	
	}

}
