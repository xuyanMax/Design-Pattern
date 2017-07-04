package adaptor.ducks;

import java.util.Random;

/**
 * Created by xu on 2017/7/3.
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 0)
            duck.fly();
    }
}
