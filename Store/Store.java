import java.util.Objects;

public class Store {
    private Product[] inventory = new Product[10];

    private int firstEmptySlot(){
        for (int i = 0; i < inventory.length; i++){
            if (inventory[i] == null){
                return i;
            }
        }
        return -1;
    }


    /* ---------- API method #1 : add by object ---------- */
    public void addProduct(Product p){
        for (Product existing : inventory) {
            if (existing != null && existing.name.equalsIgnoreCase(p.name)) {
                existing.quantity += p.quantity;
                return;
            }
        }
        int idx =firstEmptySlot();
        if (idx!= -1){
            inventory[idx] = p;
            }
        else{
            System.out.println("Inventory full – cannot add more products.");
        }
    }
    /* ---------- API method #2 : add by raw data ---------- */
    public void addProduct(String name, double price, int quantity){
        Product newProd = new Product(name, price, quantity);
        addProduct(newProd);
    }

    public void removeProduct(String name){
        for (int i =0; i< inventory.length; i++){
            Product p = inventory[i];
            if (p != null && name.equalsIgnoreCase(p.name)){
                inventory[i] = null;
                System.out.println("Removed " + name);
                return;
            }
        }
    }

    public void updatePrice(String name, double newPrice){
        for(Product x: inventory){
            if (x!= null && name.equalsIgnoreCase(x.name)){
                x.price = newPrice;
                System.out.println("Price updated to "+newPrice);
                return;
            }
        }
    }

    public void printLowStock(int threshold){
        boolean found = false;
        for(Product x: inventory) {
            if (x != null && x.quantity < threshold) {
                System.out.println(x);
                found = true;
            }
        }
        if(!found){
            System.out.println("All stock levels are healthy.");
        }
    }


    /* ---------- API method #3 : print everything ---------- */
    public void printInventory(){
        for(Product x : inventory){
            if(x != null){
                System.out.println(x);
            }
        }
    }
    /* ---------- API method #4 : how much money is on the shelf? ---------- */
    public double inventoryValue(){
        double total=0;
        for(Product x: inventory){
            if(x!= null){
                total += x.totalValue();
            }
        }
        return total;
    }
}
