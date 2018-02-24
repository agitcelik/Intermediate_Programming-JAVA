public class Question1 {
    public int sum(int x, int y)
    {
        int sum= x + y ;
        return sum;
    }
    
    public static void main(String args[])
    {
        Question1 test = new Question1();
        String m=args[0];
        String n=args[2];
        int firstNumber=Integer.parseInt(m);
        int secondNumber=Integer.parseInt(n);
        System.out.println(test.sum(firstNumber,secondNumber));
    }
}
