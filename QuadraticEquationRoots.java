//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0)
		{
		    Quadratic  obj=new Quadratic();
		    int a,b,c;
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    obj.quadraticRoots(a,b,c);
		    System.out.println();
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Quadratic 
{
    public void quadraticRoots(int a,int b,int c)
    {
        double D = b*b - 4*a*c;
        double root1 = 0, root2 = 0;
        root1 = Math.floor((-b + Math.sqrt(D))/(2*a));
        root2 = Math.floor((-b - Math.sqrt(D))/(2*a));
        if(D < 0){
            System.out.print("Imaginary");
        }
        if(D > 0){
            System.out.print((int)root1+" "+(int)root2);
        }
        if(D == 0){
            System.out.print((int)root1+" "+(int)root1);
        }
    }
}
