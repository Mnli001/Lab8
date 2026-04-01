import java.time.LocalDate;

/**
 * ReportService - Тайлан үүсгэх үйлчилгээ
 */
public class ReportService {

    /** Нөөцийн тайлан үүсгэх */
    public StockReport generateStockReport(Warehouse warehouse) { return null; }

    /** Няравын тайлан үүсгэх (огноогоор) */
    public StorekeeperReport generateStoreKeeperReport(Warehouse warehouse,
                                                        LocalDate startDate,
                                                        LocalDate endDate) { return null; }
}
