/**
 * InventoryRecord - Агуулах дахь барааны одоогийн нөөцийн бүртгэл
 */
public class InventoryRecord {
    private Product product;
    private int quantityOnHand;

    public InventoryRecord(Product product, int quantityOnHand) {}

    public Product getProduct() { return product; }
    public int getQuantityOnHand() { return quantityOnHand; }

    /** Нөөцийг нэмэгдүүлэх (орлого) */
    public void increase(int amount) {}

    /** Нөөцийг бууруулах (зарлага) */
    public void decrease(int amount) {}
}
