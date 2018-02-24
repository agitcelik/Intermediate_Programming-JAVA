
public class Question3 {
    
    /*public int [] mixArray1(int a [], int b []){
     int temp [] =new int [a.length+b.length];
     for(int i =0; i<=a.length; i++){
     temp [i] = a[i];
     }
     for(int i =1; i<=b.length; i=i+2){
     temp [i] = b[i];
     }
     return temp;
     }*/
    
    public void printArray(int []k){
        for (int i = 0; i<k.length; i++){
            System.out.print(k[i]+" ");
        }
    }
    
    public int  [] mixArray(int []a , int []b){
        int  temp [] = new int [a.length+b.length];
        int index = 0;
        int index1 = 0;
        for(int i = 0; i<temp.length; i++){
            if (i%2==0){
                temp [i] =a[index++];
                //index++;
            }
            else{
                temp[i]=b[index1++];
                //index1++;
            }
        }
        return temp;
    }
    public static void main (String [ ]args){
        Question3 test = new Question3();
        int []a = {10 ,20, 30, 40, 50 ,60};
        int []b= {-10 ,-20 ,-30 ,-40 ,-50 ,-60};
        test.printArray(test.mixArray(a, b));
    }
    
}
