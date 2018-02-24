

public class Question3 {
    public void printArray(int [ ] t) {
        //System.out.println();
        for(int i=0; i<t.length;i++)
            if(t[i]% 2==0)
                System.out.print(t[i]+" ");
        
    }
    
    
    public int [] sort(int [] a){
        int min;
        for(int i=0;i<a.length-1;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j])
                {
                    min=j;
                }
                
            }
            
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
            
        }
        return a;
    }
    
    
    
    public static void main (String []args){
        Question3 test = new Question3();
        int a []={13,12,4,2,6,7,4,5,7,8,9,9,0};
        
        
        test.printArray(test.sort(a));
    }
}