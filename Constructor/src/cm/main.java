package cm;

public class main {
public static void main(String[] args) {
	Laptop laptop=new Laptop();
	Laptop laptop1=new Laptop("sjls",2332,'m',989987,"asjchjbaku");
	System.out.println(laptop1.toString());
	System.out.println(laptop.toString());
}
}
class Laptop
{
	String name;
	int price;
    char ch;
    double num;
    String brand;
     Laptop(String name, int price, char ch, double num, String brand) {
		
		this.name = name;
		this.price = price;
		this.ch = ch;
		this.num = num;
		this.brand = brand;
		System.out.println("HELLO");
		
	}
     @Override
     public String toString() {
 		return "Laptop [name=" + name + ", price=" + price + ", ch=" + ch + ", num=" + num + ", brand=" + brand + "]";
 	}
	Laptop()
     {
       this("hss",739,'c',76988.8787,"pusp");
       System.out.println("how are yiu");
     }	
}
