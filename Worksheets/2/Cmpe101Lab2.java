public class Cmpe101Lab2{
    
    
    public static void main(String []args){
        system.out.println("Answer of part 1 with correct solutions:(Cmpe101 Lab2 Part1");
        
        int a;
        a=12;
        int b;
        b=23;
        int  c = a + b; // It will be the out put ; 35 of this line.
        System.out.println("c= "+c);
        a = a+b;//a = 35
        System.out.println("a= "+a);
        int k;
        k= 3; // k=3 (3=k is not corrent due to location changing.)
        double s = 3.4 ;
        double m;
        m= 2.3 + s; //(m = 5.69999999999999) "s" cannot be capital "S".
        System.out.println("m= "+m);
        int t = 3;
        int u= 4;
        double p= (double) t/u; // p=3/4= 0.75
        System.out.println("p= "+p);
        
        boolean myFlag;
        myFlag= true;
        System.out.println("myFlag: " +myFlag); //I initialized myFlag as a "true". it will print out true to screen.
        //myFlag = 45; // we cannot convert it from int to boolean.
       //myFlag= 'T'; // we cannot convert myFlag from char to boolean.
       // myFlag= False; // Boolean cannot start with capital "F" or "T"
        
        // char s = 'b'; // quotation mark cannot be used like "b"...
        char y='q';// y = 'q'
        String z= "ab"; // "ab" is String so we cannot convert from char to string.(char z='ab' is false)
        
        int r=5;
        System.out.println("r= "+r);
        int h1 = r++;// h1= 5//if "++" is right hand side, our answer is same
        System.out.println("h1=r++ ;"+h1);
        int h2 = ++r;// h2= 7//if "++" is left hand side, "+" time number is added our answer.
        System.out.println("h2=++r;" +h2);
        int x1 =r--; // x=7
        System.out.println("x1=r--:"+x1);
        int x2= --r; // x =5
        System.out.println("x2=--r:"+x2);
      
        
    }
}