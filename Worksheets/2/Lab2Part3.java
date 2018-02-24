
public class Lab2Part3 {//f(x, y, z) = x^4 + x + 3y^3 − 100x2 + z
public double number1(int x,int y ,int z){
	return (double) ((x*x*x*x)+x+(3*(y*y*y)-(100*(x*x))+z));//must be double
}
public double number2(int x,int y , int z ){//f(x,y,z)= (3x+4y)/(10z+10x)
	return  (double)((3*x+4*y)/(10*z+10*x));//must be double
}
public static void main(String []args){
	Lab2Part3 test1 = new Lab2Part3();
	double a = test1.number1(2, 3, 4);
	System.out.println("Value of Question1 ;"+ a);

	Lab2Part3 test2 = new Lab2Part3();
	double b = test2.number2(2, 3, 4);
	System.out.println("Value of Question2;"+b);
	
}

}
