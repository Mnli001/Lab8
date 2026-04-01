/**
 * StockCount - Тооллого: нэг бараагаар бодит болон байвал зохих тоог харьцуулах
 */
public class StockCount {
    private Product product;
    private int expectedQuantity;
    private int actualQuantity;

    public StockCount(Product product, int expectedQuantity, int actualQuantity) {}

    public Product getProduct() { return product; }
    public int getExpectedQuantity() { return expectedQuantity; }
    public int getActualQuantity() { return actualQuantity; }

    /** Илүүдэл эсвэл дутагдлыг тооцоолох */
    public int calculateDifference() { return 0; }

    /** Тооллогын төрлийг буцаах (SURPLUS - илүүдэл / SHORTAGE - дутагдал) */
    public AdjustmentType getAdjustmentType() { return null; }
}
