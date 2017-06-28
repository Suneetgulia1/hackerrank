package hack;

import java.util.Arrays;
import java.util.Scanner;

public class HackerRankinaString {

	public static void main(String[] args) {
	    int index = 0;
	    Scanner in = new Scanner(System.in);
	    int q = in.nextInt();
	    String goal = "hackerrank";
	    StringBuilder sb = new StringBuilder("");
	    for(int a0 = 0; a0 < q; a0++){
	       String sFirst = in.next();
	        if(sFirst.matches(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*")){
	            System.out.println("YES");
	        } else {
	            System.out.println("NO");
	        }

	
}

}
}