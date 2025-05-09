import java.util.*; // Import for using lists and iterators

public class main {
    public static void main(String[] args) {
        // A list of names (like a group of students)
       NameClass nameList=new NameClass(); //creation of object of NameClass
       NameIterator it=nameList.getIterator(); // Get the iterator for the list

        // Go through the list one by one
        while (it.hasNext()) {            // While there is another name
            String name = it.next();      // Get the next name
            System.out.println(name);     // Print it
        }
    }
}
