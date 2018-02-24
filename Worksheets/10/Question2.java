
public class Question2 {
	//public static int c [][];
public void printArray(int [][]a){
	for(int i =0; i< a.length; i++){
		for(int  j =0; j<a[0].length; j++){
		System.out.println(a[i][j]);
	}
}
}
	public void even(int [][]a){
	int r = a.length;
	//int c= 
	for (int i =0; i<r; i++){
		for(int j=0; j<a[i].length; j++){
			if(a[i][j]%2==0){
				System.out.println(a[i][j]);
			}
		}
	}
	
}

public static void main (String []args){
	Question2 test = new Question2();
	int c[][]={ {2,4,5,6,},{8,11},{11,4,3,9}};
	
	test.even(c);
}
}
