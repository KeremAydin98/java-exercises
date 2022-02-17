package OOPTutorial;

public class Main {
	
	public static void main(String[] args) {
		
		Pen pen = new Pen();
		
		System.out.println(pen.type);
		System.out.println(pen.color);
		System.out.println(pen.tip);
		
		System.out.println(pen.clicked);
		
		pen.click();
		
		System.out.println(pen.clicked);
		
		Headphones headphone = new Headphones();
		
		System.out.println(headphone.color);
		
		for(String activity:headphone.activities) {
			
			System.out.print(activity + " ");

		}
		
		System.out.println("");
		System.out.println(headphone.price);
		
		System.out.println("Power: " + headphone.power);
		System.out.println("Volume: " + headphone.volume);
		
		
		headphone.turn0n();
		headphone.volumeUp();
		
		System.out.println("Power: " + headphone.power);
		System.out.println("Volume: " + headphone.volume);		
		

	}

}
