 interface Sellable {
    double getPrice();
    
    default String symbol() {
        return "$";
    }
}



 
 class Chair implements Sellable {
    public double getPrice() {
        return 35;
    }
    
    public String symbol() {
        return "£";
    }
}



 
public class Test1 {
    public static void main(String[] args) {
        Sellable obj = new Chair(); //Line n1
        System.out.println(obj.symbol() + obj.getPrice()); //Line n2
    }
}
