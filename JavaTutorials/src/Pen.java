
public class Pen {
	
	String type = "marker";
	String color = "purple";
	float tip = 0.7F;
	
	static boolean clicked = false;
	
	public static void click() {
		clicked = true;
	}
	
	public static void unclicked() {
		
		clicked = false;
	}
}

