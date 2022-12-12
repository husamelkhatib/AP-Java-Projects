public class LP39Class {
    private int myyear;
    private int myMonth;
    private int myday;

    private int alive;
    private int sleep;

    private int myyear2;
    private int myMonth2;
    private int myday2;

    public LP39Class(int year , int Month,int day,int year2,int Month2,int day2) {
        myyear = year;
        myMonth = Month;
        myday = day;
        myyear2 = year2;
        myMonth2 = Month2;
        myday2 = day2;

        alive = 0;
        sleep = 0;
    }

    public void setStuff(){
        alive = (myyear2-myyear)*(365) + (myMonth2-myMonth) * 30 - myMonth2 + myMonth;
        sleep = alive * 8;
    }
    public int getAlive() { return alive; }
    public int getSleep() { return sleep;}
}