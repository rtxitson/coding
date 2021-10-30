import java.util.*;
import java.io.*;

class RodCutting
{
	/* Returns the best obtainable price for a rod of length n and price[] as prices of different pieces */
	public static int cutRod(int price[],int n)
	{
		int val[] = new int[n+1];
		val[0] = 0;
    
		// Build the table val[] in bottom up manner and return the last entry from the table
		for (int i = 1; i<=n; i++)
		{
			int max_val = Integer.MIN_VALUE;
			for (int j = 0; j < i; j++)
				max_val = Math.max(max_val,
								price[j] + val[i-j-1]);
			val[i] = max_val;
		}

		return val[n];
	}
  
	public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
    int a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
		System.out.println("Maximum Obtainable Value is "+cutRod(a, n));
	}
}
