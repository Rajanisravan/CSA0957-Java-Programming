import java.util.HashMap;
import java.util.Map;

class Company {
    private String name;
    private String address;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

class Inventory {
    private Map<String, Integer> rawMaterials;
    private Map<String, Integer> finishedProducts;
    private Map<String, Integer> reorderLevels;

    public Inventory() {
        rawMaterials = new HashMap<>();
        finishedProducts = new HashMap<>();
        reorderLevels = new HashMap<>();
    }

    public void addRawMaterial(String name, int quantity, int reorderLevel) {
        rawMaterials.put(name, rawMaterials.getOrDefault(name, 0) + quantity);
        reorderLevels.put(name, reorderLevel);
    }

    public void issueRawMaterial(String name, int quantity) {
        if (rawMaterials.containsKey(name) && rawMaterials.get(name) >= quantity) {
            rawMaterials.put(name, rawMaterials.get(name) - quantity);
            checkReorderLevel(name);
        } else {
            System.out.println("Insufficient raw material in stock or material not found.");
        }
    }

    public void addFinishedProduct(String name, int quantity) {
        finishedProducts.put(name, finishedProducts.getOrDefault(name, 0) + quantity);
    }

    public void sellFinishedProduct(String name, int quantity) {
        if (finishedProducts.containsKey(name) && finishedProducts.get(name) >= quantity) {
            finishedProducts.put(name, finishedProducts.get(name) - quantity);
        } else {
            System.out.println("Insufficient finished products in stock or product not found.");
        }
    }

    public void checkReorderLevel(String name) {
        if (rawMaterials.containsKey(name) && rawMaterials.get(name) <= reorderLevels.get(name)) {
            System.out.println("Warning: Raw material " + name + " has reached the reorder level.");
        }
    }

    public void displayInventory() {
        System.out.println("Raw Materials in Stock:");
        for (Map.Entry<String, Integer> entry : rawMaterials.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Finished Products in Stock:");
        for (Map.Entry<String, Integer> entry : finishedProducts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

class ProductionSection {
    private Inventory inventory;

    public ProductionSection(Inventory inventory) {
        this.inventory = inventory;
    }

    public void produce(String rawMaterial, int rawMaterialQuantity, String finishedProduct, int finishedProductQuantity) {
        inventory.issueRawMaterial(rawMaterial, rawMaterialQuantity);
        inventory.addFinishedProduct(finishedProduct, finishedProductQuantity);
    }
}

class SalesSection {
    private Inventory inventory;

    public SalesSection(Inventory inventory) {
        this.inventory = inventory;
    }

    public void sell(String finishedProduct, int quantity) {
        inventory.sellFinishedProduct(finishedProduct, quantity);
    }
}

public class InventoryCompany {
    public static void main(String[] args) {
        Company company = new Company("Tech Solutions", "123 Tech Street, Silicon Valley");
        Inventory inventory = new Inventory();
        ProductionSection productionSection = new ProductionSection(inventory);
        SalesSection salesSection = new SalesSection(inventory);

        // Adding raw materials
        inventory.addRawMaterial("Steel", 1000, 200);
        inventory.addRawMaterial("Plastic", 500, 100);

        // Adding finished products
        inventory.addFinishedProduct("Widget", 100);

        // Producing new finished products
        productionSection.produce("Steel", 300, "Gadget", 150);

        // Selling finished products
        salesSection.sell("Gadget", 50);

        // Displaying inventory
        inventory.displayInventory();

        // Displaying company details
        System.out.println("Company: " + company.getName());
        System.out.println("Address: " + company.getAddress());
    }
}
