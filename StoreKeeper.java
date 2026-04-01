/**
 * StoreKeeper - Агуулахыг хариуцагч нярав
 */
public class StoreKeeper {
    private String id;
    private String fullName;
    private Warehouse warehouse;         // хариуцаж буй агуулах

    public StoreKeeper(String id, String fullName) {}

    public String getId() { return id; }
    public String getFullName() { return fullName; }
    public Warehouse getWarehouse() { return warehouse; }
    public void setWarehouse(Warehouse warehouse) {}

    /** Барааг орлогоор хүлээн авах — ReceiptVoucher үүсгэнэ */
    public ReceiptVoucher recieveGoods(Person deliveredBy, VoucherLine... lines) { return null; }

    /** Барааг зарлагаар гаргах — IssueVoucher үүсгэнэ */
    public IssueVoucher issueGoods(Person receivedBy, VoucherLine... lines) { return null; }

    /** Нөөцийн тайлан харах */
    public StockReport viewStockReport() { return null; }

    /** Тооллого хийх */
    public StockCount performStockCount(Product product, int actualQuantity) { return null; }
}
