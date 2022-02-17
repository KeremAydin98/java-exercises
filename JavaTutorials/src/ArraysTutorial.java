import java.util.Arrays;

public class ArraysTutorial {
	
	public static void main(String[] args) {
		
		int[] numbers = {3, 1, 2, 5, 4};
		
		// arrays have a fixed length
		int length = numbers.length;
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(length);
	}

}
