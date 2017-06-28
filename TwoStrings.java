package hack;

import java.util.HashSet;
import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
int c=scan.nextInt();
	while(c>0)
	{
		int flag=0;
		String s1=scan.next().toLowerCase();
		int l1=s1.length();
		
		String s2=scan.next().toLowerCase();
        int l2=s2.length();
		 
        HashSet hs= new HashSet();
        for(int i=0;i<s1.length();i++)
        {
        	hs.add(s1.charAt(i));
        }
        
        for(int i=0;i<s2.length();i++)
        {
        if(hs.contains(s2.charAt(i)))
        	{
        	flag=1;
        	}
       }
        
       if(flag==1){ System.out.println("YES");}
       else{System.out.println("NO");}

	
        c--;

	}
        
        

	}

	
	}


