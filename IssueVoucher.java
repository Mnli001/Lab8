import java.time.LocalDate;
import java.util.List;

/**
 * IssueVoucher - Зарлагын падаан (бараа гаргах үед)
 */
public class IssueVoucher {
    private String number;
    private LocalDate issuedDate;
    private Person receivedBy;           // хүлээн авсан хүн
    private List<VoucherLine> line;

    public IssueVoucher(String number, LocalDate issuedDate, Person receivedBy) {}

    public String getNumber() { return number; }
    public LocalDate getIssuedDate() { return issuedDate; }
    public Person getReceivedBy() { return receivedBy; }
    public List<VoucherLine> getLine() { return line; }

    public void addLine(VoucherLine voucherLine) {}

    /** Падааныг хэвлэх */
    public void printVoucher() {}
}
