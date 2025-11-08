

public class Main{
public static void main(String args[]){
    Shape circle=new Shape("Circle");
    Shape ClonedCircle=circle.clone();

    circle.demo();
    ClonedCircle.demo();
}

}