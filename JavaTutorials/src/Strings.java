
public class Strings {
	
	public static void main(String[] args) {
		
		String message = " Hello World" + " !! ";
		
		// check if the string ends with this argument
		System.out.println(message.endsWith("!!"));
		// check if the string starts with this argument
		System.out.println(message.startsWith("!!"));
		// returns the length of the string
		System.out.println(message.length());
		// returns the index of the string
		System.out.println(message.indexOf("H"));
		// replaces the strings
		System.out.println(message.replace("!", "*"));

		// removes the unnessecary spaces
		System.out.println(message.trim());
				
	
	}

}
