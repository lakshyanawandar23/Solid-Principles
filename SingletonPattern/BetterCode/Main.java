package SingletonPattern.BetterCode;

public class Main {
    public static void main(String args[]){
        Name n1=Name.getInstance("lakshya");
        n1.getName();
    }
}


// it will always create one instance of the name class and it is known as Singleton pattern 