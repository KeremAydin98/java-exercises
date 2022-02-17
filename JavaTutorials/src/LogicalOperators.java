

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		int temperature = 22;
		
		// and operator
		boolean isWarm = temperature > 20 && temperature > 30;
	
		System.out.println(isWarm);
		
		int height = 10000;
		
		// or operator
		boolean cold = (height > 1500) || (temperature < 30);
		
		System.out.println(cold);

		
	}

}
