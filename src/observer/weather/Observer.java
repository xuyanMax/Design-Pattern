package observer.weather;

/**
 * Created by xu on 07/07/2017.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
