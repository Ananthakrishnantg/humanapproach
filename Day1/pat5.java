import java.io.*;
import java.util.*;
class pat5
{
	public static void main(String[] s)
	{
		int n=4,temp=1;
		for( int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp+" ");
				temp++;
			}
		System.out.println();
		}
	}
}
			