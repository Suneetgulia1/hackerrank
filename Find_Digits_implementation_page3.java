package hack;

import java.util.Scanner;

public class Find_Digits_implementation_page3 {

	public static void main(String[] args) {

	Scanner scan= new Scanner(System.in);
	int testcases=scan.nextInt();
	while(testcases>0)
	{
		int count=0;
		String number= scan.next();
		
		char array[]=number.toCharArray();
		
		for(int i=0;i<array.length;i++)
		{
			int c= Integer.parseInt(String.valueOf(array[i]));
		if(c!=0){
			if((Integer.parseInt(number))% c==0)
			{
				count++;
			}
		}
		}
		
	System.out.println(count);
	
		testcases--;
	
	}
	
 }
}