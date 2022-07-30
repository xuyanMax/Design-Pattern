package proxy.FoodService;

public class FoodServiceProxy implements FoodService {
    //必须持有一个具体实现类, 通过构造方法注入也可以
    private FoodService fs = new FoodServiceImpl();

    //方法包装+功能增强
    @Override
    public Food makeChicken() {
        //钩子方法，具体增强实现
        before();

        Food food = fs.makeChicken();

        after(food);
        return food;
    }

    @Override
    public Food makeNoodle() {
        beforeNoodle();
        Food f = fs.makeNoodle();
        after(f);
        return null;
    }

    public void before() {
    }

    public void beforeNoodle() {
    }

    public void after(Food food) {
        food.addCondiment("---");
    }

}
