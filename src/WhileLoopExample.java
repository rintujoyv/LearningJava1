
public class WhileLoopExample {

	public static void main(String[] args) {
		
		
		int maxCapacity = 100;
		int bucketCapacity = 10;
		int currentCapacity =30;
		
		
		while (currentCapacity< maxCapacity) {
			if (currentCapacity >= 90) {
				break;
			}
				
			currentCapacity = currentCapacity + bucketCapacity;
		}
	}

}
