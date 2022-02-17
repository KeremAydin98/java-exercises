import java.util.Arrays;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		
		int[][] numbers = {{1,2,3},{4,5,6}};
		
		numbers[0][0] = 10;
		System.out.println(Arrays.deepToString(numbers));
	}

}
