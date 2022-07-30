package observer.weatherObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xu on 08/07/2017.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    Observable ob;
    private float temperature;
    private float humidity;

    // we've changed the update() method to take both OBSERVABLE and the optional data argument
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {// we first make sure the obs is of type WeatherData and
            WeatherData wd = (WeatherData) obs;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();// we use the getter methods to get tmp and humidity

            display();// call display() method
        }
    }

    // our constructor now takes an OBSERVABLE and use this to
    //add the current conditions object as an OBSERVER
    public CurrentConditionDisplay(Observable observable) {
        this.ob = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("- - - - - Current Conditions - - - - - ");
        System.out.println(temperature + " F degrees and " + humidity + "% humidity");
    }
}
