package builder;

public class User {

    // all final attributes
    private final String firstName; //required
    private final String lastName; //required
    private final int age; // optional
    private final String phone; // optional
    private final String address; //optional

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
    }
    // All getters, and NO setters to provide immutability
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder (String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age (int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone (String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address (String address) {
            this.address = address;
            return this;
        }

        // return the finally constructed User object
        public User build() {
            User user = new User(this);
            return user;
        }

        private void validateUserObject(User user) {
            // do some basic validations to check
            // if user object doesn't break any assumptions of systems
        }
    }

}
