package builder;

public class UserBuilder {
    public static void main(String[] args) {
        User.UserBuilder userBuilder = new User.UserBuilder("Peter", "Yan");
        User xuYan = userBuilder.age(29).phone("18633925188").address("heping").build();
        System.out.println(xuYan);
    }
}
