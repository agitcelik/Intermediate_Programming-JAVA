
public class Person {
    protected String name ;
    protected double height;
    
    public Person(){
        
    }
    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }
    
    public String getName() {
        return name;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        if(height<1.70){
            System.out.println("height which is less than 1.70 is not allowed to work.!");
        }
        this.height = height;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", height=" + height + "]";
    }
    
    
    
    
    
}
