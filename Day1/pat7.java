import java.io.*;
class pat7
{
	public static void main(String[] s)
	{
		int n=5;
		for( int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int z=2;z<=i;z++)
			{
				System.out.print(z);
			}
		System.out.println();
		}
	}
}
		