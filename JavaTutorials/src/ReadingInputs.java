import java.util.Scanner;

public class ReadingInputs {
	
	public static void main(String[] args) {
		
		Scanner agescanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		byte age = agescanner.nextByte();
		
		Scanner namescanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = namescanner.nextLine().trim();
		
		System.out.println("You are " + age + " years old. "
				+ "And your name is " + name + ".");
	}

}
