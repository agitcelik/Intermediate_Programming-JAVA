
public class Question1Part1 {
	public double average(int[] a) {  
	    double sum = 0;

	    for(int i=0; i < a.length; i++) 

	    sum = sum + a[i]; 
	    double average = sum / a.length;; 
return average;
	 //   System.out.println("Average value of array element is " " + average);
	}
public static void main(String args[]){
	Question1Part1 test = new Question1Part1();
	int myArray[] = {1,2,3,4,5,6,7,8,9,10};
	System.out.println(test.average(myArray));

	
}
}
