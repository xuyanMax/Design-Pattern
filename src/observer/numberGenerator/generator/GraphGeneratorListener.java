package observer.numberGenerator.generator;

import observer.numberGenerator.Observer;

/**
 * Created by xu on 03/02/2018.
 */
public class GraphGeneratorListener implements Observer {
    private AbstractNumberGenerator ng;

    public GraphGeneratorListener(AbstractNumberGenerator ng) {
        this.ng = ng;
        ng.addObserver(this);
    }

    @Override
    public void update(AbstractNumberGenerator ng) {
        System.out.println("graph server:");
        for (int i=0; i<ng.getNumber(); i++)
            System.out.print("^");
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
