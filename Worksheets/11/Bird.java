
public class Bird extends Animal {
    private String color;
    private boolean canFly;
    
    public Bird(){
        super();
    }
    public Bird(String color,boolean canFly){
        this.color=color;
        this.canFly=canFly;
    }
    public  Bird(String color,boolean canFly,String gender, int age){
        super(gender,age);
        this.color=color;
        this.canFly=canFly;
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isCanFly() {
        return canFly;
    }
    
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    //Override
    public String toString() {
        return super.toString()+", color is:" + color + ", is bird can fly?: " + canFly;
    }
}
