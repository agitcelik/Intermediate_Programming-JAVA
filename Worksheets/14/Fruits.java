package cmpe101;

public class Fruits {

	private String name;
	private float price;
	
	public Fruits(){
		
	}
	public Fruits(String n,float p){
		this.name=n;
		this.price=p;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", price=" + price +" TL "+ "]";
	}
	
}
