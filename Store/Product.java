public class Product {
    String name;
    double price;
    int quantity;


    // ---------- CONSTRUCTORS ----------
    Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // an overloaded constructor (quantity defaults to 0)
    Product(String name, double price){
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    // ---------- UTILITY METHODS ----------
    double totalValue(){
        return price*quantity;
    }

    public String toString(){
        return "name= "+name + ", price= " +price + ", quantity= "+ quantity;
    }
}