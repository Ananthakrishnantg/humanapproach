import java.io.*;
import java.util.*;
class pat9
{
	public static void main(String[] s)
	{
		int n=4,i,j,k;
		for( i=1;i<=n;i++)
		{
			for( k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for( j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
		for(i=n-1;i>=1;i--)
		{
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}
				