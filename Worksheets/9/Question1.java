public class Question1 {

	public static int min(int a[]) {
		int smallest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (smallest > a[i]) {
				smallest = a[i];
			}
		}
		return smallest;
	}

	public static int max(int b []){
		int biggest = b[0];
		for(int i=0; i>b.length; i++){
		if(biggest<b[i]){
		biggest= b[i];
		}
	}
	return biggest;
	}
	public int sumOfBoth(int []a ){
		return min(a)+max(a);
	}
	public static void main (String []args){
			Question1 test = new Question1();
			int []a = { 100 ,4 ,-3, 30, -10, 30 ,-60,9};
			System.out.println(test.sumOfBoth(a));
			
	}
	
	/*
	 * public int [] mixArray(int []a, int []b){
	 * 
	 * }
	 */

}
