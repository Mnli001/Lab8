import java.time.LocalDate;

/**
 * StorekeeperReport - Няравын тайлан: огноогоор эхний үлдэгдэл, орлого, зарлага, эцсийн үлдэгдэл
 */
public class StorekeeperReport {
    private LocalDate startDate;
    private LocalDate endDate;

    public StorekeeperReport(LocalDate startDate, LocalDate endDate) {}

    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }

    /** Тайланг үүсгэж хэвлэх */
    public void generate() {}
}
