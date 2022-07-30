package proxy.FoodService;

public class Chicken extends Food {
    String chicken_kg;

    public Chicken(String chicken_kg) {
        this.chicken_kg = chicken_kg;
    }

    public String getChicken_kg() {
        return chicken_kg;
    }

    public void setChicken_kg(String chicken_kg) {
        this.chicken_kg = chicken_kg;
    }
}
