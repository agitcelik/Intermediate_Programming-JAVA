
public class Test {
    public static void main(String []args) {
        
        
        Person p = new Person("Ahmet", 1.90);
        Worker w1= new Worker("Mert",1.70,"Engineer",7.5);
        
        System.out.println(p);
        System.out.println(w1);
        
        System.out.println("\n");
        System.out.println("After some changes.");
        w1.setName("Mahmut");
        w1.setHeight(1.65);
        w1.setSalary(11.5);
        System.out.println(p);
        System.out.println(w1);
    }
}
