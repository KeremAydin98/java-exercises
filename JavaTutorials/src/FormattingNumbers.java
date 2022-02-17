import java.text.NumberFormat;

public class FormattingNumbers {
	
	public static void main(String[] args) {
		
		double number;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = currency.format(number = 123567.89);
		
		System.out.println(result);
	}

}
