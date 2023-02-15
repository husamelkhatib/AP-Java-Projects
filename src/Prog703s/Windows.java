package Prog703s;

public class Windows implements comps {
    private String name;
    private int number;
    private double value;
    private double version;

    public Windows(String name, int number, double value, double version) {
        this.name = name;
        this.number = number;
        this.value = value;
        this.version = version;
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

    public double getVersion() {
        return version;
    }
}
