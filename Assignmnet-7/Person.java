
public class Person {//Beginning of the Class.
private String name;//Given type String name
private int age;//Given type int age

public Person(){//No argument constructor.
	
}
public Person(String n,int age){//Two argument constructors. To identify Person.
	this.age=age;
	this.name=n;
}
public String getName() {//To get name that given into the Test class.
	return name;//This method must return due to String type used.
}
public void setName(String name) {//Setting name to change with different variables into the Test class.
	this.name = name;//In this method this. must be used due to void
}
public int getAge() {//To get age that given into the Test class.
	return age;//This method must return due to int type used.
}
public void setAge(int age) {//Setting age to change with different variables into the Test class.
	
	if(age<=18){//if the age is under and equals to 18. Program gives us a message.
	System.out.println("Age of  18 and under that age is not allowed to drive Truck");
	}//End of the if block
	else//due to one line of code we do not have to use bracket points.
		this.age=age;//In this method this. must be used due to void
}
public String toString(){//To print age and name  with toString  method.
	return String.format("%s ,age of the owner is: %s",name, age);//String format is exactly as same as printf method.
}

}//End of the Person Class.
