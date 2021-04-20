import java.text.DecimalFormat;
import java.util.Scanner;  
public class NumberToWord   
	{  
		private static final String[] twodigits = {"", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};  
		private static final String[] onedigit = {"", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};  
		private NumberToWord()   
		{  
		}  
		private static String convertUptoThousand(int number)   
		{  
			String soFar;  
			if (number % 100 < 20)  
			{  
			soFar = onedigit[number % 100];  
			number = number/ 100;  
			}  
			else   
			{  
			soFar = onedigit[number % 10];  
			number = number/ 10;  
			soFar = twodigits[number % 10] + soFar;  
			number = number/ 10;  
			}  
			if (number == 0)   
			return soFar;  
			return onedigit[number] + " Hundred " + soFar;  
		}  
		public static String convertNumberToWord(long number)   
		{  
			if (number == 0)   
			{   
				return "zero";   
			}  
			String num = Long.toString(number);  
			String pattern = "000000000000";  
			DecimalFormat decimalFormat = new DecimalFormat(pattern);  
			num = decimalFormat.format(number);  
			int billions = Integer.parseInt(num.substring(0,3));  
			int millions  = Integer.parseInt(num.substring(3,6));  
			int hundredThousands = Integer.parseInt(num.substring(6,9));  
			int thousands = Integer.parseInt(num.substring(9,12));  
			String tradBillions;  
			switch (billions)   
			{  
				case 0:  
					tradBillions = "";  
					break;  
				case 1 :  
					tradBillions = convertUptoThousand(billions)+ " Billion ";  
					break;  
				default :  
					tradBillions = convertUptoThousand(billions)+ " Billion ";  
			}  
			String result =  tradBillions;  
			String tradMillions;  
			switch (millions)   
			{  
				case 0:  
					tradMillions = "";  
					break;  
				case 1 :  
					tradMillions = convertUptoThousand(millions)+ " Million ";  
					break;  
				default :  
					tradMillions = convertUptoThousand(millions)+ " Million ";  
			}  
			result =  result + tradMillions;  
			String tradHundredThousands;  
			switch (hundredThousands)   
			{  
				case 0:  
					tradHundredThousands = "";  
					break;  
				case 1 :  
					tradHundredThousands = "One Thousand ";  
					break;  
				default :  
					tradHundredThousands = convertUptoThousand(hundredThousands)+ " Thousand ";  
			}  
			result =  result + tradHundredThousands;  
			String tradThousand;  
			tradThousand = convertUptoThousand(thousands);  
			result =  result + tradThousand;  
			return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");  
		}  
		public static void main(String args[])   
		{  
			int num;
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter a number:");
			num = sc.nextInt();
			System.out.println(convertNumberToWord(num));  
			sc.close();	
		}  
}  