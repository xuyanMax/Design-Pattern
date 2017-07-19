package observer.weatherObservable;


import java.util.Observable;

/**
 * Created by xu on 08/07/2017.
 */
public class WeatherData extends Observable {// we are now subclassing Observable
    private float temperature;
    private float humidity;
    private float pressure;

    // our constructor no longer needs to create a data structure to hold observers
    public WeatherData() {
    }
    public void measurementsChanged(){
    // we now first call setChanged() to indicate the state has changed before calling notifyObservers()
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float tem, float hum, float pre) {
        this.pressure = pre;
        this.humidity = hum;
        this.temperature = tem;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
