package src;

// part1 Visitor
public class Visitor extends Person {
    String phone;
    String visitorType;

    public Visitor() {
    }

    public Visitor(String name, int age, String gender, String phone, String visitorType) {
        super(name, age, gender);
        this.phone = phone;
        this.visitorType = visitorType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVisitorType() {
        return this.visitorType;
    }

    public void setVisitorType(String visitorType) {
        this.visitorType = visitorType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Phone: " + phone + ", VisitorType: " + visitorType;
    }
}
