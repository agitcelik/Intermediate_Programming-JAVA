
public class Person {//Begginning of the class.
	private String name;
	private String lastName;

	public Person() {//No argument constructor.
	}

	public Person(String n, String l){//Three variables constructors.
		this.name = n;
		this.lastName = l;
	}

	public String getName() {//To get name for test method
		return name;//This method must return due to String type used.
	}

	public void setName(String name) {//To set name for test method.
		this.name = name;//In this method this. must be used due to void
	}

	public String getLastName() {//To get lastName for test method
		return lastName;//This method must return due to String type used.
	}

	public void setLastName(String lastName) {//To set lastName for test method.
		this.lastName = lastName;//In this method this. must be used due to void
	}

	public String toString() {//By using toString method, we can reach the information about 
		return "Person [name=" + name + ", lastName=" + lastName + "]";
	}

}//End of the Person class.
