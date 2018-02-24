public class LoopsForMultiplication {//Beginning of the class.

public static void main(String []args){//Beginning of the main method.

double result=1;//We must initialized as double because our value will be too big end of the calculation
/* Range of the double:8 bytes IEEE 754. Covers a range from 4.94065645841246544e-324d to 1.79769313486231570e+308d
 * Range of the integer:4 bytes. Covers a range from -2,147,483,648 to 2,147,483,647
 *As a result, I defined the "result" as a double instead of integer, since double covers bigger number compared to integer.
 */
for(int a=1; a<=50; a++){//To cover the loop again "a++" 
result=result*a;//values are defined in the "( )" in for loop.
}
System.out.println("The result of multiplication is: 1*2*3*4*5*6*.....*49*50 = "+ result+" (For loop)");
//(End of the for)For loops is a statement that allows code to be executed repeatedly.


double result1=1;//We must initialized as double because our value will be too big end of the calculation
double b=1;//We must initialized as double because our value will be too big end of the calculation
/*
 * The evaluation the value which must be boolean.
 * If the inputed value evaluates to true, the while statement executes
 * the statement in its block.
 * Until expression evaluates to false while continues the testing. 
 */
while(b<=50){//Beginning of the while loop.
	result1=result1*b;
	b++;//To cover while loop again
}//End of the while.
System.out.println("The result of multiplication is: 1*2*3*4*5*6*.....*49*50 = "+ result1+" (While loop)");
//End of the while loop.


double result2=1;//We must initialized as double because our value will be too big end of the calculation
double c=1;//We must initialized as double because our value will be too big end of the calculation
do{//Beginning of the do-while loop.
	result2=result2*c;
	c++;//To cover the loops again
}while(c<=50);//End of the do-while loop
System.out.println("The result of multiplication is: 1*2*3*4*5*6*.....*49*50 = "+ result2+" (Do-while loop)");
/*The difference between "do-while" and "while" is that do-while
 * evaluates its expression at the bottom of the loop instead of the top. 
 * Therefore, the statements within the do block are always executed at least once
 */
}//End of the main method.

}//End of the class.