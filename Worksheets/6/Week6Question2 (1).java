import java.util.Scanner;

public class Week6Question2 {

	public static int a;
	public static int b;

	public void NestedLoopNumber(int a, int b) {
		for (int i = a; i >= 1; i--) {
			for (int j = b; j <= i; j++) {
				System.out.print(j+" ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Week6Question2 test = new Week6Question2();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a row number: ");
		a = input.nextInt();
		System.out.println("Enter a columb number: ");
		b = input.nextInt();
		test.NestedLoopNumber(a, b);
	}

}
