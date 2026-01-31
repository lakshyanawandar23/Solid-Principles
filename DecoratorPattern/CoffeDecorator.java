public abstract  class CoffeDecorator implements Coffe{
    protected  Coffe coffe;

    public CoffeDecorator(Coffe coffe){
        this.coffe=coffe;
    }
}