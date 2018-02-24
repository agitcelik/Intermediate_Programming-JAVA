
public class Cat extends Animal{
    private String name ;
    private double length;
    
    public Cat(){
        super();
        
    }
    public Cat(String name, double length){
        this.name=name;
        this.length=length;
    }
    public Cat(String gender,int age , String name,double length){
        super(gender,age);
        this.name=name;
        this.length=length;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    public String toString(){
        return super.toString()+" name is:"+name+" length is: "+ length;
    }
}
