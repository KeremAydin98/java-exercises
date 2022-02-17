
public class Round {
	
	public static void main(String[] args) {
		
		float number = 1.4F;
		
		int first = (int)Math.floor(number);
		int second = (int)Math.round(number);
		int third = (int)Math.ceil(number);
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		double random_number = Math.random();
		
		System.out.println(random_number);

	}
}


