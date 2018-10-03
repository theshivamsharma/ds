import java.util.Scanner;
public class revarray
{
	public static void swap(int []a, int i, int j)
	{
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	public static void reverseA(int []a,int s,int e)
	{
		if(e < 0) return;
		if(s < e)
		{
			swap(a,s,e);
			reverseA(a,s + 1, e - 1);
		}

	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int []a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		reverseA(a, 0, n - 1);
		for(int i = 0; i < n; i++) System.out.print(a[i]+" ");
	}
}