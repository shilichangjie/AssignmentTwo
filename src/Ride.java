package src;

class Ride implements RideInterface {
    String rideName;
    int maxRiders = 5;
    Employee operator;

    public Ride() {
    }

    public Ride(String rideName, int maxRiders, Employee operator) {
        this.rideName = rideName;
        this.maxRiders = maxRiders;
        this.operator = operator;
    }
}
