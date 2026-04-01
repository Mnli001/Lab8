import java.time.LocalDate;
import java.util.List;

/**
 * ReceiptVoucher - Орлогын падаан (бараа хүлээн авах үед)
 */
public class ReceiptVoucher {
    private String number;
    private LocalDate issuedDate;
    private Person deliveredBy;          // хүлээлгэн өгсөн хүн
    private List<VoucherLine> line;

    public ReceiptVoucher(String number, LocalDate issuedDate, Person deliveredBy) {}

    public String getNumber() { return number; }
    public LocalDate getIssuedDate() { return issuedDate; }
    public Person getDeliveredBy() { return deliveredBy; }
    public List<VoucherLine> getLine() { return line; }

    public void addLine(VoucherLine voucherLine) {}

    /** Падааныг хэвлэх */
    public void printVoucher() {}
}
