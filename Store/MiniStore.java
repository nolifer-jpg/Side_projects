public class MiniStore {
    public static void main(String[] args){
        Product pro = new Product("Pen", 10.0, 30);
        Store s = new Store();
        s.addProduct("Pen", 10, 30);
        s.addProduct("Notebook", 40, 15);
        s.printInventory();
        System.out.println("Total = " + s.inventoryValue());
    }
}
