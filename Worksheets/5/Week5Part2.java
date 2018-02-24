import java.util.Scanner;
public class Week5Part2{
    public static double n;
    public static double m;
    public double avarageNumbers(double n,double m){
        double numberBetween=m-n-1;
        double sum=0;
        while(n<m-1){
            sum=sum+1+n;
            n++;
        }
        
        return sum/numberBetween;
    }
    public static void main(String []args){
        Week5Part2 test = new Week5Part2();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number(as a n<m)");
        int a;
        a=input.nextInt();
        System.out.println("Enter a number(as a m<n");
        int b;
        b=input.nextInt();
        System.out.println(test.avarageNumbers(a,b));
    }
    
    
}