package MiniAssignments;

import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		Scanner numberscanner = new Scanner(System.in);
		System.out.print("Number: ");
		int number = numberscanner.nextInt();
		
		if(number % 5 == 0) {
			
			System.out.print("Fizz");
			
		}
		if(number % 3 == 0) {
			
			System.out.print("Buzz");
			
		}
		else if(number % 3 != 0 && number % 5 != 0){
			
			System.out.print(number);
		}
		
	}

}
