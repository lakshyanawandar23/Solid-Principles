public class Shape extends PrtottypeInterface{
    public String type;
    public Shape(String Name){
        this.type=Name;
    }
     @Override
     
     public Prototype clone(){
        return new Shape(this.type);
     }

     public void demo(){
        System.out.print("Shape: "+this.type);
     }
}