
public class Question2 {

	public int power(int x , int n){
		int totalNumber=0;
		int p= 1;
		for (int i =2; i<=n; i=i+2){//i+=2;
			p = p*x*x;
			totalNumber =   totalNumber+p;
		}
	return totalNumber;
	}
	
	
	
	public static void main(String  []args){
		Question2 test = new Question2();
		
		System.out.println(test.power(2, 4));
	}
}
