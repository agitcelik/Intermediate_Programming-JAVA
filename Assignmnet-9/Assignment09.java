
public class Assignment09 extends Foo implements IntA, IntB, IntC, IntD {//Begginning of the class which extends and impelements other classes.

	public void sayHello() {// implementing the abstarct class method.
		System.out.println("Hello!");
	}

	public boolean isPrime(int n) {// implementing the abstarct class method.
		if (n % 2 == 0)//if n can be devide 2 return false
			return false;
		for (int i = 3; i * i < n; i += 2)//into the for loop that begins with 3 checks  devisible numbers.
			if (n % i == 0)
			return false;

			return true;
	}//End of the method.
	
	public boolean isMale(Person p) {// implementing the abstarct class method.
		return p.isMale();// if the person is male returns true.
	}
	public void printPersonList(Person []person){//printing person lists.
		for(int i=0; i<person.length; i++){//With foor loop persons will be written one by one.
			System.out.println(person[i]+" ");
		}
		System.out.println();//To pass next line.
	}
	public void nameOfYoungPeople(Person []person, int n){//Printing name of young person name into temp arra.
		String []temp = new String [person.length];//Creating temp array  to gather all of elements into.
		for(int i =0; i<person.length; i++){
			if (n>person[i].getAge()){//Check person age.
			temp[i] =person[i].getName();//Gathering name of young people
			System.out.println(temp[i]);
			}
			else{
				continue;//Code goes beginning to the loop.
			}
		}	
	}
	public int maxNumber(int a, int b, int c){//Finding max number and implementing the abstarct class method.
		if(a>b&& a>c)//checking the numbers
			return a;
		else if(b>c&& b>a)//checking the numbers
		return b;
		else //otherwise returns another number.
			return c;		
	}
}//End of the class. 