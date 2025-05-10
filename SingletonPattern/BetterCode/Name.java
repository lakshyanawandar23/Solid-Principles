package SingletonPattern.BetterCode;

public class Name {
    private final String name; // The name of the student
    private static Name instance;
    private Name(String name){
        this.name=name;
    }
   public static Name getInstance(String name){
        if(instance==null){
            instance=new Name(name);
        }
        return instance;
    }
    public String getName(){
        return name;
    }
}
