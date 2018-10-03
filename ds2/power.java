import java.util.Scanner;
public class power 
{
	private static int t;
	power(int c)
	{
		t = c;
	}
	public static int powerfind(int x,int y)
	{
		if(y == 0) return x/t;
		return powerfind(x*t,--y);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x");
		int x = sc.nextInt();
		System.out.println("Enter the y");
		int y = sc.nextInt();
		power o = new power(x);
		int r = o.powerfind(x,y);
		System.out.println("The ans is "+r);
	}
}