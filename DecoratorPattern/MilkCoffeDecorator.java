public class MilkCoffeDecorator extends CoffeDecorator{
    public MilkCoffeDecorator(Coffe coffe){
        super(coffe);
    }
    @Override
    public void getdescription(){
        coffe.getdescription();
        System.out.println(" with Milk");
    }

    @Override
    public int cost(){
        return coffe.cost()+5;
    }
}