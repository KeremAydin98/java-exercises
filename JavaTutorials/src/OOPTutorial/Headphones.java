package OOPTutorial;

public class Headphones {
	
	// attributes
	String color = "black";
	String[] activities = {"music","phonecall","games"};
	String price = "expensive";
	
	boolean power = false;
	int volume = 0;
	
	// actions
	public void turn0n() {
		
		power = true;
	}
	public void turn0ff() {
		
		power = false;
		
	}
	public void volumeUp() {
		
		volume ++;
	}
	public void volumeDown() {
		
		if(volume != 0) {
			
			volume --;
			
		}
	}
	

}
