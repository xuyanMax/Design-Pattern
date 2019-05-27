package observer.numberGenerator;

import observer.numberGenerator.generator.AbstractNumberGenerator;

/**
 * Created by xu on 03/02/2018.
 */
public interface Observer {//观察者
    public abstract void update(AbstractNumberGenerator ng);
}
