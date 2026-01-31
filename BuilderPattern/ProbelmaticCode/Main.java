public class Main{
    public static void main(String[] args){
        System.out.println("Builder Pattern revision");
        User user=new User("Alice");

        // User user1=new User("Bob",25);
        //User user 2-new User("Bob",25,"123456789");
        user.display();
    }
}

//Probelm in this is that suppose we have more attributes which are optional like age,phone number,address etc then we have to create
//multiple constructors for different combinations of attributes which leads to code duplication and is not scalable.