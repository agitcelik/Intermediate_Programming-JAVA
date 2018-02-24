

import java.util.Scanner;// I have to import this class to input a data from console.

public class TemperatureConverter {//Beginning of the class.

public static float value;// I defined "value" as a float and use the static method to refer main method.

	public static float CelsiusToFahrenheit(float degree){//Celsius is converted to Fahrenheit by this method.
		float resultDegree = (float) (1.8 * degree + 32);
	return resultDegree;// it must be return the result due to "public static" method.
}
    public static float FahrenheitToCelsius(float degree){//Fahrenheit is converted to Celsius by this method.
    	float resultDegree = (float) ((degree - 32) / 1.8);
		return resultDegree;//// it must be return the result due to "public static" method.
    }
public static void main(String args[]){//Beginning of the main method

    
	TemperatureConverter valueFahrenheit = new TemperatureConverter();
	TemperatureConverter valueCelsius= new TemperatureConverter();

	
	System.out.println("Welcome to the temperature conversion application!.");
	Scanner input = new Scanner(System.in);//input a  data from consele with this.
    System.out.print("How do you like input temperature degree?");
    
    char calculatorType;// I defined calculatorType as a char
    calculatorType=input.next().charAt(0);// Ýnput it with ".next().charAt(0);" To write console.
    if(calculatorType=='C'){//I  use the if conditioanl to input a Celsius...
    	System.out.print("Please input the degree in Celsius:");//it prints out "Please input the degree in Celsius:".
    	
    	value = input.nextFloat();// Input the value.  To write console.
    	System.out.println("The temperature you have intered in Celsius is: "+ valueFahrenheit.CelsiusToFahrenheit(value)+ " Fahrenheit.");
	 }
   
    if(calculatorType=='F'){//it prints out "Please input the degree in Fahrenheit:".
        System.out.print("Please input the degree in Fahrenheit:");
    	value= input.nextFloat();//Input the value.  To write console.
    System.out.println("The temperature you have intered in Fahrenheit is: "+ valueCelsius.FahrenheitToCelsius(value)+ " Celsius.");
    }

    /*
     * t < -20 : very cold
     *-20 <= t <= 0 : cold
     * 0 < t <= 20: mild
     *20 < t <= 35: hot
     *t > 35: very hot
    */
    
    if(value< -20){
    	System.out.println("It is very cold.");
    }
    else if(value <= -20 && value <= 0){
    	System.out.println("It is cold.");
    }
    else if(value<0 && value <=20){
    	System.out.println("It is mild.");
    }
    else if(value<20 && value<= 35){
    	System.out.println("It is hot");
   }
    else{
    	System.out.println("It is very hot.");
    }
    
    
    System.out.println("Have a nice day!");
   
}//End of the class.
  
}//End of the main method.

