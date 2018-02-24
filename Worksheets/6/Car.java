
public class Car {
private String  company;
private int model;
private String color;
private String fuelType;

public String toString(){
	return "Company is: " +getCompany()+ " ,color is "+getColor()+ " and fuel type is "+getFuelType()+" ";
}
public Car(){
		
	}
	public Car(String  company){
		this.setCompany(company);
	}
	public Car(String  company,int model){
		this.setCompany(company);
		this.setModel(model);
	}
public Car(String  company,int model,String color){
	this.setCompany(company);
	this.setModel(model);
	this.setColor(color);

	}
public Car(String  company,int model,String color,String fuelType){
	this.setCompany(company);
	this.setModel(model);
	this.setColor(color);
	this.setFuelType(fuelType);
	
}
public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getFuelType() {
	return fuelType;
}
public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}

	
}
