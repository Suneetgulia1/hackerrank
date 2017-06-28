package hack;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class breakingTheRecords_implementation_page1{

     static int[] getRecord(int[] s){
        int[] result = new int[2];
        int countMax=0, countMin=0 ,max = s[0], min = s[0];
        for(int i=1; i< s.length; i++){
           if(s[i] > max){ max = s[i];  countMax++; }
           if(s[i] < min){ min = s[i];  countMin++; }
        }
        result[0] = countMax; result[1] = countMin;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
