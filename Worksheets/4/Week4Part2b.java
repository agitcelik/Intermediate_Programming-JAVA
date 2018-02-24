import java.util.Scanner;//To input data from users I defined Scanner class.
public class Week4Part2b {//Beginning of the class.
	public static void main(String []args){//beginning of the main method
		int i=0;
		System.out.print("Please enter a value: ");//To enter a value
		Scanner input = new Scanner(System.in);//To input data from users
		//To increase k and to get rid of infinite result
		while((i=input.nextInt())>=0){//To determine whether value is bigger than zero or not
System.out.println("You entered: "+i);
//To stop infinite loop.
			
		}//End of the while loop
			System.out.println("Negative Number");//Print out "Negative Number." 
	}//End of the main method.
}//End of the class.
