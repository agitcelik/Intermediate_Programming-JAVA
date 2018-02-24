
public class Test {
	public static void main(String[] args) {
		Worksheet13Part1 test = new Worksheet13Part1();
	
		int[] b={5,6,7,8,9};
		int[][] c={{5,6,7},{8,1,3},{5,1,8}};
		System.out.println("For Part1 interface class");
		System.out.println("\n");
		System.out.println(test.biggestNumber(3, 6, 7));
		System.out.println("\n");
		System.out.println(test.sumOfIntegerArray(b));
		System.out.println("\n");
		try{
		test.mulitiplicationTable(c);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("");
	}
	
		System.out.println("\n");
		System.out.println("For Part2 abstract class");
		Worksheet13Part2 test2 = new Worksheet13Part2();
		test2.helloBilgi();
		System.out.println(test2.isPrime(2));
		System.out.println(test2.isPrime(9));
	}
}
