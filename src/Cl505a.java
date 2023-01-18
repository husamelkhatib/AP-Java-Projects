public class Cl505a {
     private String myName;
     private int myBooks;
     private int myPoints;

     public Cl505a(String name, int book) {
          myName = name;
          myBooks = book;
          myPoints = 0;
     }
     public void calc() {
          if (myBooks <= 3)
               myPoints = myBooks * 10;
          else if (myBooks <= 6)
               myPoints = (myBooks - 3) * 15 + 30;
          else
               myPoints = (myBooks - 6) * 20 + 75;
     }
     public String getName() {
          return myName;
     }
     public int getBooks() {
          return myBooks;
     }

}
