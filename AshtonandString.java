package hack;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class AshtonandString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		int testcase=scan.nextInt();
		
		while(testcase>0)
		{
			String s1= scan.next();
			int k=scan.nextInt();
			TreeSet<String> ts = new TreeSet<String>();
			for(int i=0;i<s1.length();i++)
			{
				for(int j=i;j<=s1.length();j++)
				{
					ts.add(s1.substring(i, j));
				}
			}
			
			
			String str=ts.toString().replaceAll(",","").replaceAll(" ","");
			System.out.println(str.charAt(k));			
			
		}
		
		}

}
