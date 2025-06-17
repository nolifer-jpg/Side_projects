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
        int idx = firstEmptySlot();
        if(idx != -1){
            inventory[idx] = p;
        }
        else{
            System.out.println("Inventory full-cannot add more products.");
        }
    }
    /* ---------- API method #2 : add by raw data ---------- */
    public void addProduct(String name, double price, int quantity){
        Product newProd = new Product(name, price, quantity);
        addProduct(newProd);
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
