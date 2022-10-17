public class Cl52a {
        // Private data (fields)
        private int myLen;
        private int myWid;
        private int myArea;
        private int myPerim;

        // Constructor
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
    public int getArea() { return myArea; }
    public int getPerim() { return myPerim; }

    }
    /* Class:
     * private data
     * Constructors
     * Modifiers (Mutators)
     * Accessors
     */

