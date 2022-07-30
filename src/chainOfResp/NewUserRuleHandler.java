package chainOfResp;

public class NewUserRuleHandler extends RuleHandler{

    @Override
    public void apply(Context context) {
        if (context.isNewUser()) {
            if (this.getSuccessor() != null)
                this.getSuccessor().apply(context);
        }
        else throw new RuntimeException("仅限新用户");
    }

    @Override
    public void setSuccessor(RuleHandler successor) {
        super.setSuccessor(successor);
    }

    @Override
    public RuleHandler getSuccessor() {
        return super.getSuccessor();
    }
}
