public class Car {
private String model;//It must be written private to hide knowledge in it.
private String color;//It must be written private to hide knowledge in it.
private double price;//It must be written private to hide knowledge in it.
private int year;//It must be written private to hide knowledge in it.
//private double km;//
//public String  gear;
//private double weight;
private String fuelType;//It must be written private to hide knowledge in it.
//public String condition;
public String toString(){//To string must be written to get reasonable result after printing out unless you get mixed words.
return "<For the empty constructor.> "+"Company is: "+model+ " ,color is: " + color + " ,price is: "+ price + " ,and year is: "+ year;
}//End of toString method.

public Car(){//No argument constructor.
//color="red"
}//End of the constructor.
public Car(String m,String color,int year,double price,String fuelType ){//Five variable constructor.
this.color=color;//Must be this to refer color which have defined beginning of the class.
this.price=price;//Must be this to refer price  which have defined beginning of the class.
this.model=m;//Must be this to refer model which have defined beginning of the class.
this.year=year;//Must be this to refer year which have defined beginning of the class.
this.fuelType=fuelType;//Must be this to refer fuelType which have defined beginning of the class.
}//

public Car(String m,String color,int year ,double price){
	this.model=m;//Must be this to refer model which have defined beginning of the class.
	this.color=color;//Must be this to refer color which have defined beginning of the class.
	this.price=price;//Must be this to refer price  which have defined beginning of the class.
	this.year=year;//Must be this to refer year which have defined beginning of the class.
}//End of the constructor.

public Car(String m,String color,int year){
	this.model=m;//Must be this to refer model which have defined beginning of the class.
	this.color=color;//Must be this to refer color which have defined beginning of the class.
	this.year=year;//Must be this to refer year which have defined beginning of the class.
}//End of the constructor.

public Car(String m,String color){
	this.model=m;//Must be this to refer model which have defined beginning of the class.
	this.color=color;//Must be this to refer color which have defined beginning of the class.
}//End of the constructor.

public Car(String model){
	this.model=model;//Must be this to refer model which have defined beginning of the class.
}//End of the constructor.

public String getModel(){//To get model in the test class.
return model;
}//End of the get method.
public void setModel(String model){//To set model again with new variable in the test class.
	this.model=model;//Must be this to refer model which have defined beginning of the class.
}//End of the set method.

public String getColor(){//To get color in the test class.
return color;
}//End of the get method.
public void setColor(String color){//To set color again with new variable in the test class.
	this.color=color;//Must be this to refer color which have defined beginning of the class.
}//End of the set method.

public double getPrice(){//To get price in the test class.
return price ;
}//End of the get method.
public void setPrice(double price){//To set price again with new variable in the test class.
	this.price=price;//Must be this to refer price  which have defined beginning of the class.
}//End of the set method.

public int getYear(){//To get year in the test class.
return year;
}//End of the get method.

public void setYear(int year){//To set year again with new variable in the test class.
	this.year=year;//Must be this to refer year which have defined beginning of the class.
}//End of the set method.

public boolean checkYearAvaiability(int year){//To check year whether year is less than or equal to 2015 or not.
if ( year <=2015)//if year is less than or equal to 2015, it return false
return false;
return true;//else true.
}//End of the check method.

public String getFuelType(){//To get model in the test class.
return fuelType;
}//End of the get method.

public void setFuelType(String fuelType){//To set fuelType again with new variable in the test class.
	this.fuelType=fuelType;//Must be this to refer fuelType which have defined beginning of the class.
}//End of the set method.
}//End of the class
/*
  public double getKm(){
return km;
}

public void setKm(){
this.km=km;
}

public String   getCondition(){
return condition;
}

public void setCondition(){
this.condition=condition;
}
public String getGear(){
return gear;
}

public void setGear(){
this.gear=gear;
}*/
