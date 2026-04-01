# 🏬 Агуулахын Систем — Lab 08

Лабораторийн ажил №08 — Object-Oriented Design (Агуулахын систем)

---

## 📋 Төслийн тайлбар

Энэхүү систем нь байгууллагын агуулахын үйл ажиллагааг удирдах зориулалттай. Нярав агуулахад барааг орлогоор хүлээн авч, зарлагаар гаргах, нөөцийн тайлан харах болон тооллого хийх үйлдлүүдийг дэмждэг.

---

## 👥 Багийн гишүүд

| № | Нэр | Oyutnii code |
|---|-----|--------|
| 1 | [М.Манлай] | [B252270055] |
| 2 | [Т.Цэлмэг] | [B252270007] |
| 3 | [Х.Мандалшива] | [B251910032] |

---

## 🗂️ Классуудын жагсаалт

| Класс | Үүрэг |
|-------|-------|
| `Person` | Системд бүртгэлтэй хүн (өгөгч, авагч) |
| `Product` | Агуулахад хадгалагдах бараа |
| `Warehouse` | Агуулах — бараа хадгалж, нөөц хянана |
| `StoreKeeper` | Нярав — агуулахыг хариуцагч |
| `InventoryRecord` | Тухайн барааны нөөцийн бүртгэл |
| `ReceiptVoucher` | Орлогын падаан |
| `IssueVoucher` | Зарлагын падаан |
| `VoucherLine` | Падааны нэг мөр (нэг бараа) |
| `StockCount` | Тооллого — бодит болон байвал зохих тоо |
| `StockCountAdjustment` | Тооллогын тохируулга |
| `AdjustmentType` | Тохируулгын төрөл (SURPLUS / SHORTAGE / BALANCED) |
| `InventoryService` | Орлого, зарлагын үйл ажиллагааг боловсруулна |
| `ReportService` | Тайлан үүсгэх үйлчилгээ |
| `StockReport` | Нөөцийн тайлан |
| `StorekeeperReport` | Няравын тайлан (огноогоор) |

---

## 🃏 CRC Диаграммын зураг

> CRC (Class-Responsibility-Collaborator) диаграммыг [draw.io](https://app.diagrams.net) ашиглан зурсан.

| Класс | Хариуцлага | Хамтрагч |
|-------|-----------|---------|
| **StoreKeeper** | Орлого/зарлага хийх, тооллого хийх, тайлан харах | Warehouse, ReceiptVoucher, IssueVoucher, StockCount |
| **Warehouse** | Бараа хадгалах, нөөц хянах | InventoryRecord, Product |
| **InventoryRecord** | Нөөцийг нэмэгдүүлэх/бууруулах | Product |
| **ReceiptVoucher** | Орлогын мэдээлэл бүртгэх, хэвлэх | VoucherLine, Person |
| **IssueVoucher** | Зарлагын мэдээлэл бүртгэх, хэвлэх | VoucherLine, Person |
| **StockCount** | Илүүдэл/дутагдал тооцоолох | Product |
| **InventoryService** | Орлого/зарлагын падааныг боловсруулж нөөц шинэчлэх | ReceiptVoucher, IssueVoucher, Warehouse |
| **ReportService** | Нөөц болон няравын тайлан үүсгэх | StockReport, StorekeeperReport |

---

## 🛠️ Технологи

- **Хэл:** Java
- **Хэрэгсэл:** draw.io (CRC диаграмм)

---

## 📁 Файлын бүтэц

```
WarehouseSystem/
├── Person.java
├── Product.java
├── Warehouse.java
├── StoreKeeper.java
├── InventoryRecord.java
├── ReceiptVoucher.java
├── IssueVoucher.java
├── VoucherLine.java
├── StockCount.java
├── StockCountAdjustment.java
├── AdjustmentType.java
├── InventoryService.java
├── ReportService.java
├── StockReport.java
├── StorekeeperReport.java
└── README.md
```
