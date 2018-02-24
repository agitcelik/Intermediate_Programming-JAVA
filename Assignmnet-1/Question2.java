
public class Question2 {//Begining of the class.

	public static double total;//To refer main method, we have to use "public static" method. Define f as a double.
	public double value(long x,short y ,float z){//Use method of public double, if x is long, z is float, y is short, and f is double.
	double sum = (double)((3*(z*z))-(10*(x*x*x))+(100*(y*y)))/((y*y*y*y)*(z*z)*(x*x*x));//Public method must return, so we use "return".
     return sum;
	/*
 * Double is already bigger than long,short,float, so we can compute our function without converting anything.
 * Range of double (Max--min): (4.9e-324) to(1.8e+308) 
 * Range of float (Max--min): (1.4e-045) to	(3.4e+038)
 * range of long (Max--min): (-2^63) to 	(+2^63-1)
 * range of short (Max--min): (-2^15) to (+2^15-1)
 * Double  is bigger than other, so  we calculate our function without any converting.
 */
	}
public static void main(String []args){//Beginning of the main method.

	Question2 test = new Question2();//Creating a "test" object to compute value of "value".
	  
	total = test.value((long)1,(short)2,(float) 7);//we already defined f before as a double with "public static" method.
	/*  
	 *We must write (short) to compute our values, because it is less than int and others.
	 */
	
	System.out.println("<Question2>The value of f is: "+  total);//To print value of the f to screen.
	
}//End of the main method.
}//End of the class of the class "Question2".