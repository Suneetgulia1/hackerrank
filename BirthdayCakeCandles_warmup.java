package hack;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles_warmup {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int count=0;
        int array[]= new int[n];
        for(int i=0;i<n;i++)
        	array[i]=scan.nextInt();
	
       Arrays.sort(array);
        for(int i=0;i<n;i++)
        {
        	if(array[i]==array[n-1])
        	{
        		count++;
        	}
        }
       
	System.out.println(count);
	}

}
