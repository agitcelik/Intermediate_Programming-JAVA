import java.util.Scanner;//Importing Scanner class allows us to use Scanner to get input from users.
public class VehicleTest {//Beginning of the Class.

	public static void main(String []args){//Beginning of the main method.
	Person p = new Person("Ahmet", 22);//Creating object that call Person Class and choose name and year
	Truck t = new Truck("Ford", 5, p, 5.2, 10);//Creating object that include information about Truck and also Person class.
	Scanner input = new Scanner(System.in);
	
	System.out.println(t);//To test object with default arguments.
	p.setName("Ali");//To change name with Ali.
	
	System.out.print("Enter a age to chech whether is allowed to use Truck or not: ");
	p.setAge(input.nextInt());//To input age by users.
	System.out.print("Please enter a another age...: ");//To enter a year to check whether owner can drive trcuk or not due to age.
	p.setAge(input.nextInt());//To input age by users.
	
	System.out.println("The year that you input is allowed to use and another information is given below...");
	System.out.println("\n");//To pass the one line.
    System.out.println(t);//After setters method with different informations test one more time.
	t.setName("Opel");//To change name of the Truck with Opel
	t.setNumberOfCylinders(4);
	t.setLoadCapacity(4.7);
	t.setTowingCapacity(12);
	
	System.out.println("\n");//To pass the one line.
	System.out.println("After changing some variables..");
	System.out.println(t);//To test object that we have created.
	
}//End of the main method.
}//End of the Class.