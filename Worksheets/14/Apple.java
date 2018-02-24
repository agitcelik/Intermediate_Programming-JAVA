package cmpe101;

public class Apple extends Fruits {
private String color;
private String season;
private Place place;

public Apple(){
	super();
}
public Apple(String c,String s,Place p,String name,float price){
	super(name,price);
	this.color=c;
	this.place=p;
	this.season=s;
}



public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getSeason() {
	return season;
}
public void setSeason(String season) {
	this.season = season;
}
public Place getPlace() {
	return place;
}
public void setPlace(Place place) {
	this.place = place;
}
@Override
public String toString() {
	return "Apple ["+super.toString()+"color=" + color + ", season=" + season + ", place=" + place
			+ "]";
}











}
