public class Main{
    public static void main(String args[]){
        System.out.println("builder pattern revision");

        User user=new User.UserBuilder("John")
                .setAge(30)
                .setPhoneNumber(123456789)
                .setAddress("123 Main St")
                .build();
                user.display();
    }
}