package Prog703s;

public abstract class SuperClass implements comps {
    private String name;
    private int number;
    private double value;

    public SuperClass(String name, int number, double value) {
        this.name = name;
        this.number = number;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getValue() {
        return value;
    }
}
