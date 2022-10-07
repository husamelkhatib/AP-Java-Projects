class LP59 {
    public static void main(String[] args) {
        System.out.println("x^1\tx^2\tx^3\tx^4\tx^5\t");
        for (int c = 1; c <= 6; c++) {
            for (int c2 = 1; c2 <= 5; c2++) {
                System.out.print((int)(Math.pow (c, c2)) + "\t");
            }
            System.out.println("");
        }
    }
}