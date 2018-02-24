
public class Student extends Person {//Beggining of the Student class
	private String dept;
	private int studentID;
	private Address address;

	public Student() {//Creating the no argument consturctor
		super();//To call empty constructor with super() due to extend.
	}

	public Student(String n, String L, String d, int id, Address a) {//Creating five argument consturotor
		super(n, L);//Due to extending Person class, we must use super to refer name and last name(properties) in the class
		this.dept = d;
		this.studentID = id;
		this.address = a;
	//All od the properties in the Student class must be this.
	}

	public String getDept() {//To get department into the test class
		return dept;//must return string due to method type.
	}

	public void setDept(String dept) {//To set department for test method.
		this.dept = dept;//In this method this. must be used due to void
	}

	public int getStudentID() {//To get Student ID into the test class
		return studentID;//This method must return due to int type used.
	}

	public void setStudentID(int studentID) {//To set Student ID for test method.
		this.studentID = studentID;//In this method this. must be used due to void
	}

	public Address getAddress() {//To get Address into the test class
		return address;//This method must return due to Address type used.
	}

	public void setAddress(Address address) {//To set address for test method.
		this.address = address;//In this method this. must be used due to void
	}

	@Override
	public String toString() {//By using toString method, we can reach the information about 
		return "Student[" + super.toString() + "dept=" + dept + ", studentID=" + studentID + ", address=" + address
				+ "]";
	}

}//End of the Student class.
