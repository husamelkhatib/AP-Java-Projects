package Prog703s;

public class Linux implements comps {
    private String name;
    private int number;
    private double value;
    private int code;

    public Linux(String name, int number, double value, int code) {
        this.name = name;
        this.number = number;
        this.value = value;
        this.code = code;
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

    public int getCode() {
        return code;
    }
}
