//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver_class
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            long a = Long.parseLong(str[0]);
            long b = Long.parseLong(str[1]);
            
            System.out.println(new Modulo().multiplicationUnderModulo(a, b));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Modulo
{
    static long multiplicationUnderModulo(long a, long b)
    {
        long m = (long)(Math.pow(10, 9) + 7);
        return ((a%m)*(b%m))%m;
    }
}
