public class MiniStore {
    public static void main(String[] args){
        Product pro = new Product("Pen", 10.0, 30);
        Store s = new Store();
        s.addProduct("Pen", 10, 30);
        //s.addProduct("Pen", 10, 15);
        s.addProduct("gel", 20,35);
        s.printInventory();
        s.removeProduct("gel");
        System.out.println("Total = " + s.inventoryValue());
    }
}
