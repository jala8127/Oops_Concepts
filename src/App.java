

public class App {
    public static void main(String[] args) {
        Shop item1 = new Shop("Books", 10, 500) ;
        Shop item2 = new Shop();
        // Wholesale items = new Wholesale("Laptops", 30,200);

        item2.setPrice(500);
        item2.setQuantity(15);
        item2.setProduct("Bottles");

        item1.display2();
        item2.display1();
        
        item1.setProduct("trees");
        item1.display2();
        
        item1.replaceName("Phones");
        item1.display2();
        
        // items.display();
    }
}
