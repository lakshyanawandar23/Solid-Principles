
public class User {

    //Mandatory attribute
    private final String name;
    //optional attributes
    private int age;
    private int phoneNumber;
    private String address;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public void display() {
        System.out.println("User name: " + name);
        System.out.println("User age: " + age);
        System.out.println("User phone number: " + phoneNumber);
        System.out.println("User address: " + address);
    }

    public static class UserBuilder {
        //Mandatory attribute

        private final String name;
        //optional attributes
        private int age;
        private int phoneNumber;
        private String address;
        public UserBuilder(String name) {
            this.name = name;
        }

        public UserBuilder setAge(int age){
            this.age=age;
            return this;
        }

        public UserBuilder setPhoneNumber(int phoneNumber){
            this.phoneNumber=phoneNumber;
            return this;
        }
        public UserBuilder setAddress(String address){
            this.address=address;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}
