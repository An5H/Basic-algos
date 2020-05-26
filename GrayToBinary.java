//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends





//User function Template for Java

class BitWise{
    
    // function to conver given N Gray to Binary
    public static int grayToBinary(int n) {
        String str = Integer.toBinaryString(n);
        return Integer.parseInt(graytoBinary(str), 2);
    }
       
    public static String graytoBinary(String gray) 
    { 
        String binary = ""; 
  
        // MSB of binary code is same 
        // as gray code 
        binary += gray.charAt(0); 
  
        // Compute remaining bits 
        for (int i = 1; i < gray.length(); i++) { 
            // If current bit is 0, 
            // concatenate previous bit 
            if (gray.charAt(i) == '0') 
                binary += binary.charAt(i - 1); 
  
            // Else, concatenate invert of 
            // previous bit 
            else
                binary += flip(binary.charAt(i - 1)); 
        } 
  
        return binary; 
    } 
    
    public static char xor_c(char a, char b) 
    { 
        return (a == b) ? '0' : '1'; 
    } 
  
    // Helper function to flip the bit 
    public static char flip(char c) 
    { 
        return (c == '0') ? '1' : '0'; 
    } 
}




// { Driver Code Starts.

class GFG {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    
		    BitWise obj = new BitWise();
		    
		    System.out.println(obj.grayToBinary(n));
		}
	}
}
  // } Driver Code Ends
