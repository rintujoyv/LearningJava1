package classAndConstructor;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Student rintu = new Student();
		rintu.name="Rintu";
		rintu.maths= 34;
		rintu.english=45;
		rintu.chemistry=23;
		rintu.physics=34.5;
		rintu.biology =25;
		
		System.out.println("The percentage of the student of "+rintu.name+" is "+rintu.percentage()+"%");
		

	}

}
