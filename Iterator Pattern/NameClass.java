package Iterator Pattern;

public class NameClass {
    private final String[] names={"Alice","Bob","Charlie"}; // Array to hold names
    private int index=0;      // Current position in th

    public NameIterator getIterator(){
        return new NameListIterator();
    }

    private class NameListIterator implements NameIterator { // Inner class implementing the iterator interface
        public boolean HasNext() { // Check if there are more names to iterate over
            return index < names.length; // Return true if there are more names
        }

        public String next() { // Get the next name in the array
            return HasNext() ? names[index++] : null; // Return the name and move to the next one
        }
    }

}
