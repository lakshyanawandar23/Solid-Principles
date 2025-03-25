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

    public void EmployeeReport(int id){
        System.err.println("Employee Report");
    }

    public void UpdateEmployee(int id){
        System.err.println("Update");
    }

public void CalculateSlary(int id){
    System.err.println("Calculate salary");
}
}

// There are issues in this class that it is handling too many responsiblities and we have to change every time this class .So we always update the class for only one reason