
public class Pigeon extends Bird{
    private String name ;
    private double length;
    
    public Pigeon(){
        super();
    }
    public Pigeon(String gender,int age,String name , double length,String color,boolean canFly){
        super(color,canFly,gender,age);
        this.name=name;
        this.length=length;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    
    public String toString() {
        return super.toString()+", name is:"+name+", length is: "+ length;
    }
}
