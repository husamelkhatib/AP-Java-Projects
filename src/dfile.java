import java.util.*;
import java.io.*;

public class dfile {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File ("data/Prog285b.dat"));

        } catch (IOException e){
            System.out.println("Cant find data file!");
        }
    }
}
