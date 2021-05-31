import java.util.*;
public class FactorialTrailsZero
{
	public static int facTrailsZero(int n)
	{
		int res=0;
		System.out.println(n);
		while (n>0)
		{
			n /=5;
			System.out.println(n);
			res +=n;
		}
		return res;
	}
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n vaule:");
		n= sc.nextInt();
		System.out.println("FactorailTrailsZero of "+n+"! is " + facTrailsZero(n));
		sc.close();
	}

}
