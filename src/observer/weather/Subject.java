package observer.weather;

/**
 * Created by xu on 07/07/2017.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
