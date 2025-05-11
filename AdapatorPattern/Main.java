package AdapatorPattern;

public class Main {
    public static void main(String args[]){
        Oldcharger oldcharger=new Oldcharger();
        MobileChargerInterface mobileChargerInterface=new Adapator(oldcharger);
        mobileChargerInterface.charge();
    }
}

// Adapator Pattern is a structural design pattern that allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by converting the interface of a class into another interface that the client expects. This pattern is particularly useful when you want to use an existing class but its interface does not match the one you need. The Adapter pattern is often used in conjunction with other design patterns, such as the Factory pattern or the Strategy pattern, to provide a more flexible and reusable solution.