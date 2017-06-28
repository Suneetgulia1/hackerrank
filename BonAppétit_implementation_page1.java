package hack;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppétit_implementation_page1 {

    static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
        int sum=0;
   for(int i=0;i<ar.length;i++)
   {
	   sum+=ar[i];
   }
   sum=sum-ar[k];
   sum=sum/2;
   return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++)
        {
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if(result==b){
        	
        	System.out.println("Bon Appetit");
        }else
        {
        System.out.println(b-result);
    }
        }
}
