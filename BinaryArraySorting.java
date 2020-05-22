//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split(" ");
            int n =Integer.parseInt(st[0]);
            
            int arr[] = new int[n];
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st[i]);
            new BinarySort().binSort(arr, n);
            for(Integer x: arr)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class BinarySort
{
    static void binSort(int arr[], int n)
    {
        Arrays.sort(arr);
    }
}

