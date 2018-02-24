
abstract class Foo implements IntA {//
	
	public void sayHello(){//implementing the abstarct class method.
		System.out.println("Hello!");
	}
	
	public void about(){//We  can define methods even if class is abstract.
		System.out.println("This is an abstract class");
	}
	
	abstract public boolean isPrime(int n);//To test whether number is prime or not.



}
