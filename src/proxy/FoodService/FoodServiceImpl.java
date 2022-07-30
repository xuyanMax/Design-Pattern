package proxy.FoodService;

public class FoodServiceImpl implements FoodService {
    @Override
    public Food makeChicken() {
        Food ck = new Chicken("1kg");
        ck.setSalt("1g");
        ck.setSpicy("1g");

        return ck;
    }

    @Override
    public Food makeNoodle() {

        Food noodle = new Noodle("0.5kg");
        noodle.setSpicy("5g");
        noodle.setSalt("2g");

        return null;
    }
}
