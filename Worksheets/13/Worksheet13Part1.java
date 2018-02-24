
public class Worksheet13Part1 implements IntA,IntB {
	
	public int biggestNumber(int a, int b, int c){
		if(a>b)
			return a;
		else if(b>c)
			return b;
		else
			return c;
	}
	
	
	public void mulitiplicationTable(int [][]a){
		int r = a.length;
		int c= a[0].length;
		for(int m=0; m<r; m++){
			for(int n=0; n<c; n++){
				System.out.print((a[m][n]*a[m][n]+" "));
			}
			System.out.println();
		}
	}

	
	public int sumOfIntegerArray(int []a){
		int sum =0;
		
		for(int  i =0; i<a.length; i++){
			sum=sum+a[i];
		}
	return sum;
	}






}
