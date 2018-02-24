public class Test {//Beggining of the class.
public static void main(String[] args) {//Beggining of the main method.
	
Person p1= new Person("Hatice",40,false);//Creating new person object.
Person p2= new Person("Melike",35,false);//Creating new person object.
Person p3 = new Person("Kerem",30,true);//Creating new person object.

Assignment09 test = new Assignment09();//Creating test object

Person [] myArray={p1,p2,p3};//Creating array to write persons.

test.printPersonList(myArray);//To print person array.
p2.setAge(46);//Setting the age of p2 after.
test.nameOfYoungPeople(myArray, 45);//To check whether given age is greater than 45 or not and printing them.

System.out.println(test.maxNumber(9, 12, 8)+" (MAX Value)");//Printing max values.
System.out.println(test.isMale(p3)+" (Checking whether is male or not)");//Printing true or false in terms of gender
System.out.println(test.isMale(p2)+" (Checking whether is male or not)");//Printing true or false in terms of gender
System.out.println(test.isPrime(8)+" (Checking whether the number is prime or not)");//Printing true or false with respect to number that is prime or not

}//End of the main method.
}//End of the test class.