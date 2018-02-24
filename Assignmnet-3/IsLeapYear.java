import java.util.Scanner;//we should import Scanner class  to get data from users

public class IsLeapYear {//Beginning of the class.
 public static int year;//I used the static method to refer main method and merely to use "year" at the main method.

 public static void main(String[] args) {//Beginning of the main method.

System.out.println("Hello for Leap year application...");//To print out to terminal that sentence.
System.out.println("Write a year below to see whether it is leap year or not.");//To print out to terminal that sentence.

Scanner input = new Scanner(System.in);//To get data from users.
 /* I use the Scanner class to input a  data to terminal with this.
  * *Also, I defined a new "input".
*/

System.out.print("Enter a year:");//To write a year to input data from users.
year = input.nextInt();// Input the value with ".nextInt"  To write console.


while(true){
	

if ((year % 400) == 0) {//I use the if statement to consider the year is visible by 400 (100 and 4) or not 
System.out.println(year+" is  leap year.");//If the year is visible by 400. That sentences will be printed out by terminal.
} //End of the  if statement.
else if ((year % 4 == 0) && (year % 100 != 0)) {//I use else if to consider the year visible only 4 but not by 100.
System.out.println(year + " is  leap year.");//If the year is visible by 4, but not by 100. That sentences will be printed out by terminal.
} //End of the else-if statement.
else//Otherwise, if the year that we were inputed, That sentences will be printed out by terminal. 
System.out.println(year + " is not leap year.");//Otherwise, That sentences will be printed out by terminal. 
//We do not have to use "{ and }" due to one line of code for else statement.
year = input.nextInt();
continue;

}
}//End of the main method
}//End of  the class.