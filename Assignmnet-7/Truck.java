
public class Truck extends Vehicle {//To extend Vehicle means that we can reach all of methods that are into the Truck. 
	private double loadCapacity;//Given type double loadCapacity
	private int towingCapacity;//Given type int towingCapacity
	
	public Truck(double loadCapacity, int towingCapacity) {//Two variable constructor.
		super();//To call empty constructor with super() due to extend.
		this.loadCapacity = loadCapacity;
		this.towingCapacity = towingCapacity;
	}
	public double getLoadCapacity() {//To get loadCapacity that given into the Test class.
		return loadCapacity;//This method must return due to double type used.
	}
	public int getTowingCapacity() {//To get towingCapacity that given into the Test class.
		return towingCapacity;//This method must return due to int type used.
	}
	public void setTowingCapacity(int towingCapacity) {//Setting towingCapacity to change with different variables into the Test class.
		this.towingCapacity = towingCapacity;//In this method this. must be used due to void
	}
	public void setLoadCapacity(double loadCapacity) {//Setting loadCapacity to change with different variables into the Test class.
		this.loadCapacity = loadCapacity;//In this method this. must be used due to void
	}
	public Truck() {//No argument constructor.
		super();//To call empty constructor with super() due to extend.
		
	}
	public Truck(String name, int numberOfCylinders, Person owner,double loadCapacity, int towingCapacity) {
		//Two argument constructors, also with other class constructors to extend them.
		super(name, numberOfCylinders, owner);//To call three variable constructor with super(name, numberOfCylinders, owner) due to extend.
		this.loadCapacity = loadCapacity;
		this.towingCapacity = towingCapacity;
	}
	
	public String toString() {
 return String.format("Name of the truck:%s, Number of cylinders are:%d,Load Capacity:%.2f tone, Towing Capacity:%d tone, and Owner is:%s,",name,numberOfCylinders,loadCapacity,towingCapacity,owner);
	//String format is the method that is as same as printf to get visible code, I used it.
}

}//End of the Truck class.