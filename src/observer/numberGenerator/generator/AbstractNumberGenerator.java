package observer.numberGenerator.generator;

import observer.numberGenerator.Observer;
import observer.numberGenerator.Subject;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xu on 03/02/2018.
 */
public abstract class AbstractNumberGenerator implements Subject {
    private ArrayList observers = new ArrayList();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()){
            ((Observer)it.next()).update(this);
        }

    }
    public abstract int getNumber();
    public abstract void execute();
}
