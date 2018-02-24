/*
 * Sources:
 * http://java2s.com/Tutorials/Java/Java_Data_Types/What_are_the_primitive_data_types_in_Java.htm
 */
public class Question1Method1 {//Beginning of the main method.
	public short number1(int x, int y){//Method 1:Use public short method, if x and y are integers, but f is short.
	   short myNumber = (short)((x * x * x * x) + (3 * (y * y * y)) - (100 * (x * x)));
		return myNumber;//This public method must return, so we use "return".
		/*I defined myNumber as a short to convert my function from short to int. Otherwise I cannot compute the following function
		 * ,since we cannot convert our function from short to int.
		 * While short values have size of 1g-bit, integers have 32-bit, so reason why we cannot convert from short to iny  is because, integers is
		 * bigger than shorts...
		 * Min--Max value of short:(-2^15)--(+2^15 - 1)-->Range
		 * Min--Max value of integer:(-2'31)--(+2^31-1)-->Range
		 */
	}
	public static void main(String []args){//Beginning of the main method.
		short f;//Define f as a short.
		Question1Method1 test1 = new Question1Method1();//Creating a "test1" object to compute value of number1.
		short sum1;
		sum1= (short)test1.number1(2, 3);
		f=sum1;
		System.out.println("<Method1>The value of f: " + f);//To print out the value of f to editor
}//End of the main method.
}//End of the class of the class "Question1Method1".
