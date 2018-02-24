
public class Worker extends Person {
    private String work;
    private double salary;
    
    
    
    
    
    public Worker(String name, double height, String work, double salary) {
        super(name, height);
        this.work = work;
        this.salary = salary;
    }
    
    public Worker(String name, double height) {
        super(name, height);
        // TODO Auto-generated constructor stub
    }
    
    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Worker [work=" + work + ", name= "+name+", heigth= " +height+", salary=" + salary + "Tl]";
    }
    
    
    
}
