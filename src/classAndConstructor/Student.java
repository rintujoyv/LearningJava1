package classAndConstructor;

public class Student {
	
	String name;
	double maths;
	double english;
	double chemistry;
	double physics;
	double biology;
	
	
	double percentage()
	 {
		double result = ((maths+english+chemistry+physics+biology)/500)*100;
		return result;
	
	}
	
	double percentage(double maths, double english,double chemistry, double physics, double biology) {
		double result = ((maths+english+chemistry+physics+biology)/500)*100;
		return result;

	}

}
