package observer.weatherObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xu on 08/07/2017.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92F;
    private float lastPressure;
    Observable obs;

    public ForecastDisplay(Observable observable) {
        this.obs = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData wd = (WeatherData) o;
            this.lastPressure = currentPressure;
            this.currentPressure = wd.getPressure();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("- - - - - Forecast Display - - - - -");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way");
        }else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        }else {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
