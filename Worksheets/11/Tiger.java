
public class Tiger extends Cat{
private double weigth;
private String colorOfEyes;

public Tiger(){
	super();
}
public Tiger(String gender, int age,double weigth,String colorOfEyes,String name , double length){
	super(gender,age,name,length);
	this.weigth=weigth;
	this.colorOfEyes=colorOfEyes;
	
}
public double getWeigth() {
	return weigth;
}
public void setWeigth(double weigth) {
	this.weigth = weigth;
}
public String getColorOfEyes() {
	return colorOfEyes;
}
public void setColorOfEyes(String colorOfEyes) {
	this.colorOfEyes = colorOfEyes;
}

public String toString() {
	return super.toString()+" weigth is;"+" Color of eye is: "+colorOfEyes;
}



}
