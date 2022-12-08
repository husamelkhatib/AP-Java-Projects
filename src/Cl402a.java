public class Cl402a {
    private int myid;
    private int myscore;
    private double mydiff;

    public Cl402a(int id, int score) {
        myid = id;
        myscore = score;
        mydiff = 0;
    }

    public void calc(double avg) {
        mydiff = myscore - avg;
    }

    public int getMyscore() {
        return myscore;
    }
    public int getMyid() {
        return myid;
    }
    public double getMydiff() {
        return mydiff;
    }
}