package cmpe101;

public class Place {
private String City;
private int postCode;


public Place(){
	
}
public Place(String c, int p){
	this.City=c;
	this.postCode=p;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public int getPostCode() {
	return postCode;
}
public void setPostCode(int postCode) {
	this.postCode = postCode;
}
@Override
public String toString() {
	return "Place [City=" + City + ", postCode=" + postCode + "]";
}

}
