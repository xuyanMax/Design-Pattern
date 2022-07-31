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

    public static UserBuilder builder() {
        return new UserBuilder();
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
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder() {
        }

        public UserBuilder firstName(String name) {
            this.firstName = name;
            return this;
        }

        public UserBuilder lastName(String name) {
            this.lastName = name;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        // return the finally constructed User object
        public User build() {
            if (firstName == null || lastName == null)
                throw new RuntimeException("姓名必填");
            if (age <= 0 || age > 150)
                throw new RuntimeException("年龄不合法");

            User user = new User(this);
            return user;
        }

        private void validateUserObject(User user) {
            // do some basic validations to check
            // if user object doesn't break any assumptions of systems
        }
    }

}
