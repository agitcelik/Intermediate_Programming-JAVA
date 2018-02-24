package cmpe101;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Test {
	
	


/*	public void  search (Apple []a, String city){
		Apple temp [] = new Apple[a.length];
		for(int i =0; i<a.length; i++){
			if(a[i]==((Apple)city)){
				temp[i]=a[i];
			}
			else
				continue;
		
		}
System.out.println(temp);
		return temp;
	}
	*/
	
		public void search (Apple []a, String city){
			for(int j=0; j<a.length; j++){
			if(a[j].getPlace().getCity().equals(null)){
				System.out.println("does not exist");
			}
				else if(a[j].getPlace().getCity().equals(city)){
					System.out.println(a[j]);
				}
				else
					System.out.println("The apple found at other country");
					
					continue;
					
			}
		}

	
	public void search(ArrayList<Apple> arrayList){
		Iterator<Apple> itr = arrayList.iterator();
		while (itr.hasNext()) {
			Apple element = itr.next();
		    System.out.printf(element + " " + "%n");
		}
		System.out.println();
	}

	
public static void main(String[] args) {
	Test t = new Test();

	Apple app = new Apple();
	System.out.println(app);
	app.setPrice(12);
	System.out.println(app);
	Place p=new Place("Istanbul",345000);
	Place p1=new Place("Ankara",345000);
	
	Apple app1= new Apple("red","summer",p,"redApple",12);
	System.out.println(app1);

	
	Apple a1= new Apple("yellow","winter",p1,"yellowApple",14);
	Apple a2= new Apple("green","spring",p,"greenApple",16);
	Apple a3= new Apple("blue","autumn",p,"blueApple",18);
	Apple a4= new Apple("white","summer",p1,"whiteApple",19);
	Apple a5= new Apple("purple","spring",p,"purpleApple",22);
	System.out.println("\n"+"Standart Array List below.");
	Apple []myArray={a1,a2,a3,a4,a5};
	for(int i=0; i<myArray.length; i++){
		System.out.println(myArray[i]);
	}

	System.out.println("\n"+"Array List below.");
	ArrayList<Apple> arrayList = new ArrayList<Apple>();
	arrayList.add(a1);
	arrayList.add(a2);
	arrayList.add(a3);
	arrayList.add(a4);
	arrayList.add(a5);
	
	for(int j=0; j<arrayList.size(); j++){
		System.out.println(arrayList.get(j));
	}
	System.out.println("\n"+"Vector List below.");
	Vector<Apple> vectorList = new Vector <Apple>();
	vectorList.add(a1);
	vectorList.add(a2);
	vectorList.add(a3);
	vectorList.add(a4);
	vectorList.add(a5);
	for(int i =0; i<vectorList.size(); i++){
		System.out.println(vectorList.get(i));
	}
	System.out.println("\n"+"Apple in the same city below.");
t.search(myArray,"Istanbul");
//t.search(vectorList,"Istanbul");

}
}