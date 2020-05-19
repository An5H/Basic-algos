
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0)
		{
		    Print obj=new Print();
		    int N;
		    N=sc.nextInt();
		    obj.printNos(N);
		    System.out.println();
		   
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java



class Print
{
    
  public void printNos(int N)
    {
        if(N > 0){
            printNos(N-1);
            System.out.print(N+" ");
        }
        return;
    }
}

