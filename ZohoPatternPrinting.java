package zohointerview;
import java.util.Scanner;

public class ZohoPatternPrinting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		for (int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--)
			{
				if(j==i)
				{
					for(int k=i;k>=1;k--)
					{
						System.out.print(i + " ");
					}
					break;
				}
				else
				{
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
