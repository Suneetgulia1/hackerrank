package hack;

import java.util.Scanner;

public class CamelCase {
static int count =1;
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s= scan.next();
    for(int i=0;i<s.length();i++)
    {
    	  for(int j=65;j<91;j++)
    	    {
    	       if((int)s.charAt(i)==j)
    	       {
    	    	   count++;
    	       }
    	    }
    	    
    }
    System.out.println(count);
	}
	

}
