import java.awt.Point;

public class PrimitiveVsReferenceTypes {

	public static void main(String[] args) {
		
		int x,y;
		// allocate a part of the memory for the address of the object
		Point point1 = new Point(x=1, y=1);
		Point point2 = point1;
		point1.x = 2;
		
		// values are independent of each other
		System.out.println(point2);
	}
}
