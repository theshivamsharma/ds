import java.util.Scanner;
public class fibbo
{
	public static int fibbona(int n)
	{
		if(n == 0 || n == 1) return n;
		return fibbona(n - 1) + fibbona(n - 2); 
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int f = fibbona(n);
		System.out.println(n+"th number in series is "+f);
	}
}