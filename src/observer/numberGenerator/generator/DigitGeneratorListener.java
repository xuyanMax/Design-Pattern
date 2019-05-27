package observer.numberGenerator.generator;

import observer.numberGenerator.Observer;

/**
 * Created by xu on 03/02/2018.
 */
public class DigitGeneratorListener implements Observer {
    private AbstractNumberGenerator ng;

    public DigitGeneratorListener(AbstractNumberGenerator ng) {
        this.ng = ng;
        ng.addObserver(this);
    }

    @Override
    public void update(AbstractNumberGenerator ng) {
        System.out.println("Digit server:"+ng.getNumber());
    }
}
