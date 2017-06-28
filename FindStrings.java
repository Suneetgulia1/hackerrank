package hack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class FindStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
        TreeSet ts = new TreeSet();
        
		int totalstrings=scan.nextInt();
while(totalstrings>0){		
		String temp;
		String s1=scan.next();
        int len=(int) Math.pow(2, s1.length());
        
        for(int i=0;i<len;i++)
        {
        	temp="";
        	for(int j=0;j<s1.length();j++)
            {
            	if((i&1<<j)!=0)
            	{
            		temp+=s1.charAt(j);
            	}
           
            }
            	ts.add(temp);
        }
        
	
       

        totalstrings--;
}
int queries= scan.nextInt();

ArrayList al= new ArrayList(ts);

	while(queries>0)
	{
	
	int qn=scan.nextInt();
	if(qn<al.size())
	System.out.println(al.get(qn));
	else
		System.out.println("INVALID");
	queries--;
	}

	
	
	}

}
