public class Cl54c {
    private double myRadius;
    private double myArea;
    private double myCircumference;



    public Cl54c(double Radius) {
        myRadius = Radius;
        myArea = 0;
        myCircumference = 0;
    }
    public void setStuff() {
        myArea = Math.PI * myRadius * myRadius;
        myCircumference = 2 * Math.PI * myRadius;
    }
    public double getArea() { return myArea; }
    public double getCircumference() { return myCircumference; }
}