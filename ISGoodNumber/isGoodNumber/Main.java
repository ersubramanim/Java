package isGoodNumber;
import java.util.Scanner;

public class Main {
	public static void main( String[] args) {
		
	int N;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number:");
	N = sc.nextInt();
	Solution s= new Solution();
	int res = s.rotatedDigits(N);
	System.out.println("\n" +res);
		sc.close();
	}

}
