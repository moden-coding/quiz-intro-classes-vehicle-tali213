public class Vehicle {

    private String make;
    private String model;
    private int year;
    private double fuel;
    private boolean operational;

    public Vehicle(String initmake, String initmodel, int inityear, double initfuel) {
        this.make = initmake;
        this.model = initmodel;
        this.year = inityear;
        this.fuel = initfuel;
        if (fuel > 0) {
            this.operational = true;
        } else {
            this.operational = false;
        }
    }

    public void drive() {
        if (fuel >= 10) {
            this.fuel = fuel - 10;
            operational = true;
        }
        else{
            operational = false;
        }
    }

    public void refuel(double amount) {
        this.fuel = fuel + amount;
    }

    public String toString() {
        return ("Make: " + this.make + ", Model: " + this.model + ", Year: " + this.year + ", Fuel: " + this.fuel);
    }

}
