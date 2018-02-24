class Bilgi {
    private String name;
    private int year;
    private double area;
    
    public String toString(){
        return "Name is: " +name +" year is: "+ year+ " and the area is :" + area;
    }
    
    public Bilgi(){//To get null Bilgi class for b1.
        
    }
    public Bilgi(String name,int year,double area){//to get name year and area for b2
        this.name=name;
        this.year=year;
        this.area=area;
    }
    public Bilgi(String name,int year){//To get name and year for b1
        this.name=name;
        this.year=year;
        
    }
    public Bilgi(String name){	this.name=name;
        
    }
    
    public String getBilgi(String name,int year,double area){//To get value for Test class
        return "Name:"+name+" Year:" +year+" Area:"+area;
    }
    public String getBilgi(String name,int year){////To get value for Test class
        return "Name:"+name+" Year:" +year;
    }
    public String getBilgi(String name){////To get value for Test class
        return "Name:"+name;
    }
    public String getBilgi(){////To get value for Test class
        return " ";
    }
    
    
    public static void main( String [ ]args) {
        Bilgi b= new Bilgi("Istanbul");
        Bilgi b1= new Bilgi("Itu", 1997);
        Bilgi b2= new Bilgi("Bilgi", 2000, 23.57);
        Bilgi b3= new Bilgi();
        System.out.println(b);//print out name
        System.out.println(b1);//print out year and name
        System.out.println(b2);//print out name year and area
        System.out.println(b3);//print out null. Year will be 0, area will be 0.0 , name will be null
    }
}