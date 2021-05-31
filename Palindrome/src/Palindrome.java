import java.util.Scanner;

public class Palindrome
{
	public static boolean isPalindrome(int x)
	{

        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        
        return x == revertedNumber || x == revertedNumber/10;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a Number:");
		n= sc.nextInt();
		boolean res = isPalindrome(n);
		if (res)
			System.out.println("Given Interger "+ n +" is Palindrome");
		else
			System.out.println("Given Interger "+ n +" is not Palindrome");
		sc.close();
		
	}
}
