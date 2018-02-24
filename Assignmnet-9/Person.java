
public class Person {
	private String name;
	private int age;
	private boolean gender;
	private boolean male;
	private boolean female;
	public Person(String name, int age, boolean male){//Creating the name, age, male constructor.
	this.age=age;
	this.name=name;
	this.male=male;
	}//End of the constructor.
	public String getName() {//To get knowledge about name.
		return name;
	}
	public void setName(String name) {//Changing the name of person with another name.
		this.name = name;
	}
	public int getAge() {//To get knowledge about age.
		return age;
	}
	public void setAge(int age) {//Changing the age of person with another age.
		this.age = age;
	}
	public boolean isMale() {//To check whether person is male or not
		return male;
	}
	public void setMale(boolean male) {//To set male.
		this.male = male;//To refer elements of male that have defined into the class.
	}
	
	public String toString() {//writing all of the elements of class.
		return "Person [name=" + name + ", age=" + age + ", male=" + male + "]";//Like printing with println or printf
	}
	
}//End of the classs.
