package hack;

import java.util.Scanner;

public class JumpingontheClouds {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int e=100;
	    int n = in.nextInt();
	    int k = in.nextInt();
	    int a[] = new int[n];
	    for(int i=0; i<n; i++){
	        a[i] = in.nextInt();
	    }
	    for(int i=0;i<n;i=k+i)//increment by jump
	     {
	        if(a[i]==0)
	        {
	            e=e-1;
	        }
	        else /// for 1 ..automatically cuts 3 point
	        {
	            e=e-3;
	        }    
	    }
	    System.out.println(e);

	}

}
