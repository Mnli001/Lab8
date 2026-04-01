/**
 * VoucherLine - Падааны нэг мөр (нэг бараатай холбоотой)
 */
public class VoucherLine {
    private String number;
    private Product product;
    private int quantity;

    public VoucherLine(String number, Product product, int quantity) {}

    public String getNumber() { return number; }
    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) {}
}
