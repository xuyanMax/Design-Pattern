package observer.numberGenerator.generator;

import java.util.Random;

/**
 * Created by xu on 03/02/2018.
 */
public class RandomNumberGenerator extends AbstractNumberGenerator {//模版

    private Random random = new Random();
    private int num;
    @Override
    public int getNumber() {
        return num;
    }

    @Override
    public void execute() {
        for (int i=0; i<20; i++){
            num = random.nextInt(50);
            notifyObservers();
        }

    }
}
