
public class BilgiTestBonus {
    public static void main( String [ ]args) {
        
        Bilgi b= new Bilgi("Istanbul");
        Bilgi b1= new Bilgi("Itu", 1997);
        Bilgi b2= new Bilgi("Bilgi", 2000, 23.57);
        Bilgi b3= new Bilgi();
        System.out.println(b.getBilgi("Istanbul"));
        System.out.println(b1.getBilgi("Itu", 1997));
        System.out.println(b2.getBilgi("Bilgi", 2000, 22.57));
        System.out.println(b3.getBilgi());
    }
}