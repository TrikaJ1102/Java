import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        InventoryManager manager = InventoryManager.getInstance();

        Product p1 = new NewProduct("Laptop");
        Product p2 = new NewProduct("Mobile");

        LegacyItem legacy1 = new LegacyItem(101, "Old Keyboard");
        LegacyItem legacy2 = new LegacyItem(102, "Old Mouse");

        Product adapted1 = new ProductAdapter(legacy1);
        Product adapted2 = new ProductAdapter(legacy2);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(adapted1);
        manager.addProduct(adapted2);

        Iterator<Product> iterator = manager.returnInventory();

        while (iterator.hasNext()) {
            Product product = iterator.next();
            product.displayDetails();
        }
    }
}