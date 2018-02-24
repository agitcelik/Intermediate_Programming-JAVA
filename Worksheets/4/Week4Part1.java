import java.util.Scanner;//To input data from users I defined Scanner class.
public class Week4Part1 {//Beginning of the class
public static void main(String []args){//beginning of the main method.
	int n=4;
	int x=0;
	switch (n) {
	case 1: x=1;
	break;//we have to use break to get rid of this part of the code
	case 2: x=2;
	break;//if we do not use break, program executes again and again.
	case 3: x=3;
	break;//if we do not use break, code never give a 
	case 4: x=4;
    break;//we must use the break.
	}
System.out.println("The value of n is:"+n+" The value of x is: "+x+" For Swicth-case");
/*These code prints out; 
 * if n=1,then The value of n is:1 The value of x is: 1
 *if n=2,then The value of n is:2 The value of x is: 2
 *if n=3,then The value of n is:3 The value of x is: 3
 *if n=4, then The value of n is:4 The value of x is: 4
*/

//Beginning of the if-else statement to convert it from swicth, break.
Scanner input = new Scanner(System.in);
System.out.print("Enter a number to compute value of n: ");//To enter a value
n=input.nextInt();//input the "n"
if(n==1){
x=1;
	System.out.println("n= "+x+" (For if-else statement)");
}
	else if(n==2){
		x=2;
	System.out.println("n= "+x+" (For if-else statement)");
	}
	else if(n==3){
		x=3;
		System.out.println("n= "+x+" (For if-else statement)");
		}
	else{//suppose that value was given "n=4"
		x=4;
				System.out.println("n= "+x+" (For if-else statement)");
	}
}
}