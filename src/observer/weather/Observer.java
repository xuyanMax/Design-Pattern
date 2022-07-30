package observer.weather;

/**
 * Created by xu on 07/07/2017.
 */
public abstract class Observer {
    protected WeatherData wd;

    public abstract void update(float temp, float humidity, float pressure);
}
