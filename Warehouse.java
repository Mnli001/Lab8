import java.util.List;

/**
 * Warehouse - Бараа хадгалдаг агуулах
 */
public class Warehouse {
    private String id;
    private String name;
    private String location;
    private List<InventoryRecord> inventoryRecords;

    public Warehouse(String id, String name, String location) {}

    public String getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }
    public List<InventoryRecord> getInventoryRecords() { return inventoryRecords; }

    /** Агуулахд шинэ бараа нэмэх */
    public void addProduct(Product product, int initialQty) {}

    /** Агуулахаас бараа хасах (устгах) */
    public void removeStock(String productId) {}

    /** Тухайн барааны одоогийн нөөцийг авах */
    public InventoryRecord getCurrentStock(String productId) { return null; }
}
