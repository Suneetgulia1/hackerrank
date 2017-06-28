package hack;

import java.util.Arrays;
import java.util.Scanner;

public class pairs {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	int k=scan.nextInt();
	int arr[]= new int[n];
	for(int i=0;i<n;i++)
	arr[i]=scan.nextInt();
	int count=0;
	Arrays.sort(arr);
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(Math.abs(arr[i]-arr[j])==k)
			{
				count++;
			}
		}
	}
	
	System.out.println(count);
	}

}
