/**
 * Person - Системд бүртгэлтэй хүн (хүлээлгэн өгөгч, хүлээн авагч г.м.)
 */
public class Person {
    private String id;
    private String fullName;
    private String phone;

    public Person(String id, String fullName, String phone) {}

    public String getId() { return id; }
    public String getFullName() { return fullName; }
    public String getPhone() { return phone; }

    public void setFullName(String fullName) {}
    public void setPhone(String phone) {}

    @Override
    public String toString() { return null; }
}
