import java.util.Random;
public class Question1Part2 {

/*public void randomArray(double array[]){
	for(int i =0; i<array.length; i++){
		
	}
}*/
	
public static void main(String [ ]args){
		
	double myArray[] = new double [20];
		Random myRandom = new Random ();
		for (int i = 0; i < 20; i++) {
			// Insert the random value of gen.nextDouble() to i. place of randArray;
			myArray[i] = myRandom.nextDouble();
		}
		for (int i = 19; i >= 0; i--) {
			// Print array in reversed order, starting from 19 to 0
			System.out.println("The " + i + ". number of array is: " + myArray[i]);
		}
		
	
	/*    myArray[20]= myRandom;
	for(int i=0; i<20; i++){
		myRandom=(double)(Math.random() * 14 + 1);
	}*/

}
}
/*
import java.math.*;
import java.util.Random;
public class Question1Part2 {
	public static void main(String args[]){
		
	
		double[] array = new double[20];
		Random generator = new Random();
		for (int i = 0; i < 20; i++) {
			// Insert the random value of gen.nextDouble() to i. place of randArray;
			array[i] = generator.nextDouble();
		}
		for (int i = 19; i >= 0; i--) {
			// Print array in reversed order, starting from 19 to 0
			System.out.println("The " + i + ". number of array is: " + array[i]);
	     
	        }
	    }
	
}
*
*/