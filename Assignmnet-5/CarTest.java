import java.util.Scanner;//To input data from users we have to import Scanner class from library.
public class CarTest {//Beginning of the class.
	public static void main(String[] args) {//Beginning of the method.
		Scanner input = new Scanner(System.in);////To input data from users

		Car carDefaultConstractor = new Car();//Empty constructor
		Car carDefaultConstractor1 = new Car("Opel");//One variable constructor(Company of car)
        Car carDefaultConstractor2 = new Car("Opel", "Red");//Two variable constructor(Company and color of car)
        Car carDefaultConstractor3 = new Car("Opel", "Red", 2015);//Three variable constructor(Company,color and model of car)
        Car carDefaultConstractor4 = new Car("Opel", "Red", 2015, 32.5);//Four variable constructor(Company,color,model and price of car)
        Car carDefaultConstractor5 = new Car("Opel", "Red", 2015, 32.5, "Dizel");//Five variable constructor(Company,color,model,price and fuel type of Car)

		System.out.println(carDefaultConstractor.toString());//To call the empty constructor with toString method.
	
		System.out.println("Which model do you want?");
        String modelInput = input.next();//To input data from users.
		carDefaultConstractor1.setModel(modelInput);//To call the variable constructor after setting it.
		
		System.out.println("And, Which color do you want?");
		String colorInput = input.next();//To input data from users.
		carDefaultConstractor1.setColor(colorInput);//To call the variable constructor after setting it.
		
		while (true) {//Beginning of the while loop to enter a infinite loop.
			System.out.println("Please enter model of car which you want?");
			int yearInput = input.nextInt();//To input data from users.
			if (carDefaultConstractor1.checkYearAvaiability(yearInput)) {//if year less than 2015, this method will warn us to input a year that must be greater than 2015
				carDefaultConstractor1.setYear(yearInput);//To call the variable constructor after setting it.
				break;//To break after inputting.
			} else {//Else, this method will warn us to input a year that must be greater than 2015
	System.out.println("Entered a year is above the year of 2015, so it must've be entered greater than 2015.");
			}
		}//End of the while loop.

		System.out.println("Please enter a fuel type of car that you want.");
		String fuelTypeInput = input.next();//To input data from users.
		carDefaultConstractor1.setFuelType(fuelTypeInput);//To call the variable constructor after setting it.
		System.out.println("And, Which price range do you want?");
		double priceInput = input.nextDouble();//To input data from users.
		carDefaultConstractor1.setPrice(priceInput);//To call the variable constructor after setting it.
		System.out.println("Thanks for entering information we will check this properties of car..");
		// System.exit(0);
		System.out.println("\n");//To pass one line of code.
		// String knownModel=carDefaultConstractor1.getModel();
		System.out.println("Please enter another knowledge about " + carDefaultConstractor1.getModel() + " below.");

		System.out.println("And, Which color do you want?");
		String colorInput1 = input.next();//To input data from users.
		carDefaultConstractor2.setColor(colorInput1);//To call the variable constructor after setting it.

		while (true) {//Beginning of the while loop to enter a infinite loop.
			System.out.println("Please enter model of car which you want?");
			int yearInput = input.nextInt();//To input data from users.
			if (carDefaultConstractor2.checkYearAvaiability(yearInput)) {//if year less than 2015, this method will warn us to input a year that must be greater than 2015
				carDefaultConstractor2.setYear(yearInput);//To call the variable constructor after setting it.
				break;//To break after inputting.
			} else {//Else, this method will warn us to input a year that must be greater than 2015
				System.out.println("Entered a year is above the year of 2015, so it must've be entered greater than 2015.");
			}
		}//End of the while loop.
		System.out.println("Please enter a fuel type of car that you want.");
		String fuelTypeInput1 = input.next();//To input data from users.
		carDefaultConstractor2.setFuelType(fuelTypeInput1);//To call the variable constructor after setting it.
		
		System.out.println("And, Which price range do you want?");
		double priceInput1 = input.nextDouble();//To input data from users.
		carDefaultConstractor2.setPrice(priceInput1);//To call the variable constructor after setting it.
		// System.exit(0);
		System.out.println("\n");//To pass one line of code.
		// String knownColor = carDefaultConstractor2.getColor();
		System.out.println("Please enter another knowledge about " + carDefaultConstractor1.getModel() + " and "
				+ carDefaultConstractor2.getColor() + " one below.");

		while (true) {
			System.out.println("Please enter model of car which you want?");
			int yearInput = input.nextInt();//To input data from users.
			if (carDefaultConstractor3.checkYearAvaiability(yearInput)) {//if year less than 2015, this method will warn us to input a year that must be greater than 2015
				carDefaultConstractor3.setYear(yearInput);//To call the variable constructor after setting it.
				break;//To break after inputting.
			} else {//Else, this method will warn us to input a year that must be greater than 2015
				System.out.println("Entered a year is above the year of 2015, so it must've be entered greater than 2015.");
			}
		}//End of the while loop.
		System.out.println("Please enter a fuel type of car that you want.");
		String fuelTypeInput2 = input.next();//To input data from users.
		carDefaultConstractor3.setFuelType(fuelTypeInput2);//To call the variable constructor after setting it.

		System.out.println("And, Which price range do you want?");
		double priceInput2 = input.nextDouble();//To input data from users.
		carDefaultConstractor3.setPrice(priceInput2);//To call the variable constructor after setting it.
		// System.exit(0);
		System.out.println("\n");//To pass one line of code.
		// int knownYear = carDefaultConstractor3.getYear();
		System.out.println("Please enter another knowledge about " + carDefaultConstractor3.getYear() + " model "
				+ carDefaultConstractor1.getModel() + " " + carDefaultConstractor2.getColor() + " one below.");

		System.out.println("Please enter a fuel type of car that you want.");
		String fuelTypeInput3 = input.next();//To input data from users.
		carDefaultConstractor4.setFuelType(fuelTypeInput3);//To call the variable constructor after setting it.

		System.out.println("And, Which price range do you want?");
		double priceInput3 = input.nextDouble();//To input data from users.
		carDefaultConstractor4.setPrice(priceInput3);//To call the variable constructor after setting it.
		// System.exit(0);
		System.out.println("\n");//To pass one line of code.
		// double knownPrice = carDefaultConstractor4.getPrice();
		System.out.println("Please enter another knowledge about " + carDefaultConstractor3.getYear() + " model ("
				+ carDefaultConstractor4.getPrice() + ") " + carDefaultConstractor1.getModel()
				+ carDefaultConstractor2.getColor() + " one below.");

		System.out.println("Please enter a fuel type of car that you want.");
		String fuelTypeInput5 = input.next();//To call the variable constructor after setting it.
		carDefaultConstractor5.setFuelType(fuelTypeInput5);//To call the variable constructor after setting it.
		// System.exit(0);
		System.out.println("\n");//To pass one line of code.
		// String knownFuelType= carDefaultConstractor5.getFuelType();
		System.out.println("Please enter another knowledge about " + carDefaultConstractor3.getYear() + " model ("
				+ carDefaultConstractor4.getPrice() + " bin TL.) " + carDefaultConstractor1.getModel() + " "
				+ carDefaultConstractor2.getColor() + " and " + carDefaultConstractor5.getFuelType() + " one below.");
         }//End of the method.
   }//End of the class.