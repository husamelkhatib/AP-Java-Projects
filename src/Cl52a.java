public class Cl52a {
        // Private data (fields)
        private int myLen;
        private int myWid;
        private int myArea;
        private int myPerim;

        // Constructor: set up private data

    /**
     * Returns a new Cl52 Object
     * @param l length
     * @param w width
     */
        public Cl52a(int l, int w) {
            myLen = l;
            myWid = w;
            myArea = 0;
            myPerim = 0;
        }
        // Mutator: modifies private data
        public void setStuff() {
            myArea = myWid * myLen;
            myPerim = 2 * myWid + 2 * myLen;
            // return; // a void method does NOT return anything -- the "empty return" is implicit
        }
        // Accessors: returns private data

    /**
     * Returns the area (length * width)
     * @return the calculated area after calling setStuff()
     */
    public int getArea() { return myArea; }
    public int getPerim() { return myPerim; }

    // Override Method
    public String toString() {
        return String.format("Area: %s\nPerimeter: %s", myArea, myPerim);
    }
    // Easy print method
public void print() {
        System.out.println(this.toString());
}
    }
    /* Class:
     * private data
     * Constructors
     * Modifiers (Mutators)
     * Accessors
     */

