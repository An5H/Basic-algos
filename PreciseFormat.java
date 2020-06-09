//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


 // } Driver Code Ends


//User function Template for Java

class Geeks{
    
    static void printInFormat(float a, float b){
        float result = a/b;
        System.out.format("%.7f %.3f", result, result);
        System.out.println();
        
        // Your code here to print upto 3 decimal places
        
    }    
    
}

// { Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		
		while(testcases-- > 0){
    		float a = sc.nextFloat();
    		float b = sc.nextFloat();
    		
    		Geeks g = new Geeks();
    		g.printInFormat(a, b);
		
		}
		
	}
}
  // } Driver Code Ends
