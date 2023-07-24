import java.io.*;
import java.util.*;
class pat1
{
	public static void main(String[] s)
	{
		int n=5;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||i==n||j==0||j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}