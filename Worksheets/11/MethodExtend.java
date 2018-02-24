
public class MethodExtend extends Method{
	
	
	
	public void number(int x, int y){
		System.out.println(x*y);
	}

	public static void main(String []args) {
		Method test = new Method ();
		test.number(2, 3);
		test.number(1.8, 1.7);
        System.out.println("\n");
		
	}
	
}