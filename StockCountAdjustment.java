/**
 * StockCountAdjustment - Тооллогын дараа барааны тоог засах бүртгэл
 */
public class StockCountAdjustment {
    private Product product;
    private int difference;
    private AdjustmentType adjustmentType;

    public StockCountAdjustment(Product product, int difference, AdjustmentType adjustmentType) {}

    public Product getProduct() { return product; }
    public int getDifference() { return difference; }
    public AdjustmentType getAdjustmentType() { return adjustmentType; }
}
