package src;

// part1 Employee
class Employee extends Person {
    int code;
    String position;

    public Employee() {
    }

    public Employee(String name, int age, String gender, int code, String position) {
        super(name, age, gender);
        this.code = code;
        this.position = position;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() + ", EmployeeCode: " + code + ", position: " + position;
    }
}
