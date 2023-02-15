package Prog703s;

public class Apple implements comps {
    private String name;
    private int number;
    private double value;
    private String color;

    public Apple(String name, int number, String color) {
        this.name = name;
        this.number = number;
        this.color = color;
        this.value = 0.0;
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

    public String getColor() {
        return color;
    }
}

