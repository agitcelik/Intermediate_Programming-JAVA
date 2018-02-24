

import java.util.Scanner;

public class Worksheet3Part3 {// beginning of the class.
    public static int a;
    public static int b;
    public static int c;
    /*
     I  use static method to refer the number for main method to use them.
     */
    public static void main (String []args){// beginning of the main method.
        
        
        Scanner s = new Scanner(System.in);
        /* 
         I  will use the Scanner class which is "import java.util.Scanner;" to get data from user.....
         */
        
        
        System.out.print("Enter First Number: " ) ;// Enter the first  number
        a= s.nextInt();//then input and go to the next line
        System.out.print("Enter Second Number: ");//
        b = s.nextInt();
        System.out.print("Enter Third Number: " );
        c=s.nextInt();
        if (a>b && a>c) {// if a is greater than b and c, then we get max value which is "a".
            System.out.println("Max value is: " + a);
        }
        else if (b>a && b>c) {// if a is greater than a and c, then we get max value that is "b".
            System.out.println("Max value is: " + b);
        }
        else{// otherwise we get a value of "c" at the and of it.
            System.out.println("Max value is: " + c);
        }
        /*
         End of the this if , else if ,and else statement we got the max value of one of those number
        */
    }//end of the main method.
    
}// end of the class.
