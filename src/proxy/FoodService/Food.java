package proxy.FoodService;

public abstract class Food {
    protected String spicy;
    protected String salt;

    protected String condiment;

    public String getSpicy() {
        return spicy;
    }

    public void setSpicy(String spicy) {
        this.spicy = spicy;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void addCondiment(String cond) {
        this.condiment = cond;
    }
}
