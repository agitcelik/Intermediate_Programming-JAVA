
public class TestCar {
public static void main (String []args){
Car test1 = new  Car();
Car test2= new Car("Opel");
Car test3= new Car ("Opel", 2015);
Car test4 = new Car ("Opel",2015,"red");
Car test5=new Car("Ford",2016,"white","GAS");
System.out.println("\n");
System.out.println(test1.toString());
System.out.println("\n");
System.out.println("Company is: "+ test3.getCompany()+ " ,model is: " +test3.getModel() +"  and color is: "+ test4.getColor());
System.out.println("\n");
System.out.println("Company is: "+ test5.getCompany()+ " ,model is: " +test5.getModel() +"  ,color is: "+ test5.getColor()+" and fuel type is: "+test5.getFuelType());
System.out.println("\n");
test4.setCompany("Ferrari");
System.out.println("\n"+"After set the company of car from Opel to Ferrari");

System.out.println("Company is: "+ test4.getCompany()+ " ,model is: " +test4.getModel() +"  and color is: "+ test4.getColor());
System.out.println("\n");
}
}
