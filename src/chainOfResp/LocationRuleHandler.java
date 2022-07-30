package chainOfResp;

public class LocationRuleHandler extends RuleHandler {
    @Override
    public void apply(Context context) {
        boolean allowed = true;//activityService.isSupportedLocation(context.getLocation);
        if (allowed) {
            if (this.getSuccessor() != null)
                this.getSuccessor().apply(context);
        } else throw new RuntimeException("位置不匹配此次活动");
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
