
public class Vehicle {// Beginning of the Class.
protected String name;//To be visible into the Truck class we must use  protected instead of private, otherwise we cannot access it.
protected int numberOfCylinders;//To be visible into the Truck class we must use  protected instead of private, otherwise we cannot access it.
protected Person owner;//Type person. Information about Person is given in the Person class.


public Vehicle(){//No argument constructor.
	
}

public Vehicle(String name,int numberOfCylinders,Person owner){//Three variables constructors.
	this.name=name;
	this.numberOfCylinders=numberOfCylinders;
	this.owner=owner;
}
public String getName(){//To get name for test method
	return name;//This method must return due to String type used.
}
public int getNumberOfCylinders(){//To get numberOfCylinders for test method
	return numberOfCylinders;//This method must return due to int type used.
}
public Person getOwner(){//To get owner for test method
	return owner;//This method must return due to Person type used.
}

public void setName(String name) {//To set name for test method.
	this.name = name;//In this method this. must be used due to void
}

public void setNumberOfCylinders(int numberOfCylinders) {//To set numberOfCylinders for test method.
	this.numberOfCylinders = numberOfCylinders;//In this method this. must be used due to void
}

public void setOwner(Person owner) {//To set owner for test method.
	this.owner = owner;//In this method this. must be used due to void
}
public String toString(){
	return String.format("Name of the truck %s, Number of cylinders are: %d, and Owner is: %s," ,name,numberOfCylinders,owner);
	//String format is the method that is as same as printf method to get visible code, I used it.
}


}//End of the Vehicle class.
