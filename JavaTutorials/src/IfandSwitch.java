
public class IfandSwitch {
	
	public static void main(String[] args) {
		
		int temp = 32;
		
		if (temp > 30) {
			System.out.println("It's a hot day");
		}
		else if (temp < 30 && temp > 20) {
			System.out.println("It's a warm day");
		}
		else {
			System.out.println("It's a cold day");
		}
	
		String role = "admin";
		
		switch (role) {
		case "admin":
			System.out.println("You're an admin");
			break;
		case "moderator":
			System.out.println("You're a moderator");
			break;
		default:
			System.out.println("You're a guest");
			break;
		
		}
	}
}
