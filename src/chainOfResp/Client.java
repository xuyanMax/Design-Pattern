package chainOfResp;

public class Client {
    public static void main(String[] args) {
        RuleHandler newUser = new NewUserRuleHandler();
        RuleHandler userLocation = new LocationRuleHandler();
        Context context = new Context();

        newUser.setSuccessor(userLocation);
        newUser.apply(context);
    }
}
