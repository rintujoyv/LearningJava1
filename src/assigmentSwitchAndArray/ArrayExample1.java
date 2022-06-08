package assigmentSwitchAndArray;

public class ArrayExample1 {

	public static void main(String[] args) {
		
		
		//We can declare array in two ways in java. 
		
		
		String[] array;
		//or
		String [] array1;
		
		String array2[];
		
		
		
		array = new String[3]; //We can declare and initialize a length of the array
							//It allocate memory for 3 Strings
							// We have initialized a variable "array" with length "3" without any value
							//If we are not initializing a value in a variable, it will print the address of that location
							//"String" datatype will print 	“null” value if we have not initialize in an array
							//"Int" datatype will print “0” value if we have not initialize in an array

		
		String[] array3 = new String[4]; 
		
		
	
		String[] array4 = {"one","two","three"}; //We can also initialize an array with values in Curly brackets.
		
		//We can populate an array. The next few lines assign values to each element of the array
		
		array3[0] = "One";
		array3[1] = "Two";
		array3[2] = "Three";
		array3[3] = "Four";
			
		//For populating an array we need to know first the index of the array
		//Index value will be always be numerical, it will be an integer value which always starts with “0”.


		//If length of an array is 'n' then the index numbers for this will be a[0], a[1]….a[n-1]
		//Index tells you the position of the value where we stored.

		//2Q Reverse the numbers
		
		int[] num = new int[4];
		
		int[] num1 = {1,2,3,4};
		
		System.out.println("Numbers in order");
		
		for(int i=0;i<num1.length;i++) {
			System.out.println(num1[i]);
		}
		
		System.out.println("Numbers in reverse order");
		
		for(int i=num1.length-1;i>=0;i--) {
			System.out.println(num1[i]);
		}
		
				
	}

}
