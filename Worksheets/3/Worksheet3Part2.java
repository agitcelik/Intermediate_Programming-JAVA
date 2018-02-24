public class Worksheet3Part2{// beginning  of the class.
    
    
    public static void main(String []args ){// beginning of the main method.
        int a=5;
        int b=12;
        System.out.println(a>b);// false
        System.out.println(a>=b);//false
        System.out.println(a<b);//true
        System.out.println(a<=b);//true
        System.out.println(a==b);//false
        System.out.println(a!=b);//true
        // can you execute following statements, explain if you can’t
        //System.out.println(a=b);// must be  “==“ and print out “false”
        //System.out.println(a=<b);// must be >= and print our “false”
        //System.out.println(a=>b);// must be <= and print our “true”
        //System.out.println(a=!b);// must be != and print out “true”
        boolean flag= a==b;
        System.out.println(flag); // must print out “false”
        int flag2= a-b;
        System.out.println(flag2);// must print out “ -7”
        boolean flag3= a!=b;
        System.out.println(flag3);// must be “;” at the end of the line … and print out “true”
        //What output will be produced by the following code?
        int extra = 2;
        if (extra < 0)
            System.out.println("small");//if less than 0
        else if (extra == 0)
            System.out.println("medium");// if it is equal to 0
        else
            System.out.println("large");// if greater than 0
        // set extra to different numbers such -10, 45 different numbers and execute again.}
        // set extra to different numbers such -10, 45 different numbers and execute again.}
        int extra1 = -10;
        if (extra1 < 0)
            System.out.println("small");//if less than 0
        else if (extra1 == 0)
            System.out.println("medium");// if it is equal to 0
        else
            System.out.println("large");// if greater than 0
        // MUST PRİNT OUT "SMALL" DUE TO "-10"
        int extra2 = 45;
        if (extra2 < 0)
            System.out.println("small");//if less than 0
        else if (extra2 == 0)
            System.out.println("medium");// if it is equal to 0
        else
            System.out.println("large");// if greater than 0
        // MUST PRİNT OUT "LARGE" DUE TO "45"
    }// end of the main method
}// end of the class method