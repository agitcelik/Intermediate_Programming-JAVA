
public class Question1Method3 {//Beginning of the class.
	public float number3(long x , long y){//Method 2:Use public float method, if x and y are long, but f is float.
	float sum = (x * x * x * x) + (3 * (y * y * y)) - (100 * (x * x));
	return sum;
	/*
	 * Float is already bigger than long, so we dont have to convert anything to compute our value of function.
	 *While range of long is; (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807),
	 * range of float is; (	1.4e-045 to 3.4e+038)..
	 */
	}
	
	public static void main(String []args){//Beginning of the main method.
		float sum;
		Question1Method3 test3 = new Question1Method3();
		sum=test3.number3(11, 3);
		System.out.println("<Method3>The value of f is: "+ sum);//To print out the value of f to editor
	}//End of the main method.
}//Enf  od the class.
