package observer.numberGenerator;

/**
 * Created by xu on 03/02/2018.
 */
public interface Subject {//观察对象
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
