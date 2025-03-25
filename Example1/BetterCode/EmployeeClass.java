public class EmployeeClass{
    private String name;
    private int id;
    public EmployeeClass(String name,int id){
        this.name=name;
        this.id=id;
    }
    public static void fetchdata(int id){
       System.err.println("fetcdata ");
    }

    public void UpdateEmployee(int id){
        System.err.println("Update");
    }
}


