package assignmentClassAndMethods;

public class RectangleMain {

	public static void main(String[] args) {

		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle();

		// int areaOfRectangle = rec1.area(4, 5);

		System.out.println("The area of rectangle having side(4,5) : " + rec1.area(4, 5));
		System.out.println("The area of rectangle having side(5,8) : " + rec2.area(5, 8));
	}

}
