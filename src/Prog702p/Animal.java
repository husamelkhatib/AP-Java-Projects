package Prog702p;

public class Animal implements names{
    private String myFirst;
    private String myLast;


    public Animal(String fn, String ln) {
        myFirst = fn;
        myLast = ln;
    }

    public String getFirst() {return myFirst;}
    public String getLast() {return myLast;}
    public String getName() {return myFirst + " " + myLast;}
}
