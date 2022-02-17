package MiniAssignments;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgagePayments {
	
	public static void main(String[] args) {
		
		Scanner Principal = new Scanner(System.in);
		System.out.print("Principal: ");
		int p = Principal.nextInt();
		
		Scanner Annual = new Scanner(System.in);
		System.out.print("Annual Interest Rate: ");
		double r = Annual.nextDouble();
		
		Scanner period = new Scanner(System.in);
		System.out.print("Period (Years): ");
		int y = period.nextInt();
		
		double monthly = r / 1200;
		
		double interest = Math.pow(1 + monthly, 12 * y);
		
		double Mortgage = (p * monthly * interest) / (interest - 1);
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		String result = currency.format(Mortgage);
		
		System.out.println("Mortgage: " + result);
		
		
	}

}
