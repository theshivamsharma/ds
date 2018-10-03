import java.util.Scanner;
public class sumofdigit
{
	public static int sod(int n)
	{
		if(n <= 0) return 0;
		return (n % 10 + sod(n/10));

	}
	public static void main(String args[])
	{
		int c = 0; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String s = sc.next();
		int a = Integer.parseInt(s);
		int r = sod(a);
		System.out.println("sum is "+ r);
	}
}