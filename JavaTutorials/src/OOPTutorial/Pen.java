package OOPTutorial;

public class Pen {
	
	// attributes
	String type = "marker";
	String color = "purple";
	float tip = 0.7F;
	
	static boolean clicked = false;
	
	// actions
	public static void click() {
		clicked = true;
	}
	
	public static void unclick() {
		
		clicked = false;
	}
}

