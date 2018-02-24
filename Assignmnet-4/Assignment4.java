import java.util.Scanner;//To input data from users we have to import Scanner class from library.
public class Assignment4{//Beginning of the class.
    
    
    public void price(int a, int b, int inc1, int inc2){//Beginning of the method.
        double priceOfEstate=0;//must be initialized with 0, since we want it to increase.
        Scanner input = new Scanner(System.in);//To input data from users
        Assignment4 test2 = new Assignment4();//Create object to test method.
        
        System.out.println("Enter a unit price: ");//Enter a price
        
        double unitPrice=input.nextDouble();//To input data from users.
        System.out.println("Enter a length of estate: ");//Enter a length of estate
        a=input.nextInt();//To input data from users.
        System.out.println("Enter a width of estate: ");//Enter a width of estate
        b=input.nextInt();//To input data from users.
        System.out.println("Ente a increment of length; ");//Enter a increment of length
        inc1=input.nextInt();//To input data from users.
        System.out.println("Ente a increment of width; ");//Enter a increment of width
        inc2=input.nextInt();//To input data from users.
        
        for(int lengthOfEstate=5; lengthOfEstate<=a; lengthOfEstate+=inc1){//Beginning of the for.
            for(int widthOfEstate=2; widthOfEstate<=b; widthOfEstate+=inc2){//Beggining of the nested for.
                System.out.printf("  "+"%.2f",(lengthOfEstate*widthOfEstate*unitPrice));//printf to get rid of decimal point after 2.
                System.out.print(" TL.");
            }//End of the nested for.
            System.out.println("\n");//To pass next line
        }//End of the for
        
    }//End of the method.
    
    public static void main(String []args){//Beginning of the method.
        
        int a=0;//must be initialized with 0 , since we want it to increase.
        int b=0;//must be initialized with 0, since we want it to increase.
        int inc1=0;//must be initialized with 0, since we want it to increase.
        int inc2=0;//must be initialized with 0, since we want it to increase.
        Assignment4 test = new Assignment4();//Create a test object.
        test.price(a ,  b,  inc1 ,  inc2);//To test price with object and method that we have defined.
        
    }//End of the method.
    
}//End of the class.