
public class Animal {
    private String gender;
    private int age;
    
    public Animal(){
        
    }
    public Animal(String g, int a){
        this.gender=g;
        this.age=a;
    }
    
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
    public void  setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return " gender is:"+gender+" age is: "+ age;
    }
    
    
}
