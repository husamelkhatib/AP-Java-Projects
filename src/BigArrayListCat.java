import java.util.*;
import java.io.*;


public class BigArrayListCat {
    /*
    1. Print out all the cats (there is no toString() available)
    2. Print the name of the 3rd cat.
    3. The last cat has gained 10 pounds. Update the weight on the object. Print the new weight.
    4. The cat named Rascal died. Find that cat and remove it from the list.
    5. A new kitten was brought in (Angel, 3.6, 1, 25.99).  Insert it into the 2nd cell.
    6. A new geriatric cat was found (Gimpy, 14.3, 10,  29.99). Put him on the list.
    7. Print the updated list with a for-each loop
    8. Replace the 3rd cat with (Sugar, 23.6, 7, 33.25) put the removed cat at the end of the list.
    9. Switch the 2nd and 4th cats.
    10. Print the names of the cats on the list.
    11. Remove all cats under $26. Print the costs of each cat remaining on the list.
    12. All cats heavier than 15 pounds need to go on a diet <--  no for-each this time.
    13. Print the names of the cats being put on a diet.
    */
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/bigarraylist.dat"));
            int numCats = input.nextInt();
            input.nextLine();
            ArrayList<Cat> cats = new ArrayList<Cat>();

            for (int lcv = 0; lcv < numCats; lcv++) {
                String name = input.nextLine();
                double weight = input.nextDouble();
                int age = input.nextInt();
                double cost = input.nextDouble();
                input.nextLine();
                cats.add(new Cat(name, weight, age, cost));
            }

        //    1. Print out all the cats (there is no toString() available)

            System.out.println("1.  All the cats:");
            System.out.println("Name\tWeight\tAge\tCost");
            for(Cat cat : cats) {
                System.out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + "\t" + cat.getCost());
            }

        //    2. Print the name of the 3rd cat.

            System.out.println("\n2.  The third cat is named: " + cats.get(2).getName());

        //    3. The last cat has gained 10 pounds. Update the weight on the object. Print the new weight.

            cats.get(cats.size() - 1).setWeight((cats.get(cats.size() - 1).getWeight() + 10));
            System.out.println("\n3.  The updated weight is: " + cats.get(cats.size() - 1).getWeight());

        //    4. The cat named Rascal died. Find that cat and remove it from the list.

            for (int lcv = 0; lcv < cats.size(); lcv++) {
                if (cats.get(lcv).getName().equals("Rascal"))
                    cats.remove(lcv);

        //    5. A new kitten was brought in (Angel, 3.6, 1, 25.99).  Insert it into the 2nd cell.

                cats.add(1, new Cat("Angel", 3.6, 1, 25.99));

        //    6. A new geriatric cat was found (Gimpy, 14.3, 10,  29.99). Put him on the list.

                cats.add(1, new Cat("Gimpy", 14.3, 10, 29.99));

        //    7. Print the updated list with a for-each loop

                System.out.println("1.  All the cats:");
                System.out.println("Name\tWeight\tAge\tCost");
                for(Cat cat : cats) {
                    System.out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + "\t" + cat.getCost());
                }

        //    8. Replace the 3rd cat with (Sugar, 23.6, 7, 33.25) put the removed cat at the end of the list.

                Cat third = cats.get(2);
                cats.set(2, new Cat("Sugar", 23.6, 7, 33.25));
                cats.add(third);

        //    9. Switch the 2nd and 4th cats.

                Cat temp = cats.get(1);
                cats.set(1, cats.get(3));
                cats.set(3, temp);

        //    10. Print the names of the cats on the list.

                System.out.println("\n10.  The currewnt cat names are: ");
                for (Cat c : cats)
                    System.out.println(c.getName() + "\t");
                System.out.println();

        //    11. Remove all cats under $26. Print the costs of each cat remaining on the list.
                for (int lcv = 0; lcv < cats.size(); lcv++) {
                    if (cats.get(lcv).getCost() < 26) {
                        cats.remove(lcv);
                        lcv--;
                    }
                }

        //    12. All cats heavier than 15 pounds need to go on a diet <--  no for-each this time.

                System.out.println("\n12. The cats being put pn a diet are: ");
                for (Cat cat : cats) {
                    if (cat.getWeight() > 15)
                        System.out.print(cat.getName() + "\t");
                }
            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
