
public class Worksheet13Part2 extends Bilgi{
	
	
	public  boolean isPrime(int n) {
	  if(n==0 && n==1 && n<0 )
		return false;
		  if(n==2)
		  return true;
	  for(int i = 2; i<n; i++){
		  if(n%i==0)
			  return false;
	  }
		 	return true;
	}
	

}


