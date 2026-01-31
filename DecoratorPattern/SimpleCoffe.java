public class SimpleCoffe implements Coffe{
    @Override
    public void getdescription() {
        System.out.println("Simple Coffe");
    }

    @Override
    public int cost() {
        return 10;
    }
}