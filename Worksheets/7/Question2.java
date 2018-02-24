//import java.util.Random;


public class Question2 {
    public static void printArray(int[] a) {
        // Print called to determine which function is called.
        System.out.println("This array printArray(int[]) "+ "  Question2 Part2");
        
        // Foreach int value of a, print it!
        for (int val : a){
            System.out.println(""+ val + "");
        }
        System.out.println();
    }
    
    public static void printArray(double[] a) {
        // Acts as printArray(int[]) does...
        System.out.println("This array printArray(double[])");
        for (double val : a) {
            System.out.println("" + val + " ");
        }
        System.out.println();
    }
    
    public static boolean contains(double[] arr, double num) {
        // Foreach double i in array, if i equals num then return true, otherwise false!
        for (double i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
    public static double [] sumArrays(double[] n , double[]m){
        if(n.length==m.length){
            double[] retval = n;
            for(int i = 0; i<n.length; i++){
                retval[i] = retval[i]+m[i];
            }
            return retval;
        }
        else{
            System.out.println("Given Array is empty!"+ "  Question2 Part2");
            return new double[0];
        }
    }
    
    public static void main(String []args){
        //Random myRandom = new Random ();
        double myArray[] = new double[0];
        System.out.println("whether array include 6 or not ? = " + (contains(myArray, 7.0)+" Question2 Part1"));
        
        double[] testArray = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        double[] sum = sumArrays(myArray, testArray);
        
        // Question 2.3 called here with result of the 2.2
        printArray(sum);
        
        // Question 2.3 called here with int[] data type
        printArray(myArray);
    }
}
