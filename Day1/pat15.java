import java.io.*;
import java.util.*;
class pat15
{
	public static void main(String[] s)
	{
		int n=5;
		for( int i=1;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
			