package builder;

public class App {
    public static void main(String[] args) {
        User.UserBuilder userBuilder = new User.UserBuilder();
        User xuYan = userBuilder.
                firstName("Peter").
                lastName("Yan").
                age(29).
                phone("186339251XX").
                address("helping").
                build();
        System.out.println(xuYan);
    }
}
