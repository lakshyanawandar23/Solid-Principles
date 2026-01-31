public class Main{
    public static void main(String []args){
        System.out.println("decorator pattern revision");
        Coffe simpleCoffe=new SimpleCoffe();
        MilkCoffeDecorator milkCoffeDecorator=new MilkCoffeDecorator(simpleCoffe);
        milkCoffeDecorator.getdescription();
        System.out.println("Cost: "+milkCoffeDecorator.cost());
    }
}