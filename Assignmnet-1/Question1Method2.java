
public class Question1Method2 {//Beginning of the main method.
	public long number2(long y , float x){//Method 2:Use public long method, if x is float and y is long, but f is long.
	    long f = (long)((x * x * x * x) + (3 * (y * y * y)) - (100 * (x * x)));
		return f;//This public method must return, so we use "return".
		/*I defined f as a long. If I did not convert f to long , my function would not work and we cannot convert a varible from float to long
		  *,because long is less than float... It must be bigger than to compute our function,so I make f convert long.. 
		  *While range of long is; (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807), 
		  *range of float is; (	1.4e-045 to 3.4e+038)..
		  *
	*/
	}
	public static void main(String []args){//Beginning of the main method.
		long f;
		Question1Method2  test2 = new Question1Method2 ();
		f=test2.number2(7,2);
		System.out.println("<Method2>The value of f is: " + f);//To print out the value of f to editor
		
	}//End of the main method.
}//End of the class of the class "Question1Method2".