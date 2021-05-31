package MyPower;
import java.util.*;

public class MyPower
{
	public static double myPow(double x, int n) 
	{
        double ans = 1.0;
        long num = n;
        if (n < 0)
            num = -1 * num;
        while (num > 0) 
        {
            if (num % 2 == 0) 
            {
                x = x * x;
                num = num / 2;
            } 
            else 
            {
                ans = ans * x;
                num = num - 1;
            }
        }
        if (n < 0) 
        {
            return (double)(1.0) / (double)(ans);
        }
        return ans;
    } 
	public static void main(String[] args)
	{
		double x;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter pow (x , n):");
		x= sc.nextDouble();
		n=sc.nextInt();
		sc.close();
		System.out.println("pow("+x+","+n+") is "+ myPow(x,n));
		
	}

}
