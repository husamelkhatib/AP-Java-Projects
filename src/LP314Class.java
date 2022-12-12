public class LP314Class {
    private int Nyvotes;
    private int Nyvotes2;
    private int NJvotes;
    private int NJovtes2;
    private int Cvotes;
    private int Cvotes2;
    private int Avotes;
    private int Mvotes;
    private int Tvotes;
    private double MPvotes;
    private double APvotes;

    public LP314Class(int Ny, int Ny2, int Nj, int Nj2, int C, int C2){
        Nyvotes = Ny;
        Nyvotes2 = Ny2;
        NJvotes = Nj;
        NJovtes2 = Nj2;
        Cvotes = C;
        Cvotes2 = C2;
        Avotes = 0;
        Mvotes = 0;
        Tvotes = 0;
        MPvotes = 0;
        APvotes = 0;
    }
    public void setStuff(){
        Avotes = Nyvotes + NJvotes + Cvotes;
        Mvotes = Nyvotes2 + NJovtes2 + Cvotes2;
        Tvotes = Avotes + Mvotes;
        MPvotes = MPvotes/Tvotes;
        APvotes = APvotes/Tvotes;

    }
    public int getAvotes() { return Avotes;}
    public int getMvotes() {return Mvotes;}
    public int getTvotes() { return Tvotes;}
    public double getMPvotes() { return  MPvotes;}
    public double getAPvotes() { return APvotes;}

}