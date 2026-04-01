/**
 * Product - Агуулахад хадгалагдаж буй бараа
 */
public class Product {
    private String id;
    private String code;
    private String name;
    private String unit;

    public Product(String id, String code, String name, String unit) {}

    public String getId() { return id; }
    public String getCode() { return code; }
    public String getName() { return name; }
    public String getUnit() { return unit; }

    public void setName(String name) {}
    public void setUnit(String unit) {}

    @Override
    public String toString() { return null; }
}
