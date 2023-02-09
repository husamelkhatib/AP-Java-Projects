package Prog702pExtra;

public class Beeper extends Animal {
    private String myWord;

    public Beeper(String f, String l, String word) {
        super(f,l);
        myWord = word;
    }

    public String getWord() {return myWord;}

}
