

public class Week5Part1 {
	/*int sum=0;
	int numbers=0 ;
	
	for (int i=0; i<=10; i++){
	for( int j=10; j<= i; j--) {
	numbers++;
	sum=sum + (j-i);
	}
	}
}*/
	public static void main(String []args){
		
	
int number=0;
int i =0;
int x=0;
int sum= 0;
int j =10;
while(i<=10){//beginning of nested while loop.
	
	i++;
	
	while(j<=i){//while loop inside of  while loop..
		
		j--;
		number++;
		sum=sum+ (j-i);
		
	}
	
}
System.out.println("Sum for nested while loop: " +sum);
	
do{//beginning of the nested do-while loop
i++;
while(j<=i){//while inside of do - while loop
	j--;
	number++;
	sum=sum+(j-i);
}
}while(i<=10);

System.out.println("Sum for nested do-while loop: "+ sum);

}
}