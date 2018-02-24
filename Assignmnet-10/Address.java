
public class Address {//Beggining of the class.
	private String city;
	private int postCode;

	public Address(){//No argument constructor.

	}

	public Address(String c, int p) {//Three variables constructors.
		city = c;
		postCode = p;// this.postCode=p;
	}

	public String getCity() {//To get city into the test class
		return city;//must return string due to method type.
	}

	public void setCity(String city) {//To set city for test method.
		this.city = city;//In this method this. must be used due to void
	}

	public int getPostCode() {//To get postCode into the test class
		return postCode;//must return int due to method type.
	}

	public void setPostCode(int postCode) {//To set postCode for test method.
		this.postCode = postCode;//In this method this. must be used due to void.
	}

	public String toString() {//By using toString method, we can reach the information about 
		return "Address [city=" + city + ", postCode=" + postCode + "]";
	}
}//End of the Address class.