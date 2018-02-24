
public class LoopsForSum {

public static void main(String []args){

int sum1=0;//initialized sum with "0", since we want to sum values.
int i=5;
/*The evaluation the value which must be boolean. 
* If the inputed value evaluates to true, the while statement executes the statement in its block.
*Until expression evaluates to false while continues the testing.
*/
while(i<=100){
sum1=sum1+i;//sum+=i; // Both of them are same equations. We can use one of them to print sum to terminal.
if(i==100){
/*if i end up with 100, terminal was printed out "100+" and I wanted to get rid of "+"
*As a result, I used if else statement to be printed out just "100" to get better syntax to be also written well.
*/
System.out.print(i);//Print out just "100" not "100+"
}
else{// To print out other values with "+".
System.out.print(i+"+");//All value will take a "+" after printed out.
}
i=i+5;//In every loop, 5 will be added b.
}
System.out.println("="+sum1+"   End of the While loop   ");

//End of the while loop.


int sum2=0;//sum2 must be initialized from 0.
for(int a=5;a<=100;a=a+5){//a must be initialized in For loop.
sum2=sum2+a;//In every loop, 5 will be added a.
if(a==100){
System.out.print(a);//Print out just "100" not "100+"
}
else{// To print out other values with "+".
System.out.print(a+"+");
}
}//End of the for loop.
System.out.println("="+sum2+"  End of the For loop  ");
//End of the for loop.


int sum3=0;
int b =5;
do{//Beginning of the do-while loop.
	sum3=sum3+b;//To add b to sum3 in every loop.
	b=b+5;//In every loop, 5 will be added b.
if(b==100)//To print out just 100 not "100+".
System.out.print(b);
else//Otherwise. "+" should be added in front of the inputed numbers.
System.out.print(b+"+");
}while(b<=100);//To check whether value of b is bigger than 100 or not.

System.out.println("="+sum3+"  End of the do-while loop  " );

}
}