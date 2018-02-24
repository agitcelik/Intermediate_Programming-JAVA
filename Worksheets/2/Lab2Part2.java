
public class Lab2Part2 {
    public int add(int a, int b, int c){
        int s=0;
        s= a+b;
        s= s+c;
        return s;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public float subtractNumbers (short a, byte b, float k ) {
        return a+b-k;
    }
    public double mixData(byte a, short b, int c, float d, long e){
        return a+b+c+d+e;
    }
    public static void main(String []args){
        Lab2Part2 test1 = new Lab2Part2();
        int a =test1.add(2,3,4);
        System.out.println("Test of add method: "+a);
        
        Lab2Part2 test2 = new Lab2Part2();
        int b= test2.multiply(2, 3);
        System.out.println("Test of multiply method;"+ b);
        
        Lab2Part2 test3 = new Lab2Part2();
        double c =test3.subtractNumbers((short)2,(byte)3,4);
        System.out.println("Test of subtractNumbers: "+ c);
        
        Lab2Part2 test4 = new Lab2Part2();
        double d =test4.mixData((byte)2,(short)4,6,7,9);
        System.out.println("Test of mixData:"+d);
    }
}