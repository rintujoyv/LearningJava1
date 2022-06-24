package classAndConstructor;

public class MainCompoundInterest {

	public static void main(String[] args) {

		CompoundInterest savings = new CompoundInterest();

		System.out.println("The investment balance after 10 years is " + savings.comInterest(5000, 5, 10));

	}

}
