import java.util.Scanner;
public class search
{
	public static boolean search(int []a, int m,int n)
	{
		if(n < 0) return false;
		else if(a[n] == m) return true;
		n = n - 1;
		return search(a,m,n);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int []a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		System.out.println("Enter the number to search");
		int m = sc.nextInt();
		System.out.println(search(a,m,n - 1));
	}
}