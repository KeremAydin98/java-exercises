
public class ObjectTypes {

	public static void main(String[] args) {
		
		byte age = 30;
		// we add L in order for Java to see this object's type as long
		long viewsCount = 3_123_456_789L;
		// same for float if we do not write F Java will see this object's type as double
		float price = 10.99F;
		char letter = 'A';
		boolean isEligible = false;
		
		
		System.out.println(age);
		System.out.println(viewsCount);
		System.out.println(price);
		System.out.println(letter);
		System.out.println(isEligible);

	}
}
