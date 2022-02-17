import java.util.Scanner;

public class TouchScreenAdapter implements CoffeeMachineInterface{

	OldCoffeeMachine oldCoffee = new OldCoffeeMachine();
	
	public void chooseFirstSelection() {
		
		oldCoffee.selectA();
	}
	
	public void chooseSecondSelection() {
		
		oldCoffee.selectB();
	}
	
	public void displayCoffee() {
		
		System.out.println(oldCoffee.requestedCoffee);
	}
	
	
	public void main(String[] args) {
		
		Scanner requested = new Scanner(System.in);
		System.out.print("Enter your coffee order: (Press E for Ethiopian and press J for Javan)");
		String coffee = requested.next();
		
		TouchScreenAdapter adapterclass = new TouchScreenAdapter();
		
		switch(coffee) {
		
		case "E":
			adapterclass.chooseFirstSelection();
			adapterclass.displayCoffee();
			break;
			
		case "J":
			
			adapterclass.chooseSecondSelection();
			adapterclass.displayCoffee();
			break;
		
		default:
			
			System.out.println("Please choose a valid coffee");
			break;
		
		}
	}
	
	
}

