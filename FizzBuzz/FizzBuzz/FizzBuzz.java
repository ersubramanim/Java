package FizzBuzz;
import java.util.*;
/*import java.util.ArrayList;
import java.util.List; */


public class FizzBuzz {
	public static ArrayList<String> fizzbuzz(int n)
	{
		ArrayList<String> result=new ArrayList<String>();
		for(int i = 1; i<=n; i++)
		{
			if (i%5==0 && i%3==0)
				result.add("Fizzbuzz");
			else if (i%3==0)
				result.add("Fizz");
			else if (i%5==0)
				result.add("Buzz");
			else
				result.add(Integer.toString(i));
		}
		return result;
	}
	public static void main( String args[])
	{
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the N vaule:");
		n= scan.nextInt();
		scan.close();
		ArrayList<String> res=new ArrayList<String>();
		res =fizzbuzz(n);
		System.out.println(res);  
		/*for(int i=0;i<res.size();i++)
		{
		    System.out.print(res.get(i)+" ");
		} */
	}

}
